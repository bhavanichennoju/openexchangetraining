package com.test4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteFrameworkExample {

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
		ExecutorService executorService=Executors.newSingleThreadExecutor();//Creating ExecutorService
		Runnable runnable=()->{
			System.out.println(Thread.currentThread().getName());
			
		};
		executorService.submit(runnable);

	}

}
