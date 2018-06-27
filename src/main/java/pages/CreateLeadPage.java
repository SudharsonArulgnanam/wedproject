package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLeadPage writeCompanyName(String data) {
		type(eleCompanyName,data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeadPage writeFirstName(String data) {
		type(eleFirstName,data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	
	public CreateLeadPage writeLastName(String data) {
		type(eleLastName,data);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//input[@class='smallSubmit']")
	private WebElement eleClickSubmitButton;
	
	public ViewLead  clickSubmitCreateButton() {
		click(eleClickSubmitButton);
		return new ViewLead();		
	}

	
	}
	

