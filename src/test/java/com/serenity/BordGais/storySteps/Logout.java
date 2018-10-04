package com.serenity.BordGais.storySteps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;


import com.serenity.BordGais.userSteps.LogoutUserStepFile;

import net.thucydides.core.annotations.Steps;

public class Logout {
	@Steps
	LogoutUserStepFile bgePO2;
	
	//LOGOUT POSITIVE
	
	
	@Given("Bob a customer is logged into his BGE online account with <validEmail> and <validPassword>")
	public void loginClickSF(String validEmail,String validPassword){
		bgePO2.launchBGEPortal();
		bgePO2.clickLogin();
		bgePO2.emailEnter(validEmail);
		bgePO2.passwordEnter(validPassword);
		bgePO2.signInClick();
		bgePO2.placeHolderPresent();
}	
	@When("Bob, logs out of his BGE online account")
	public void logoutClickL(){
		bgePO2.logoutClick();
		}
	@Then("Bob, is out of his Bord Gais Account")
	public void seesResult(){	
	bgePO2.contactMessage();
	}
	
	//LOGOUT NEGATIVE
	
	
	@Given("Bob, logged into his account with <validEmail> and <validPassword>")
	public void loginClickSF2(String validEmail,String validPassword){
		bgePO2.launchBGEPortal();
		bgePO2.clickLogin();
		bgePO2.emailEnter(validEmail);
		bgePO2.passwordEnter(validPassword);
		bgePO2.signInClick();
		
}
	
	@When("Bob, logs out of his account")
	public void clicksLogout(){
		bgePO2.logoutClick();
		
	}
	
	@Then("Bob, should be logged out of his BGE online account")
	public void LogoutResult(){	
		bgePO2.placeHolderNotPresent();
	}
	
	
}
