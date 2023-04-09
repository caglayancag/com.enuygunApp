package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.flyPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class flyDepartment {

    flyPage flyPage = new flyPage();
    Actions actions = new Actions(Driver.getAppiumDriver());

    @Given("User goes to app home page")
    public void user_goes_to_app_home_page() {
        Driver.getAppiumDriver();
    }

    @Given("Clicks {string} button")
    public void clicks_button(String string) {
        ReusableMethods.bekle(3);
        flyPage.travelStart.click();

    }

    @Given("Clicks Sign in with Google button")
    public void clicks_sign_in_with_google_button() {
        ReusableMethods.bekle(3);
        flyPage.sigInInGoogle.click();

    }

    @Given("Selects the account to login")
    public void selects_the_account_to_login() {
        ReusableMethods.bekle(3);
        flyPage.myAccountSelected.click();
        flyPage.noticPermission.click();

    }

    @Given("Selects the {string} option")
    public void selects_the_option(String string) {
        flyPage.singleSelected.click();
        ReusableMethods.bekle(3);
    }

    @Given("Clicks the From Where button")
    public void clicks_the_from_where_button() {
        flyPage.fromWhereButton.click();
        ReusableMethods.bekle(3);
    }

    @Given("Clicks {string} on the warning screen")
    public void clicks_on_the_warning_screen(String string) {
        flyPage.permissionWhileUsing.click();
//        flyPage.popupOkClict.click();
    }

    @Given("Type {string} in the search box and search")
    public void type_in_the_search_box_and_search(String string) {
        flyPage.searchField.sendKeys(string);
        ReusableMethods.bekle(2);
    }

    @Given("Selects {string}")
    public void selects(String string) {

        switch (string) {

            case "SAW": {
                flyPage.SAWSelect.click();
                break;
            }
            case "ESB": {
                flyPage.ESBSelect.click();
                break;
            }

        }

        ReusableMethods.bekle(3);

    }

    @Given("Clicks the Where To button")
    public void clicks_the_where_to_button() {
        flyPage.whereButton.click();
        ReusableMethods.bekle(2);
    }

    @Given("Clicks the Date button")
    public void clicks_the_date_button() {
        flyPage.dateButton.click();
    }

    @Given("Selects the date {int} {string} {int}")
    public void selects_the_date(Integer int1, String string, Integer int2) {

        ReusableMethods.bekle(3);
        TouchAction touchAction = new TouchAction(Driver.getAppiumDriver())
                .press(PointOption.point(538, 2139))
                .moveTo(PointOption.point(555, 1567))
                .release()
                .perform();
        ReusableMethods.bekle(3);

        TouchAction touchAction2 = new TouchAction(Driver.getAppiumDriver());
        touchAction.press(PointOption.point(850, 1708))
                .waitAction(waitOptions(Duration.ofMillis(100)))
                .release()
                .perform();

    }

    @Given("Clicks on the Find cheap tickets button")
    public void clicks_on_the_find_cheap_tickets_button() {
        ReusableMethods.bekle(3);
        flyPage.findCheapTicket.click();
    }

}
