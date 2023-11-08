package com.genericUtilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
public class ObjectsTS02 {
public ObjectsTS02 (WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
@FindBy(linkText="Drag & Drop Sliders")
private WebElement dragDrop ;
public WebElement getDragDrop() {
	return dragDrop;
}

@FindBy(xpath="//*[@id=\"slider3\"]/div/input")
private WebElement range;
public WebElement getRange() {
	return range;
	
}


@FindBy(xpath="//output[text()='95']")
private WebElement compare;
public WebElement getCompare() {
	return compare;
}
}