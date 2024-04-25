package magento.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import magento.utils.ConfigReader;
import magento.utils.Driver;

public class Hooks {

    @Before
    public void setUp() {
        String URL= ConfigReader.readFromConfig("url");
        Driver.getDriver().get(URL);
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }
}
