package tests;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import pageObjects.BookingObjects;
import testdata.Constant;
import testdata.ExcelUtils;
import testdata.InitializeBrowser;

public class FlightBooking  extends InitializeBrowser {

	@Test
	public void BookFlightTest() {
		try {		
			FlightLogin f = new FlightLogin();
			f.FlightLoginTest();
			BookingObjects book = PageFactory.initElements(driver,BookingObjects.class);
			ExcelUtils.setExcelFile(Constant.TestData_Path + Constant.TestData_File,"Sheet1");
			book.setFlightDetails(ExcelUtils.getCellData(2, 1), ExcelUtils.getCellData(2, 2), ExcelUtils.getCellData(2, 3));
			book.setPreferences(ExcelUtils.getCellData(2, 4));
			book.clickContinueButton();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}