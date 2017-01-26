package testcases;

import org.junit.Test;

import wrappers.LinkedinWrappers;


public class Testcase1 extends LinkedinWrappers {
	@Test
	public void LinkedinTestCase01() throws InterruptedException{
	linkedInLogin("sanjeevi90@gmail.com","subbumeena90","chrome");
	
	Thread.sleep(3000);
	
	verifyTitle("Welcome! | LinkedIn");
	
	Thread.sleep(3000);
	
	clickByLink("Advanced");
	
	Thread.sleep(3000);
	
	enterById("advs-keywords", "Selenium");
	
	clickByName("submit");
	
	Thread.sleep(3000);
	
	verifyTextByXpath("//*[@id='results_count']/div/p/strong[1]");
	
	verifyTextByXpath("//*[@id='results']/li[1]/div/h3/a");
	
	quitBrowser();
	
	
	}
	
	
}