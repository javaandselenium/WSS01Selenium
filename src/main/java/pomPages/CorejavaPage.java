package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaPage {

	@FindBy(xpath="//div[@class='play-icon']")
	private WebElement play;
	
	
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pause;
	
	
	@FindBy(xpath="//span[text()='Share via Twitter']")
	private WebElement twitter;
	
	public CorejavaPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void playButton() {
		play.click();
		
	}
	
	public void pauseButton() {
		pause.click();
	}
	
	public void twittertab() {
		twitter.click();
	}
	
	
}
