package com.scripts;

import static com.scripts.OpenBrowser.driver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.utility.Utilities;

public class LoginGmail extends OpenBrowser {
	@Test
	public static void loginSearchContent() throws InterruptedException, IOException {

		/** Entered credentials **/
		Utilities.WaitforElement();
		Utilities.EnterValues("login.email", "Email");
		Utilities.ClickElement("login.next");
		Utilities.WaitforElement();
		Utilities.EnterValues("login.password", "Password");
		Utilities.ClickElement("login.passwordnext");
		Utilities.TakeScreenshot();

		/**** Mail search through subject ****/
		Utilities.WaitforElement();
		Utilities.TakeScreenshot();
		Utilities.EnterValues1("mail.subject", "Subject");
		Utilities.WaitforElement();
		Utilities.TakeScreenshot();
		Utilities.ClickElement("mail.mail");
		Utilities.TakeScreenshot();
		Utilities.WaitforElement();
		
		/***** Getting content ****/
		Utilities.TakeScreenshot();
		Utilities.WaitforElement();
		Utilities.GetContent();
		Utilities.TakeScreenshot();
		System.out.println(Utilities.GetContent());
	}

}
