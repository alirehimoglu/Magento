package magento.utils;

import net.datafaker.providers.base.Marketing;

public class XpathUtil {

//login credential

    public static final String customerUsernameField = "//*[@id='username']";
    public static final String passwordField = "//*[@id='login']";
    public static final String loginButton = "//*[@value='Login']";

    //Customers Xpath
    public static final String customersLink = "//*[@id='nav']//*[text()='Customers']";
    public static final String manageCustomerLink = "//*[@id='nav']//*[text()='Manage Customers']";
    public static final String addCustomerButton = "//*[text()='Add New Customer']";
    public static final String associateToWebsiteField="//*[@id='_accountwebsite_id']";
    public static final String groupField="//*[@name='account[group_id]']";
    public static final String prefixField="//*[@id='_accountprefix']";
    public static final String firstNameField="//*[@id='_accountfirstname']";
    public static final String middleNameField="//*[@id='_accountmiddlename']";
    public static final String lastNameField="//*[@id='_accountlastname']";
    public static final String suffix="//*[@id='_accountsuffix']";
    public static final String emailField="//*[@id='_accountemail']";
    public static final String dateOfBirthField="//*[@id='_accountdob']";
    public static final String taxNumberField="//*[@id='_accounttaxvat']";
    public static final String genderField="//*[@id='_accountgender']";
    public static final String sendEmailCheckBox="//*[@id='_accountsendemail']";
    public static final String sendFromField="//*[@id='_accountsendemail_store_id']";
    public static final String managementPasswordField="//*[@id='_accountpassword']";
    public static final String autoGeneratedPasswordField="//*[@id='account-send-pass']";
    public static final String resetButton="//*[@id='id_3601349b172a9082be048ce0d60cbe53']/following::span[1]";
    public static final String saveCustomerButton="//*[@title='Save Customer']";
    public static final String saveAndContinueEditButton="//*[@id='id_3601349b172a9082be048ce0d60cbe53']/following::span[7]";
    public static final String addCustomersSuccessMessage="//*[text()='The customer has been saved.']";

    //**************************************************************************************************************************
    // Store Module
    public static final String ordersUnderSales= "//ul[@id='nav']//li[@class='parent level0']";
    public static final String createNewOrderButton= "//button[@title='Create New Order'][not(ancestor::div[contains(@class,'content-header-floating')])]";
    public static final String storeEmailField= "//input[@name='email']";
    public static final String searchButton= "//td[@class='filter-actions a-right']//button[@type='button'][2]//span//span//span['Search']";
    public static final String correctCustomer= "//table[@class='data']//tr[@title='287']";
    public static final String carButton= "//div[@class='fieldset']//input[@id='store_13']";
    public static final String billingAddressFirstNameField= "//fieldset[@class='np']//input[@id='order-billing_address_firstname']";
    public static final String billingAddressLastNameFiled= "//fieldset[@class='np']//input[@id='order-billing_address_lastname']";
    public static final String billingAddressStreetAddressField= "//fieldset[@class='np']//input[@id='order-billing_address_street0']";
    public static final String billingAddressCityField= "//fieldset[@class='np']//input[@id='order-billing_address_city']";
    public static final String billingAddressPostalCodeField= "//fieldset[@class='np']//input[@id='order-billing_address_postcode']";
    public static final String billingAddressTelephoneField= "//fieldset[@class='np']//input[@id='order-billing_address_telephone']";
    public static final String addProductsButton= "//div[@id='order-items']//span['Add Products']";
    public static final String productNameField= "//table[@id='sales_order_create_search_grid_table']//tr[@class='filter']//th[2]//div//input[@name='name']";
    public static final String searchProductButton= "//button[@id='id_b9838c292187bc65c4ff5f618d5f3c2b']";

