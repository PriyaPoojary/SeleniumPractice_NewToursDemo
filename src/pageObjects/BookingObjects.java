package pageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingObjects {
	
	@FindBy(name = "tripType")
	 private List<WebElement> radioTripType;
	
	@FindBy(name = "passCount")
	 private WebElement selectPassCount;
	
	@FindBy(name = "fromPort")
	 private WebElement selectFromPort;
	
	@FindBy(name = "fromMonth")
	 private WebElement selectFromMonth;
	
	@FindBy(name = "fromDay")
	 private WebElement selectFromDay;
	
	@FindBy(name = "toPort")
	 private WebElement selectToPort;
	
	@FindBy(name = "toMonth")
	 private WebElement selectToMonth;
	
	@FindBy(name = "toDay")
	 private WebElement selectToDay;
	
	@FindBy(name = "servClass")
	 private List<WebElement> radioServClass;
	
	@FindBy(name = "airline")
	 private WebElement selectAirline;
	
	@FindBy(name = "findFlights")
	 private WebElement continueBtn;
	
	public void setFlightDetails(String _passCount, String _fromPort, String _toPort) {
		Iterator<WebElement> itr = radioTripType.iterator();
		while(itr.hasNext()) {
			radioTripType.get(1).click();
			break;
		}	
		selectPassCount.sendKeys(_passCount);
		selectFromPort.sendKeys(_fromPort);
		selectFromMonth.sendKeys("April");
		selectFromDay.sendKeys("7");
		selectToPort.sendKeys(_toPort);
		selectToMonth.sendKeys("July");
		selectToDay.sendKeys("10");		
	}
	
	public void setPreferences(String _airline){
		Iterator<WebElement> itr = radioServClass.iterator();
		while(itr.hasNext()) {
			radioServClass.get(1).click();
			break;
		}
		selectAirline.sendKeys(_airline);
	}
	
	public void clickContinueButton(){
		continueBtn.click();
	}
}