package me.sseob;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/*
	EnableWebMvc을 사용하면 DelegatingWebMvcConfiguration를 import를 하기때문에
	WebMvcConfigurationSupport class가 여러가지 기본 전략들을 등록시켜준다.
	Dispatcherservlet.properties file에 정의되어있는 기본전략 이외에 여러가지 부분들도.
	
	Bean 들을 일일이 등록하는것이 아니라 편리하게 등록이 가능하다.
	
	WebMvcConfigurer를 통해 @EnableWebMvc가 Delegation구조로 import하는 여러가지 Bean설정을 customize할 수 있다.
 */
@Configuration
@ComponentScan
@EnableWebMvc 
public class WebConfig implements WebMvcConfigurer {

	
}
