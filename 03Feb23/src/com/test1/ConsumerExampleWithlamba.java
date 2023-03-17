package com.test1;

import java.util.function.Consumer;

public class ConsumerExampleWithlamba {

	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> System.out.println("the consumer value " + t);
		consumer.accept("string type");
	}

}
