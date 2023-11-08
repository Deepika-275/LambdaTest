package com.genericUtilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjTS03 {
	public ObjTS03 (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	@FindBy(linkText="Input Form Submit")
	private WebElement inputForm;
	public WebElement getInputForm() {
		return inputForm;
	}

@FindBy(xpath="//button[text()='Submit']")
private WebElement submitBtn;
public WebElement getSubmitBtn() {
	return submitBtn;
}

@FindBy(id="name")
private WebElement nameText;
public WebElement getNameText() {
	return nameText;
}

@FindBy(id="inputEmail4")
private WebElement emailText;
public WebElement getEmailText() {
	return emailText;
}

@FindBy(id="inputPassword4")
private WebElement pswrdText;
public WebElement getPswrdText() {
	return pswrdText;
}

@FindBy(id="company")
private WebElement companyText;
public WebElement getCompanyText() {
	return companyText;
}

@FindBy(id="websitename")
private WebElement websiteText;
public WebElement getWebsiteText() {
	return websiteText;
}

@FindBy(id="inputCity")
private WebElement cityText;
public WebElement getCityText() {
	return cityText;
}

@FindBy(id="inputAddress1")
private WebElement add1Text;
public WebElement getAdd1Text() {
	return add1Text;
}

@FindBy(id="inputAddress2")
private WebElement add2Text;
public WebElement getAdd2Text() {
	return add2Text;
}

@FindBy(id="inputState")
private WebElement stateText;
public WebElement getStateText() {
	return stateText;
}

@FindBy(id="inputZip")
private WebElement zipcodeText;
public WebElement getZipcodeText() {
	return zipcodeText;
}

@FindBy(name="country")
private WebElement countrySelect;
public WebElement getCountrySelect() {
	return countrySelect;
}

@FindBy(xpath="//p[text()='Thanks for contacting us, we will get back to you shortly.']")
private WebElement message;
public WebElement getMessage() {
	return message;
}

}
