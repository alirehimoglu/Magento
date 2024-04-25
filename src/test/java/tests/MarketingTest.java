package tests;

import magento.modules.marketing.MarketingPage;
import org.testng.annotations.Test;

public class MarketingTest {

    MarketingPage marketingPage = new MarketingPage();

    @Test
    public void addNewCatalogPriceRuleTest(){

        marketingPage.managerCanAddNewCatalogPriceRule();

    }

    @Test
    public void addNewCartPriceRuleTest(){

        marketingPage.managerCanAddNewCartPriceRule();

    }


}
