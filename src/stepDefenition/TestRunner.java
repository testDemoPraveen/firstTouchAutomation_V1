package stepDefenition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/FirstTouchLogin.feature", format = { "pretty", "html:firstTouchReport" })
public class TestRunner {

}
