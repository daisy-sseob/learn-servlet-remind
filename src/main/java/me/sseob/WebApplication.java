package me.sseob;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * <servlet>
 *   <servlet-name>app</servlet-name>
 *   <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
 *   <init-param>
 *     <param-name>contextClass</param-name>
 *     <param-value>org.springframework.web.context.support.AnnotationConfigWebApplicationContext</param-value>
 *   </init-param>
 *   <init-param>
 *     <param-name>contextConfigLocation</param-name>
 *     <param-value>me.sseob.WebConfig</param-value>
 *   </init-param>
 * </servlet>
 *
 * <servlet-mapping>
 *   <servlet-name>app</servlet-name>
 *   <url-pattern>/app/*</url-pattern>x
 * </servlet-mapping>
 * 
 * 위 내용의 web.xml을 대신하는 config파일을 생성했다.
 * 
 * DispatcherServlet의 기본 전략들은 DispatcherServlet.properties에 정의되어있다.
 * 어떠한 HandlerMapping, HandlerAdaptor, ViewResolver 등등 을 사용할껀지.
 */
public class WebApplication implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		
		/*
			@EnableWebMvc를 사용하여 설정시 
			이 dispatcher servlet이 사용하는 Application context의 servletcontext가 설정이 되어있어야함.
			이유는 WebMvcConfigurationSupport에서 ServletContext를 참조하여 동작하는 부분들이 있기 때문에
			servletcontext를 정해주지않으면 Bean설정이 제대로 되지않는다.
		 */
		context.setServletContext(servletContext);
		context.register(WebConfig.class);
		context.refresh();

		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		ServletRegistration.Dynamic app = servletContext.addServlet("app", dispatcherServlet);
		app.addMapping("/app/*");
	}
}
