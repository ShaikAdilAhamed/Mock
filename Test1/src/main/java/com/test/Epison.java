package com.test;

import org.springframework.stereotype.Component;

@Component(value = "Epison")
public class Epison  implements Printer{

	@Override
	public void printDocument(String document) {
		System.out.println("Epison Print Document...");
		
	}

	@Override
	public void scanDocument(String document) {
		System.out.println("Epison Scan Document");
		
	}

	@Override
	public void faxDocument(String document) {
		System.out.println("Epison Fax Document");
		
	}

}
