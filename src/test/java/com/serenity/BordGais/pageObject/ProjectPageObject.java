package com.serenity.BordGais.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProjectPageObject extends PageObject{


 	WebElementFacade driver;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/button/span")
	public WebElementFacade loginButton;

	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/div[1]/input")
	public WebElementFacade email;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/div[2]/input")
	public WebElementFacade password;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/button")
	public WebElementFacade signIn;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/p")
	public WebElementFacade errorMessage;
	
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/div[1]/span[1])")
	public WebElementFacade enterYourEmailError;
	
	@FindBy (xpath="//*[@id='root']/div/header/div[1]/div/div/div[1]/form/div[2]/span[1]")
	public WebElementFacade enterYourPasswordError;

    @FindBy (css=".transparent.button.arrow.hide-for-mobile.inline.small") 
    public WebElementFacade logout;
    
    @FindBy (css=".main-title.undefined") 
    public WebElementFacade contactUs;
    
    
    
	
	@FindBy (xpath="//*[@id='root']/div/div/p")
	public WebElementFacade placeHolder;
	
	

}
