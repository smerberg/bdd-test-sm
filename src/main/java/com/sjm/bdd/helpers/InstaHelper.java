package com.sjm.bdd.helpers;

import com.sjm.bdd.pages.InstaPage;

import static org.assertj.core.api.Assertions.assertThat;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class InstaHelper extends ScenarioSteps {
    
    InstaPage instaPage;
    
    @Step
    public void doLogin() {
      instaPage.clickLogInLink();
      instaPage.waitForLoginButton();
      instaPage.enterUsername("something");
      instaPage.enterPassword("somethingelse");
      instaPage.clickLogInButton();
      assertThat(instaPage.checkLoginError()).isTrue();
    }
    
    @Step
    public void open() {
      instaPage.open();
    }
    
    //this method appears to run successfully (no errors thrown), but doesn't actually perform any of the page interactions
    public void doSignUp() throws Exception {
      instaPage.clickSignUpLink();
      instaPage.enterEmailOrPhone("not really an email");
      instaPage.enterFullName("not really a name");
      Thread.sleep(5000);
    }
    
    //this method runs successfully
    public void doOtherSignUp() throws Exception {
      instaPage.clickSignUpLink2();
      instaPage.enterEmailOrPhone2("maybe an email");
      instaPage.enterFullName2("maybe a name");
      Thread.sleep(5000);
    }

}
