package utils;

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

}
