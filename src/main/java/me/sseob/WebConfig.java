package me.sseob;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 * Dispatcher Servlet이 등록시켜줄 ApplicationContext. 즉 Servlet WebApplicationContext의 설정.
 */
@Configuration
@ComponentScan(useDefaultFilters = false, includeFilters = @ComponentScan.Filter(Controller.class))
public class WebConfig {
	
}
