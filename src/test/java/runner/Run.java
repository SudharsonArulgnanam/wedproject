package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/java/features/CreateLead1.feature"},glue="steps", tags= {"@smoke and @regression"})


public class Run {

}
