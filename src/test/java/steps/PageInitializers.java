package steps;

import pages.DashboardPage;
import pages.LoginPage;

public class PageInitializers {
    public static LoginPage login;
    public static DashboardPage dash;

    public static void intializePageObjects(){
        login = new LoginPage();
        dash = new DashboardPage();

    }
}
