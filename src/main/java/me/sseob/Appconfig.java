package me.sseob;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * ContextLoaderListener가 만들어줄 ApplicationContext 즉 Root WebApplicationContext의 설정 파일이 될 것.
 * 어떠한 Bean들을 Conponent Scan 할 것인가 ?? 
 * Controller를 제외한 Bean을 등록시키기 위해. Controller를 제외한다.
 */
@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class)) //controller는 bean으로 등록하지 않는다.
public class Appconfig {
	
}
