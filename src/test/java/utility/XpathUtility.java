package utility;

public class XpathUtility {

    // Login
    public static final String usernameField = "//*[@id=\"username\"]";
    public static final String passwordField = "//*[@id=\"login\"]";
    public static final String loginButton = "//*[@class=\"form-button\"]";

    // Customers Module`s
    public static final String customersTab = "//*[@onclick=\"return false\"]//span[text()=\"Customers\"]";
    public static final String manageCustomerLink = "//*[text()=\"Manage Customers\"]";
    public static final String customerGroupsLink = "//*[text()=\"Customer Groups\"]";
    public static final String onlineCustomersLink = "//*[text()=\"Online Customers\"]";
    // in Manage Customers
    public static final String addNewCustomerButton = "(//*[text()=\"Add New Customer\"])[1]";
    public static final String resetFilterButton = "//*[@id=\"id_572051a64f93bd83c171502975828352\"]";
    public static final String searchButton = "//*[@id=\"id_4014cb60d4954d65845677f497b80dec\"]";

    public static String customerEmail;
    public static final String customerEditButton = "(//td[text()[normalize-space()='" + customerEmail + "']]/following::td[@class=' last']//a)[1]";

    public static final String nameSearchBox = "//*[@id=\"customerGrid_filter_name\"]";
    public static final String emailSearchBox = "//*[@id=\"customerGrid_filter_email\"]";
    public static final String telephoneSearchBox = "//*[@id=\"customerGrid_filter_Telephone\"]";
    public static final String zipSearchBox = "//*[@id=\"customerGrid_filter_billing_postcode\"]";




}
