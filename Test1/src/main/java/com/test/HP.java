package com.test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class HP implements Printer{

	@Override
	public void printDocument(String document) {
		System.out.println("HP Print Document...");
		
	}

	@Override
	public void scanDocument(String document) {
		System.out.println("HP Scan Document");
		
	}

	@Override
	public void faxDocument(String document) {
		System.out.println("HP Fax Document");
		
	}

}
