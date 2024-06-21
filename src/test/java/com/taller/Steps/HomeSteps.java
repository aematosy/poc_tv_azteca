package com.taller.Steps;

import com.taller.Pages.*;
import com.taller.Utils.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeSteps extends Base {

    HomePage home = new HomePage(returnDriver());

    @Given("^The user is on home page$")
    public void home() {
        home.validateHomePage();
    }

    @And("^I click on \"Iniciar sesion\" option$")
    public void clickIniciarSesion(){
        home.clickIniciarSesionMenu();
    }

    @And("^I click on \"Iniciar con correo electronico\" option$")
    public void clickEmailOption(){
        home.clickStarWithEmailOption();
    }

    @And("I log in with email {string} and password {string}")
    public void fillEmailPassword(String email, String password){
        home.fillEmailPassword(email, password);
    }

    @Then("^I validate that I have logged in correctly$")
    public void verifyLogoutElements(){
        home.verifyLogoutElements();
    }

    @Then("I validate the error message {string}")
    public void validateFailedLogin(String message){
        home.validateFailedLogin(message);
    }
}
