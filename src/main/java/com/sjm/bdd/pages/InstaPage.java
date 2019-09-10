package com.sjm.bdd.pages;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;

public class InstaPage extends PageObject {
    
    @FindBy(css = "input[name='username']")
    private WebElementFacade usernameInput;
    
    @FindBy(css = "input[name='password']")
    private WebElementFacade passwordInput;
    
    @FindBy(xpath = "//a[contains(@href, 'signup')]")
    private WebElementFacade signUpLink;
    
    @FindBy(xpath = "//a[contains(@href, 'login')]")
    private WebElementFacade logInLink;
    
    @FindBy(css = "input[name='emailOrPhone']")
    private WebElementFacade emailOrPhoneInput;
    
    @FindBy(css = "input[name='fullName']")
    private WebElementFacade fullNameInput;
    
    @FindBy(xpath = "//button[div[contains(text(), 'Log In')]]")
    private WebElementFacade logInButton;
    
    @FindBy(id = "slfErrorAlert")
    private WebElementFacade loginError;
    
    public InstaPage(WebDriver driver) {
        super(driver);
      }
    
    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }
    
    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }
    
    public void clickSignUpLink() {
        signUpLink.click();
    }
    
    public void clickSignUpLink2() {
        find(By.xpath("//a[contains(@href, 'signup')]")).click();
    }
    
    public void clickLogInLink() {
        logInLink.click();
    }

    public void enterEmailOrPhone(String emailOrPhone) {
        emailOrPhoneInput.sendKeys(emailOrPhone);
    }
    
    public void enterEmailOrPhone2(String emailOrPhone) {
        find(By.cssSelector("input[name='emailOrPhone']")).sendKeys(emailOrPhone);
    }
    
    public void enterFullName(String fullName) {
        fullNameInput.sendKeys(fullName);
    }
    
    public void enterFullName2(String fullName) {
        find(By.cssSelector("input[name='fullName']")).sendKeys(fullName);
    }
    
    public void clickLogInButton() {
        logInButton.click();
    }
    
    public boolean checkLoginError() {
        return loginError.getText().equals("Sorry, your password was incorrect. Please double-check your password.");
    }
    
    public void waitForLoginButton() {
        logInButton.waitUntilVisible();
    }
}
