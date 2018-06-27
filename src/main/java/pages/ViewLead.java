package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods {
	
	public ViewLead()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="viewLead_firstName_sp") 
	private WebElement firstNameViewLead;
	
	public ViewLead verifyFirstName(String data)
	{
		verifyExactText(firstNameViewLead, data);
		return this;
	}
	
}
