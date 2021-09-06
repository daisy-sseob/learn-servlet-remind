package me.sseob;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * serlvet context의 life cycle event를 감지할 수 있는 interface
 */
public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context intialized");
		sce.getServletContext().setAttribute("name", "sseob");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context destroyed");
	}
}