package utility;

public class XpathUtility {

    // Login
    public static final String usernameField = "//*[@id=\"username\"]";
    public static final String passwordField = "//*[@id=\"login\"]";
    public static final String loginButton = "//*[@class=\"form-button\"]";

    // Customers Module`s
    public static final String customersTab = "//*[@onclick=\"return false\"]//span[text()=\"Customers\"]";
    public static final String manageCustomerLink = "//*[@href=\"https://ecommerce.unitedcoderapp.com/index.php/admin/customer/index/key/7002160787ca055e5b6a1e0b0f91f2ed/\"]//span[text()=\"Manage Customers\"]";
    public static final String customerGroupsLink = "//*[@href=\"https://ecommerce.unitedcoderapp.com/index.php/admin/customer_group/index/key/c5c5ba49943988e6b9e45f44feaf4aa0/\"]//span[text()=\"Customer Groups\"]";
    public static final String onlineCustomersLink = "//*[@href=\"https://ecommerce.unitedcoderapp.com/index.php/admin/customer_online/index/key/d3f660a8c01074c953f8274370c5ccb9/\"]//span[text()=\"Online Customers\"]";
    // in Manage Customers
    public static final String addNewCustomerButton = "(//*[text()=\"Add New Customer\"])[1]";
    public static final String resetFilterButton = "//*[@id=\"id_572051a64f93bd83c171502975828352\"]";
    public static final String searchButton = "//*[@id=\"id_4014cb60d4954d65845677f497b80dec\"]";
    public static final String nameSearchBox = "//*[@id=\"customerGrid_filter_name\"]";
    public static final String emailSearchBox = "//*[@id=\"customerGrid_filter_email\"]";
    public static final String telephoneSearchBox = "//*[@id=\"customerGrid_filter_Telephone\"]";
    public static final String zipSearchBox = "//*[@id=\"customerGrid_filter_billing_postcode\"]";




}
