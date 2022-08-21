package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements {
    public LoginPageElements(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "mat-input-0" )
    public WebElement emailInput;

    @FindBy(id = "mat-input-1")
    public WebElement passwordInput;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginButton;




}
