package com.maximus.osbtransform.config;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.maximus.osbtransform.service.async.CustomAsyncExceptionHandler;

@Configuration
@EnableAsync
public class SpringAsyncConfig implements AsyncConfigurer{

	   @Override
	    public Executor getAsyncExecutor() {
		   ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		   executor.initialize();
		   executor.setMaxPoolSize(5);
		   return executor;
	    }
	   
	   @Override
	   public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
	       return new CustomAsyncExceptionHandler();
	   }
}
