package com.base.creation;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class OrderNumberClass extends BookAHotel {
		
	public void functionClick(WebElement element) {
		element.click();
	}
	public void readData(WebElement element) throws IOException {
	String Ordernumber = element.getAttribute("value");
		System.out.println(Ordernumber);
		BaseClassCreation bc = new BaseClassCreation();
		bc.updateData(18, 1, Ordernumber);
		
	}
	public void sleepTime() throws InterruptedException {
		Thread.sleep(5000);
	}
	
		
		
	
	

}
