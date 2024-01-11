package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src/test/java/cucumber",
				  glue="stepDefination",
				  monochrome=true,
				  tags="Regression",
					plugin= {"pretty",
						  "html:target/cucumber.html",
						  "json:result/json/result.json"})

public class TestNGRunner extends AbstractTestNGCucumberTests{

}
