package com.globalSQA;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoIbibo {
	@Test
	public void SearchBus() {
		MainPage mp = new MainPage();
		mp.openApllication("https://www.goibibo.com/bus/");

		mp.clickOnElement("//*[@id='root']/section/section/section[1]/section/div[3]/div/input");

		mp.clickOnElement("//*[@id=autosuggestBusSRPSrcHome]");
		mp.enterDataInTextField("//*[@id=autosuggestBusSRPSrcHome]", "Pune");
		
		mp.clickOnElement("//*[@id=autosuggestBusSRPSrcHome]");
		mp.enterDataInTextField("//*[@id=autosuggestBusSRPSrcHome]", "Pune");
		
		//*[@id='autosuggestBusSRPDestHome']
		String expectedMonth = "July 2023";
		String expectedDay = "19";
		while (true) {
			String month = mp.driver.findElement(By
					.xpath("//*[@id='root']/section/section/section[1]/section/div[3]/div/div[1]/div/div/div[1]/div/p"))
					.getText();
			if (month.equalsIgnoreCase(expectedMonth)) {
				mp.clickListElement(
						"//*[@id='root']/section/section/section[1]/section/div[3]/div/div[1]/div/div/div[2]/div/div/ul[2]/li",
						expectedDay);
				break;
			} else {
				mp.clickOnElement(
						"//*[@id='root']/section/section/section[1]/section/div[3]/div/div[1]/div/div/div[1]/div/div[2]/div");

			}
		}

	}

}
