package org.spring.invo8.soap;

import org.springframework.context.annotation.Configuration;

//@EnableWs
@Configuration
public class ServerConfiguration {

	/* @Bean
	  public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
	    MessageDispatcherServlet servlet = new MessageDispatcherServlet();
	    servlet.setApplicationContext(applicationContext);

	    return new ServletRegistrationBean(servlet, "/codenotfound/ws/*");
	  }

	  @Bean(name = "helloworld")
	  public Wsdl11Definition defaultWsdl11Definition() {
	    SimpleWsdl11Definition wsdl11Definition = new SimpleWsdl11Definition();
	    wsdl11Definition.setWsdl(new ClassPathResource("/wsdl/helloworld.wsdl"));

	    return wsdl11Definition;
	  }*/
}
