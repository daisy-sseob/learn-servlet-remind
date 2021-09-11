package me.sseob;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/*
root context와 servlet context를 나누어 사용할 때에는 이렇게 component caning을 나누어 한다.
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class))
 */

/*
	@Configuration
	@ComponentScan
	@Bean을 통해 bean을 일일이 설정하는 방법보다 쉬운 방법이 있다는 것을 알아두자.
	WebConfig class에서의 bean설정보다 더 나은 방법은 -> WebConfig class로 !
 */
public class WebConfigNotUsed {

	@Bean
	public HandlerMapping handlerMapping() {
		RequestMappingHandlerMapping handlerMapping = new RequestMappingHandlerMapping();
		handlerMapping.setOrder(Ordered.HIGHEST_PRECEDENCE); //가장 높은 우선순위를 부여
		return handlerMapping;
	}

	@Bean
	public HandlerAdapter handlerAdapter() {
		RequestMappingHandlerAdapter handlerAdapter = new RequestMappingHandlerAdapter();
		return handlerAdapter;
	}
	
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
}

