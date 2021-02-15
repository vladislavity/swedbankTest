import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.*;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThanOrEqual;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class swedbankTestDefinitions {

    @Given("Open browser with Swedbank loan calculator")
    public void openGoogleSearch() {
        open("https://www.swedbank.lt/private/credit/loans/home?language=ENG");
        $(By.cssSelector("button.ui-cookie-consent__manage-button")).click();
        $(By.cssSelector("button.button.-guiding.-left.ui-cookie-consent__save-choice-button")).click();
        $(By.cssSelector("#calculator-section")).scrollIntoView(true);
    }

    @When("I am applying for a loan with a co-applicant -> NO")
    public void iAmApplyingForALoanWithACoApplicantNO() {
//        $(By.xpath("//label[@for='borrowersCheck'][1]")).click();
    }

    @When("I have children \\(dependants) in family -> YES")
    public void iHaveChildrenDependantsInFamilyYES() {
        $(By.xpath("//label[@for='dependantsCheck'][1]")).click();
    }

    @When("Dependants in family -> 2 or more")
    public void dependantsInFamilyOrMore() {
        $(By.xpath("//label[@for='dependants2'][1]")).click();
    }

    @When("Total monthly income -> {int} EUR")
    public void totalMonthlyIncomeEUR(int arg0) {
        $(By.cssSelector("#income")).click();
        $(By.cssSelector("#income")).sendKeys(Keys.BACK_SPACE);
        $(By.cssSelector("#income")).sendKeys(String.valueOf(arg0));
        Selenide.sleep(50000);
    }

    @When("I have existing loan obligations \\(incl. in Swedbank) -> NO")
    public void iHaveExistingLoanObligationsInclInSwedbankNO() {
    }

    @When("Choose loan amount -> {int} eur")
    public void chooseLoanAmountEur(String arg0) {
    }

    @When("Choose loan term -> {int} years")
    public void chooseLoanTermYears(int arg0) {
    }

    @Then("Find out monthly payment")
    public void findOutMonthlyPayment() {
    }

    @Then("Find out loan amount")
    public void findOutLoanAmount() {
    }

//    @When("I am applying for a loan with a co-applicant -> NO")
//    public void enterKeyword(String keyword) {
//        $(By.name("q")).val(keyword).pressEnter();
//    }
//
//    @Then("at least top {int} matches should be shown")
//    public void topTenMatchesShouldBeShown(int resultsCount) {
//        $$("#res .g").shouldHave(sizeGreaterThanOrEqual(resultsCount));
//    }
//
//    @Then("the first one should contain {string}")
//    public void theFirstOneShouldContainKeyword(String expectedText) {
//        $("#res .g").shouldHave(text(expectedText));
//    }
}