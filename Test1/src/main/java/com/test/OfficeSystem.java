package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class OfficeSystem {

	@Autowired
	//@Qualifier(value = "Epison")
	private Printer printer;
	
	void printDocument(String document) {
		printer.printDocument(document);;
	} 
	
	void scanDocument(String document) {
		printer.scanDocument(document);;
	} 
	void faxDocument(String document) {
		printer.faxDocument(document);;
	} 
	
	
}
