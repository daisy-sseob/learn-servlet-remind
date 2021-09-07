package me.sseob;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(excludeFilters = @ComponentScan.Filter(Controller.class)) //controller는 bean으로 등록하지 않는다.
public class Appconfig {
	
}
