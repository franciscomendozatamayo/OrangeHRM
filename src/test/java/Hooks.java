import com.CommoMethods.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods{
	
	@Before
	public void setUp() {
		
		startBrowser("chrome");
		
	}// end setUp
	
	@After
	public void tearDown () {
		
		if(driver != null) {
			
			driver.quit();
		}
		
	}// end tearDown

}// end Hooks
