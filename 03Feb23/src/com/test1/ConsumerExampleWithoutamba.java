package com.test1;

import java.util.function.Consumer;

public class ConsumerExampleWithoutamba {

	public static void main(String[] args) {
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println("the consumer value " + t);

			}
		};
		consumer.accept("string type");
	}

}
//
//Consumer<String> consumer =(t)->System.out.println("the consumer value " + t);