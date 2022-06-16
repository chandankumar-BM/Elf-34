package com.Framework.Library;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Utility_methods extends BaseTest {
    public void Clickmethod(WebElement element){
		element.click();
	}
	public void Enter_value(WebElement element,String value){
		element.sendKeys(value);
	}
	public void Doubleclick(WebElement element){
		Actions Act=new Actions(driver);
		Act.doubleClick().build().perform();
	}
	public void MouseHover(WebElement element){
		Actions Act=new Actions(driver);
		Act.moveToElement(element);
	}
	public void Enter_in_Keyboard(WebElement element){
		Actions Act=new Actions(driver);
		Act.sendKeys(Keys.ENTER).build().perform();
	}
	public void DragandDrop(WebElement element,WebElement element1){
		Actions Act=new Actions(driver);
		Act.dragAndDrop(element, element1);
	}
	public void HoldtheElement(WebElement element){
		Actions Act=new Actions(driver);
		Act.clickAndHold(element);
	}
	public void ReleasetheElement(WebElement element){
		Actions Act=new Actions(driver);
		Act.release(element);
	}
	
}
