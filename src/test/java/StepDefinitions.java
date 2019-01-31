import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class StepDefinitions {

    WebDriver driver = new ChromeDriver();



    @Given("^I open the homepage$")

    public void i_open_the_page() throws Exception {
        driver.manage().window().maximize();
        driver.get("http://onliner.by");
    }

    @When("^I click Барахолка$")
    public void i_click_Барахолка() throws Exception {
        driver.findElement(By.linkText("Барахолка")).click();

    }

    @Then("^Барахолка page is opened$")
    public void барахолка_page_is_opened() throws Exception {
        driver.findElement(By.className("b-fleamarket-button"));
    }

}
