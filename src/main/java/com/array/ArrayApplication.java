package com.array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArrayApplication.class, args);
		ArrayReader arrayReader = new ArrayReader();
		int [] p = {};
		arrayReader.readArray();
	}

}
