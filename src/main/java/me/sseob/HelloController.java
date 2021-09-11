package me.sseob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	private final HelloService helloService;

	@Autowired
	public HelloController(HelloService helloService) {
		this.helloService = helloService;
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello controller !, " + helloService.getName();
	}

	/*
	view 이름을 생략할 수 있다.
	ViewResolver는 view이름을 가지고 실제 view를 찾아내는 interface라면
	RequestToViewNameTranslator interface는 view이름을 명시적으로 처리하지 않아도 view이름을 찾아주는데,
	요청을 기반으로 view이름을 판단한다.
	(DispatcherServlet에 기본적으로 등록되어있다.)
	 */
	@GetMapping("/sample")
	public String sample(){
		return "sample";
	}
}
