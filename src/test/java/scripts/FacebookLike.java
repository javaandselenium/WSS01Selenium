package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import gernericlib.BaseClass;
import pomPages.Facebookpage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class FacebookLike extends BaseClass{
	@Test
	public void tc2() throws FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillrarydemoApp();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilies.switchTabs(driver);
		utilies.dropDown(sd.getTestingdd(),pdata.getData("coursedd"));
	
		TestingPage t=new TestingPage(driver);
		utilies.dragDrop(driver,t.getSeleniumtraining(),t.getCartBtn());
	  WebElement loc = t.getFacebookbtn();
	 Point gloc = loc.getLocation();
	 int x=gloc.getX();
	 int y=gloc.getY();
		utilies.scrollbar(driver, x, y);
	    t.facebook();
	    
	   Facebookpage fb=new Facebookpage(driver);
	   fb.likeButton();
	}

}
