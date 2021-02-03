package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Shanthi_bkp\\CRD_Project\\Study Materials\\ManipalPro\\SeleniumManipalPro_CucumberTestProj\\MavenP1\\src\\test\\resources\\Login\\Login.feature"},
glue= {"StepDefinition"},
//tags="@validcase",
monochrome=true,//to make the console output in a better format
dryRun=false,//to check all the methods have been implemented properly
strict=true//to check did i miss any steps is all fine
) 
public class TestRunner {

}
