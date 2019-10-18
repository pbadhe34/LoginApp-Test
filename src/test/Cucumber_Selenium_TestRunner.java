package test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"usage","json:testReport.json","junit:target/Cucumber-test.xml","html:reports"},
         monochrome=true,
		features = "Feature"	
		,glue={"stepDefinition"}
		,dryRun = false,
		strict = true		 
		)
 
public class Cucumber_Selenium_TestRunner {
 
}

//plugin = {"pretty","html:reports"},
//plugin = {"usage","html:reports"},
//plugin = {"usage","json:testReport.json"},
//plugin = { "pretty", "junit:target/Cucumber-test.xml" },
//monochrome=true
//format = {"pretty", "html:target/Destination"} )  //Depreceated
//Snippets = SnippetType.CAMELCASE
//SnippetType.UNDERSCORE

/*
 * dryRun option can either set as true or false.
 *  If it is set as true, it means that Cucumber will only checks that every Step mentioned in the Feature File have corresponding code 
 *  written in Step Definition file or not.
 *  
 *  Monochrome
This option can either set as true or false. If it is set as true, ithe console output for the Cucumber test are much more readable. 
And if it is set as false, then the console output is not as readable as it should be

Features Options helps Cucumber to locate the Feature file in the project folder structure. 

Strict: if strict option is set to false then at execution time if cucumber encounters any undefined/pending steps then cucumber does 
not fail the execution and undefined steps are skipped and BUILD is SUCCESSFUL.

Tags
Cucumber run scenarios with a particular tag.
 
@CucumberOptions(
        features = �src/test/features�,
        tags ={�@Webdriver�},...  ) 
        
Running Scenarios without Tag
Cucumber can exclude scenarios with a particular tag by inserting the tilde character before the tag.
For the following command will run all Scenarios without the SoapUI tag.

@CucumberOptions(
                  features = �src/test/features�,
                  tags ={�~@SoapUI�},...  ) 
                  
Logical OR

Separate a list of tags by commas for a Logical OR tag expression.

@RunWith(Cucumber.class)
@CucumberOptions(
                  features = �src/test/features�,
                  tags ={�@SoapUI,@Functional"},...  ) 


Logical AND

Specifying multiple tag arguments creates a logical AND between each tag expression.

@RunWith(Cucumber.class)
@CucumberOptions(
                  features = �src/test/features�,
                  tags ={�@SoapUI","@Functional"},...  ) 
                  
                  AND OR NOT

Specifying multiple tag arguments creates a logical AND between each tag expression.

@RunWith(Cucumber.class)
@CucumberOptions(
                  features = �src/test/features�,
                  tags ={�@SoapUI,@Functional","~@Regression"},...  ) 
*/
 