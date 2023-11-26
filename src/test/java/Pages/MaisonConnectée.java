package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Helper.Config;

public class MaisonConnectée {
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/div[4]/form/div/p/span")
	WebElement Tri;
	@FindBy(xpath="/html/body/div[2]/div[5]/div/div/div[1]/div/div[3]/div/div/div/div[2]/div[2]/h3/a")
	List<WebElement> ListProduct;
	@FindBy(xpath="//*[@id=\"product-16704\"]/div[1]/div/div[1]/div/div[1]/h1")
	WebElement productTitle;
	
	
	
	
	public MaisonConnectée() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void triProduit(String sortTri) {
		Select select= new Select(Tri);
		select.deselectByVisibleText(sortTri);
	}
	
	public void ClickOnProduct (String ProductName) {
		for (WebElement product:ListProduct) {
			if(product.getText().contains(ProductName)) {
				product.click();
			}
		}
		
		
	}
	
	public String VerifTitle() {
		String actualMessage= productTitle.getText();
		return actualMessage;
	}


}
