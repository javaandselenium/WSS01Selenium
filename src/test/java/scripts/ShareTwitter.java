package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import gernericlib.BaseClass;
import pomPages.CorejavaPage;
import pomPages.SeleniumPage;
import pomPages.SkillraryLoginPage;

public class ShareTwitter extends BaseClass{
	@Test
	public void tc3() throws FileNotFoundException, IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.serachtxtbox(pdata.getData("coursename"));
		s.serachButton();
		
		SeleniumPage sel=new SeleniumPage(driver);
		sel.corejavaCourse();
		
		CorejavaPage c=new CorejavaPage(driver);
		utilies.switchframe(driver);
		c.playButton();
		Thread.sleep(10000);
		c.pauseButton();
		utilies.switchBack(driver);
		c.twittertab();
		
		Assert.assertEquals(driver.getTitle(),pdata.getData("tctitle"));
		
	}

}
