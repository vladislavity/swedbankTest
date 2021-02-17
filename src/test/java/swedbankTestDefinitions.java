import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertEquals;

public class swedbankTestDefinitions {

    pageObjects calculator = new pageObjects();

    @Given("Open browser with Swedbank loan calculator")
    public void openSwedbankLoanCalculatorPage() {
        open("https://www.swedbank.lt/private/credit/loans/home?language=ENG");
        calculator.cookieBtnOne.click();
        calculator.cookieBtnTwo.click();
        calculator.calculatorContainer.scrollIntoView(true);
    }

    @When("I am applying for a loan with a co-applicant -> NO")
    public void iAmApplyingForALoanWithACoApplicantNO() {
//        calculator.applyingWithCoApplicantCheckbox.click();
    }

    @When("I have children \\(dependants) in family -> YES")
    public void iHaveChildrenDependantsInFamilyYES() {
        calculator.moreThenOneDependantCheckbox.click();
    }

    @When("Dependants in family -> 2 or more")
    public void dependantsInFamilyOrMore() {
        calculator.dependantInTheFamilyRadioBtnTwo.click();
    }

    @When("I have existing loan obligations \\(incl. in Swedbank) -> NO")
    public void iHaveExistingLoanObligationsInclInSwedbankNO() {
//        calculator.existingLoanObligationsCheckbox.click();
    }

    @When("Total monthly income -> {int} EUR")
    public void totalMonthlyIncomeEUR(int amount) {
        calculator.totalMonthlyIncome.click();
        calculator.totalMonthlyIncome.sendKeys(Keys.BACK_SPACE);
        calculator.totalMonthlyIncome.sendKeys(String.valueOf(amount));
    }

    @When("Choose loan amount -> {int} eur")
    public void chooseLoanAmountEur(int amount) {
        calculator.loanAmountInput.click();
        calculator.loanAmountInput.sendKeys(Keys.chord(Keys.ARROW_RIGHT, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE));
        calculator.loanAmountInput.setValue(String.valueOf(amount));
    }

    @When("Choose loan term -> {int} years")
    public void chooseLoanTermYears(int years) {
        int months = years * 12;
        calculator.loanTermInput.click();
        calculator.loanTermInput.sendKeys(Keys.chord(Keys.ARROW_RIGHT, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE));
        calculator.loanTermInput.sendKeys(String.valueOf(months));
        calculator.downPaymentInput.click();
    }

    @Then("Find out monthly payment")
    public void findOutMonthlyPayment() {
        String monthlyPayment = calculator.monthlyLoanPayment.getText();
        System.out.println("Maximum loan amount = " + monthlyPayment);
        assertEquals("386", monthlyPayment);
    }

    @Then("Find out loan amount")
    public void findOutLoanAmount() {
        String loanAmount = calculator.maximumLoanAmount.getText();
        System.out.println("Maximum loan amount = " + loanAmount);
        assertEquals("49739", loanAmount);
    }
}