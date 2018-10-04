package com.serenity.BordGais.storySteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.serenity.BordGais.userSteps.LoginUserStepFile;

import net.thucydides.core.annotations.Steps;

public class Login {
	
	@Steps
	LoginUserStepFile loginUS;
	

	// LOGIN POSITIVE	
	
	@Given("Bob, a customer")
	public void loginClickSF(){
		loginUS.launchBGEPortal();
		loginUS.clickLogin();
}	
	@When("Bob, logs into his BGE account with <validEmail> and <validPassword>")
	public void enterCredentialsOne(String validEmail,String validPassword){
		loginUS.emailEnter(validEmail);
		loginUS.passwordEnter(validPassword);
		loginUS.signInClick();
	}
	@Then("Bob, should see his BGE account Dashboard")
	public void seeAccount(){
		loginUS.placeHolderPresent();
		loginUS.logoutClick();
	}	
	
	
	// LOGIN NEGATIVE

	@Given("Bob, is a BGE customer")
	public void customerBge() {		
		loginUS.launchBGEPortal();
		loginUS.clickLogin();
	}
	@When("Bob, logs into his BGE account with <invalidEmail> and <invalidPassword>")
	public void enterCredentialsTwo(String invalidEmail,String invalidPassword){
		loginUS.emailEnter(invalidEmail);
		loginUS.passwordEnter(invalidPassword);
		loginUS.signInClick();
	}
	@Then("Bob should see the error message as Incorrect username/password")
	public void errorMessageOne(){
		loginUS.incorrectUP();
	}
	
	@When("Bob, logs into his BGE account with <validEmail> and  <invalidPassword>")
	public void enterCredentialsThree(String validEmail,String invalidPassword){
		loginUS.launchBGEPortal();
		loginUS.clickLogin();
		loginUS.emailEnter(validEmail);
		loginUS.passwordEnter(invalidPassword);
		loginUS.signInClick();
	}
	@Then("Then Bob should see the error message as Incorrect username/password.")
	public void errorMessageTwo(){
		loginUS.incorrectUP();
	}
	@When("Bob, logs into his BGE account with <invalidEmail> and  <validPassword>")
	public void enterCredentialsFour(String invalidEmail,String validPassword){
		loginUS.launchBGEPortal();
		loginUS.clickLogin();
		loginUS.emailEnter(invalidEmail);
		loginUS.passwordEnter(validPassword);
		loginUS.signInClick();
	}
	@Then("Bob should see the error message as Incorrect username/password.")
	public void errorMessageThree(){
		loginUS.incorrectUP();
	}
	@When("Bob, logs into his BGE account without providing valid credentials(empty) and click sign in")
	public void enterCredentialsEmpty(){
		loginUS.launchBGEPortal();
		loginUS.clickLogin();
		loginUS.signInClick();
	}
	@Then("Bob, should see the error message as Please enter your email and Please enter your password")
	public void errorMessageEmpty(){
		loginUS.enterEmailError();
		loginUS.enterPassError();
		
	}
	
}