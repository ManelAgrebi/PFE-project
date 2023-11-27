package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class ListeSouhaits {
	
	@FindBy (xpath="//*[@id=\"shop-now\"]/div[2]/div/div/div/div/a/span")
	WebElement AjoutlistSouhaits;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[4]/div/section/div/div[1]/div/div/div/div/a/i")
	WebElement ListSouhaits;
	
	@FindBy(xpath="/html/body/div[1]/div[5]/section/div/div/div/form/table/tbody/tr/td[2]/a")
	WebElement NomProduit;
	
	
	public ListeSouhaits() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void AddListWish() throws InterruptedException {
		Thread.sleep(3000);
		AjoutlistSouhaits.click();
	}
	
	public void ListDeSouhaits() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(Config.driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(ListSouhaits));
		Thread.sleep(3000);
		ListSouhaits.click();
	}
	
	public String VerifProduct() {
		String VerifNomProduit= NomProduit.getText();
		return VerifNomProduit;
		
	}

	
	

}
