package magento.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import magento.modules.base.BasePage;

public class BaseStep {
    BasePage basePage = new BasePage();
    @Given("user logs in as {string}")
    public void loginAsUser(String role) {
        basePage.loginByRole(role);
    }
    @Then("user is logged in successfully")
    public void userLoggedIn(){
        //this is just an example, write correct logic for verification
        try {
            Thread.sleep(2000);

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("successful");
    }
}
