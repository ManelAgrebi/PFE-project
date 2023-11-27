package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectee {
	@FindBy(name="orderby")
	WebElement Tri;
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> ListProduct;
	
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/div/div[3]/div[1]/div/div[3]/div/h3")
	WebElement VerifTitle;
	
	
	
	
	public MaisonConnectee() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public String VerifMessage() {
		String ActualMessage= VerifTitle.getText();
		
		return ActualMessage;
	}
	
	public void triProduit(String sortTri) throws InterruptedException {
		
		Select select= new Select(Tri);
		
		Thread.sleep(3000);
		
		select.selectByVisibleText(sortTri);
		
	}
	
	public void ClickOnProduct (String ProductName) {
		
		for (WebElement product:ListProduct) {
			try {
			if(product.getText().contains(ProductName)) {
				product.click();
			}
		}catch(Exception e) {
			System.out.println(e);
			
		}
		}
			
		
		
		
	}
	
	public String VerifMc() {
		String actualMessage= VerifTitle.getText();
		
		return actualMessage;
	}


}
