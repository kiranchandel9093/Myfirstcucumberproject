package utility;

import org.openqa.selenium.By;

public interface I {

	String baseurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
	//locate
	
	By name  = By.name("username");
	By password = By.name("password");
	By buttonclick = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
}
