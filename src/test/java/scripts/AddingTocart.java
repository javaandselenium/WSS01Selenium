package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import gernericlib.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;

public class AddingTocart extends BaseClass {
	
	@Test
	public void tc1() throws FileNotFoundException, IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gerasButton();
		s.skillrarydemoApp();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilies.switchTabs(driver);
		utilies.mouseHover(driver,sd.getCourse());
		sd.seleniumtraingbtn();
		
		AddtoCartPage a=new AddtoCartPage(driver);
		utilies.doubleClick(driver,a.getPlus());
		a.sumbitButton();
		utilies.alertPopup(driver);
		
		Assert.assertEquals(driver.getTitle(),pdata.getData("tc1title"));
		
	}

}
