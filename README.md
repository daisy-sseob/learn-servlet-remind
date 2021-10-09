# 🕶 Servlet을 학습하고 Remind합니다.

## branch 설명
- servlet-ioc branch 
  - 기본적인 servlet project에 spring 의존성을 추가하고 IOC container와 Dispatcher Servlet을 연동합니다.
  - 설정과 개념에 대해서 집중적으로 학습한 branch입니다.
  - ContextLoaderListener가 등록해주는 ApplicationContext와 DispatcherServlet이 등록하는 ApplicationContext와의 차이점을 학습합니다.
  - Root WebApplicationContext와 Servlet AcpplicationContext에 등록되는 Bean이 달라지도록 세팅되어 있습니다.

- main branch
  - web.xml 설정을 WebApplicationInitializer를 통해 java config로 바꾸었으며
  - Root WebApplicationContext, Servlet ApplicationContext의 상속구조를 걷어내고 MVC 설정이 추가로 입혀진 branch입니다.
