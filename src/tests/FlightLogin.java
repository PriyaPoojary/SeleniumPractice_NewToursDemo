package tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pageObjects.LoginObjects;
import testdata.Constant;
import testdata.ExcelUtils;
import testdata.InitializeBrowser;

public class FlightLogin extends InitializeBrowser{
	
	@Test
	public void FlightLoginTest() {
		LoginObjects login = PageFactory.initElements(driver,LoginObjects.class);
		try {
			ExcelUtils.setExcelFile(Constant.TestData_Path + Constant.TestData_File,"Sheet1");
			login.setUsername(ExcelUtils.getCellData(1, 1));
			login.setPassword(ExcelUtils.getCellData(1, 2));
			login.clickLoginButton();		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}