    // Catalog Xpath
    public static final String addProductButton="//*[text()='Add Product']";
    public static final String attributeSet="//*[@id='attribute_set_id']";
    public static final String productType="//*[@id='product_type']";
    public static final String continueButton="//*[text()='Continue']";
    public static final String newProductName="//*[@id='name']";
    public static final String newProductDescription="//*[@id='description']";
    public static final String shortDescription="//*[@id='short_description']";
    public static final String SKUField="//*[@id='sku']";
    public static final String weightField="//*[@id='weight']";
    public static final String setProductAsNewFromDate="//*[@id='news_from_date']";
    public static final String setProductAsNewToDate="//*[@id='news_to_date']";
    public static final String newProductStatus="//*[@id='status']";
    public static final String URLKey="//*[@id='url_key']";
    public static final String visibility="//*[@id='visibility']";
    public static final String countryOfManufacture="//*[@id='country_of_manufacture']";
    public static final String saveAndContinueEdit="//*[text()='Save and Continue Edit']";
    public static final String newProductPrice="//*[@id='price']";
    public static final String taxClass="//*[@id='tax_class_id']";
    public static final String theProductHasBeenSaved="//*[text()='The product has been saved.']";

    // ========================================================================================================
    // Marketing Module Xpath
    // Case_1
    public static final String promotionsTab = "//*[text()='Promotions']";
    public static final String catalogPriceRulesLink = "//*[text()='Catalog Price Rules']";
    public static final String addNewRuleButton = "//*[text()='Add New Rule']";
    public static final String ruleNameField = "//*[@id=\"rule_name\"]";
    public static final String descriptionField = "//*[@id=\"rule_description\"]";
    public static final String statusSelect = "//*[@id=\"rule_is_active\"]";
    public static final String websiteSelect = "//*[@id=\"rule_website_ids\"]";
    public static final String customerGroupsSelect = "//*[@id=\"rule_customer_group_ids\"]";
    public static final String fromDateField = "//*[@id=\"rule_from_date\"]";
    public static final String toDateField = "//*[@id=\"rule_to_date\"]";
    public static final String priorityField = "//*[@id=\"rule_sort_order\"]";
    public static final String saveButton = "//*[@id=\"id_925ad6cc24ed65daa76ad943dcbf34b6\"]";
    public static final String saveAndApplyButton = "//*[@id=\"id_66bc65c929a3a017b17933b3da5c6cb1\"]";
    public static final String ResetButton = "//*[@id=\"id_2e6ac8017ffcc4fe6e22c1f9a76f6cc9\"]";
    public static final String backButton = "//*[@id=\"id_26787021ac0cdd0bae5220dcc586436c\"]";
    public static final String SaveAndContinueEditButton = "//*[@id=\"id_dc6d6131efbbb79dc89132653d289d1d\"]";
    // Marketing Module Xpath
    // Case_2
    public static final String shoppingCartPriceRulesLink = "//*[text()='Shopping Cart Price Rules']";
    public static final String cart_addNewPriceRuleButton = "//*[@id=\"id_99953a4d12e54b4e6533346324137535\"]";
    public static final String cart_ruleNameField = "//*[@id=\"rule_name\"]";
    public static final String cart_descriptionField = "//*[@id=\"rule_description\"]";
    public static final String cart_statusSelect = "//*[@id=\"rule_is_active\"]";
    public static final String cart_websiteSelect = "//*[@id=\"rule_website_ids\"]";
    public static final String cart_customerGroupsSelect = "//*[@id=\"rule_customer_group_ids\"]";
    public static final String cart_couponSelect = "id=\"rule_coupon_type\"";
    public static final String cart_usesPerCustomerField = "//*[@id=\"rule_uses_per_customer\"]";
    public static final String cart_fromDateField = "//*[@id=\"rule_from_date\"]";
    public static final String cart_toDateField = "id=\"rule_to_date\"";
    public static final String cart_priorityField = "//*[@id=\"rule_sort_order\"]";
    public static final String cart_publicInRSSFeesSelect = "//*[@id=\"rule_is_rss\"]";
    public static final String cart_saveButon = "//*[@id=\"id_f3a542ca8898abba7be51bbee334a253\"]";
    public static final String cart_resetButton = "//*[@id=\"id_f73194fa581706e6a647dec9adc9e8a5\"]";
    public static final String cart_backButton = "//*[@id=\"id_7802c98b6469e1b0858855b8eae5dd01\"]";
    public static final String cart_saveAndContinueEditButton = "//*[@id=\"id_d45375fc3a9931847bf59da0f1091b7d\"]";



}
