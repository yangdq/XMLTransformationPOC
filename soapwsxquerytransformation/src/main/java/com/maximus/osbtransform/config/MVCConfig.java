package com.maximus.osbtransform.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MVCConfig implements WebMvcConfigurer {
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry
//          .addResourceHandler("/resources/**")
//          .addResourceLocations("/resources/"); 
//    }
    
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

	   // Register resource handler for CSS and JS
	   registry.addResourceHandler("/schemas/**").addResourceLocations("classpath:/wsdl/schemas/");

	}
}
