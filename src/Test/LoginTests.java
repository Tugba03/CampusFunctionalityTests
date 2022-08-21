package Test;

import POM.HomePageElements;
import POM.LoginPageElements;
import Utils.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTests extends BaseDriver {

    LoginPageElements loginPageElements;
    HomePageElements homePageElements;

    String ExpectedMessage = "Welcome, Tugba Son !";
    String expectedInvalidDataMessage = "Invalid username or password";


    @Test(priority = 1)
    @Parameters({"emailInput", "passwordInput" })
    public void PositiveLoginTest(String userName, String password) {


        homePageElements = new HomePageElements(driver);
        loginPageElements = new LoginPageElements(driver);


        loginPageElements.emailInput.sendKeys(userName);
        loginPageElements.passwordInput.sendKeys(password);
        loginPageElements.loginButton.click();


        String actualWelcomeMessage = homePageElements.welcomeMessage.getText();
        Assert.assertEquals(actualWelcomeMessage, ExpectedMessage);

    }

        @Test(priority = 2)
        @Parameters({"validEmailInput", "invalidPassword"})
        public void negativeLoginTest(String validEmailInput,String invalidPassword){


        homePageElements  = new HomePageElements(driver);
        loginPageElements = new LoginPageElements(driver);


        loginPageElements.emailInput.sendKeys(validEmailInput);
        loginPageElements.passwordInput.sendKeys(invalidPassword);
        loginPageElements.loginButton.click();


       String actualInvalidDataMessage = homePageElements.invalidDataMessage.getText();
       Assert.assertEquals(actualInvalidDataMessage, expectedInvalidDataMessage);

       }

       @Test(priority =  3)
       @Parameters({"invalidEmail", "validPassword"})
        public void negativeLoginTest2(String invalidEmailInput, String validPassword){

           homePageElements  = new HomePageElements(driver);
           loginPageElements = new LoginPageElements(driver);


           loginPageElements.emailInput.sendKeys(invalidEmailInput);
           loginPageElements.passwordInput.sendKeys(validPassword);
           loginPageElements.loginButton.click();


           String actualInvalidDataMessage = homePageElements.invalidDataMessage.getText();
           Assert.assertEquals(actualInvalidDataMessage, expectedInvalidDataMessage);

       }

       @Test(priority = 4)
       @Parameters({"invalidEmailInput", "invalidPassword"})
       public void negativeLoginTest3(String invalidEmail, String invalidPassword){

           homePageElements  = new HomePageElements(driver);
           loginPageElements = new LoginPageElements(driver);

           loginPageElements.emailInput.sendKeys(invalidEmail);
           loginPageElements.passwordInput.sendKeys(invalidPassword);
           loginPageElements.loginButton.click();


           String actualInvalidDataMessage = homePageElements.invalidDataMessage.getText();
           Assert.assertEquals(actualInvalidDataMessage, expectedInvalidDataMessage);

       }
}
