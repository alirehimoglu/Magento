package magento.modules.base;

import magento.utils.ConfigReader;
import magento.utils.UiUtil;

public class BasePage {
    public void loginByRole(String role){
        //rewrite logic for magento
        UiUtil.getElement("//*[@id='username']").sendKeys(ConfigReader.readFromConfig(role));
        UiUtil.getElement("//*[@id='login']").sendKeys(ConfigReader.readFromConfig("password"));
        UiUtil.clickElement("//*[@value='Login']");
    }
}
