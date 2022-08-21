package POM;

import Utils.BaseDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
    public HomePageElements(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//span[text()=' Welcome, Tugba Son ! ']")
    public WebElement welcomeMessage;

    @FindBy(xpath = "//div[text()='Invalid username or password']")
    public WebElement invalidDataMessage;



}
