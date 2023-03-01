import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
					features = "classpath:Features/OrangeHRM/01_LoginHRM.feature"
					
				 )
public class RunnerTest {

}// end RunnerTest
