package com.vytrack.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I open browser and navigate to vytrack login page");
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        System.out.println("I put user1 username and UserUser123 password and click login button");

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I verify that title changed to Dashboard");
    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() {
        System.out.println("I enter sales manager username and password");
    }

    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        //selenium code will come here
        System.out.println("I enter store manager username and password");

    }


}
