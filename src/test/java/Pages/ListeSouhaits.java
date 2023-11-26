package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ListeSouhaits {
	
	@FindBy (xpath="/html/body/div[2]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/form/div/div[2]/div/div/div/div/a/span")
	WebElement AjoutlistSouhaits;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[4]/div/section/div/div[1]/div/div/div/div/a/i")
	WebElement ListSouhaits;
	
	@FindBy(xpath="//*[@id=\"yith-wcwl-row-16704\"]/td[2]/a")
	WebElement NomProduit;
	
	
	public ListeSouhaits() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void AddListWish() {
		AjoutlistSouhaits.click();
	}
	
	public void ListDeSouhaits() {
		WebDriverWait wait=new WebDriverWait(Config.driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(ListSouhaits));
		ListSouhaits.click();
	}
	
	public String VerifProduct() {
		String VerifNomProduit= NomProduit.getText();
		return VerifNomProduit;
		
	}

	
	

}
