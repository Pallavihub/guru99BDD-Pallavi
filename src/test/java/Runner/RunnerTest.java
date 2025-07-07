package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/FeatureFiles/TC_001_RegisterUser.feature",
		glue="Steps",
		dryRun=false
		)
public class RunnerTest extends AbstractTestNGCucumberTests{

}
