package com.test;

import org.springframework.stereotype.Component;

@Component(value = "Canon")
public class Canon implements Printer{
	@Override
	public void printDocument(String document) {
		System.out.println("Canon Print Document...");
		
	}

	@Override
	public void scanDocument(String document) {
		System.out.println("Canon Scan Document");
		
	}

	@Override
	public void faxDocument(String document) {
		System.out.println("Canon Fax Document");
		
	}
}
