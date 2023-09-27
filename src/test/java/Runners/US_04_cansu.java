package Runners;

import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        //birden fazla tag/grup adı verilebilir
        tags = "@SmokeTest or @Regression", // and dersen sadece her iki etiketi olanı çalıştırır
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class US_04_cansu extends AbstractTestNGCucumberTests {

}
