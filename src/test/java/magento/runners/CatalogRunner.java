package magento.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "magento.steps",
        features = "src/test/resources/Catalog.feature",
        plugin = {
                "html:target/cucumber-html-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }
)
public class CatalogRunner {
}
