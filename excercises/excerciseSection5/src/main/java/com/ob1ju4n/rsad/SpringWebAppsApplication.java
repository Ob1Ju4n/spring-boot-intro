package com.ob1ju4n.rsad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

@SpringBootApplication
public class SpringWebAppsApplication {

	@Bean
	public EmbeddedServletContainerCustomizer containerCustomizer(){

		/*return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
				container.addErrorPages(custom404Page);
			}
		};*/
		return ( container -> {
			ErrorPage custom404Page = new ErrorPage(HttpStatus.NOT_FOUND,"/404.html");
			container.addErrorPages(custom404Page);
		});
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppsApplication.class, args);
	}
}
