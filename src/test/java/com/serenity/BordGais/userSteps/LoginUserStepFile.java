package com.serenity.BordGais.userSteps;

import com.serenity.BordGais.pageObject.ProjectPageObject;
import com.serenity.BordGais.utils.UnifiedResourceLocator;

public class LoginUserStepFile extends ProjectPageObject{

	
	public void launchBGEPortal(){
		//String URL="https://qa.bordgaisenergynew.ie/";
		openAt(UnifiedResourceLocator.url);
	}

	public void clickLogin(){
	
		if(element(loginButton).isCurrentlyVisible())
			element(loginButton).click();	
		else
			System.out.println("Login Button is not enabled.");
		
		
	}
	public void emailEnter(String email2){
		
		if(element(email).isCurrentlyVisible())
		element(email).sendKeys(email2);
		else
			System.out.println("Email TextBox is not enabled.");
	}
	public void passwordEnter(String password2){
		
		if(element(password).isCurrentlyVisible())
		element(password).sendKeys(password2);
		else 
			System.out.println("Password TextBox is not enabled.");
	}
	public void signInClick(){
	
		if(element(signIn).isCurrentlyVisible()){
			element(signIn).click();
			element(logout).waitUntilVisible();
			}
		else
			System.out.println("SignIn Button is not visible");
		}
	
	public void logoutClick() {
//		    if(element(logout).waitUntilPresent())
//			if(element(logout).waitUntilEnabled())
//			if(element(logout).waitUntilVisible())
//			if(element(logout).waitUntilClickable())
		try {
			Thread.sleep(3000);
			 if(element(logout).isCurrentlyVisible())
					element(logout).click();
				else 
					System.out.println("LogOut Button is not enabled.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		}

	public void placeHolderPresent(){
		 if(element(placeHolder).isCurrentlyVisible()){
			 element(placeHolder).getText().equals("This will be where the user will eventually land when they log in... ");
		}
	}
	
	public void placeHolderNotPresent(){
		
		 if(element(placeHolder).isCurrentlyVisible()){
		
			 element(placeHolder).getText().equals("This will be where the user will eventually land when they log in... ");
		}
	}
	
	public void contactMessage(){
//		   if(element(contactUs).waitUntilPresent())
//			if(element(contactUs).waitUntilEnabled())
//			if(element(contactUs).waitUntilVisible())
//			if(element(contactUs).waitUntilClickable())			
//			if(element(contactUs).isCurrentlyVisible())
		try {
			Thread.sleep(3000);
			if(element(contactUs).isCurrentlyVisible())
				element(contactUs).getText().equals("Contact us");
			else
				System.out.println("The Customer is not logged out of his Account");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void incorrectUP(){
		if(element(errorMessage).isCurrentlyVisible())
			element(errorMessage).getText().equals("Incorrect username/password.");
		else
			System.out.println("Incorrect username/password is not visible");
	}
	
	public void enterEmailError(){

	if(element(enterYourEmailError).isCurrentlyVisible())
		element(enterYourEmailError).getText().equals("Please enter your email.");
	else 
		System.out.println("Enter your Email message is not present");
	}
	public void enterPassError(){
		
		if(element(enterYourPasswordError).isCurrentlyVisible())
		element(enterYourPasswordError).getText().equals("Please enter your password.");
		else
			System.out.println("Enter your Password message is not present");
	}	
}
