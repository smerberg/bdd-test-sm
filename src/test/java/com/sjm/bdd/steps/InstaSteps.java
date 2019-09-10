package com.sjm.bdd.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.sjm.bdd.helpers.InstaHelper;

import net.thucydides.core.annotations.Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class InstaSteps {
    
    @Steps
    InstaHelper instaHelper;
    
    @Before
    public void do_before_stuff() {
      instaHelper.open();
    }
    
    @Given("^I want to log in to Instagram$")
    public void i_want_to_log_in_to_Instagram() {
      instaHelper.doLogin();
    }

    @Given("^I purposefully fail the test$")
    public void i_purposefully_fail_the_test() {
      assertThat(true).isFalse();
    }
    
    @After("not @tag3")
    public void do_other_stuff() throws Exception {
      instaHelper.doSignUp();
    }
    
    @After("@tag3")
    public void do_other_other_stuff() throws Exception {
      instaHelper.doOtherSignUp();
    }

}
