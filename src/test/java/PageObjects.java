import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PageObjects {
    public final SelenideElement cookieBtnOne = $("button.ui-cookie-consent__manage-button");
    public final SelenideElement cookieBtnTwo = $("button.button.-guiding.-left.ui-cookie-consent__save-choice-button");
    public final SelenideElement calculatorContainer = $("button.button.-guiding.-left.ui-cookie-consent__save-choice-button");
    public final SelenideElement applyingWithCoApplicantCheckbox = $("button.button.-guiding.-left.ui-cookie-consent__save-choice-button");
    public final SelenideElement moreThenOneDependantCheckbox = $x("//label[@for='dependantsCheck'][1]");
    public final SelenideElement dependantInTheFamilyRadioBtnTwo = $x("//label[@for='dependants2'][1]");
    public final SelenideElement existingLoanObligationsCheckbox = $x("//label[@for='obligationsCheck'][1]");
    public final SelenideElement totalMonthlyIncome = $("#income");
    public final SelenideElement downPaymentInput = $("#downpayment");
    public final SelenideElement loanAmountInput = $x("//*[@id='slider1']/div[2]/input");
    public final SelenideElement loanTermInput = $x("//*[@id='slider2']/div[2]/input");
    public final SelenideElement monthlyLoanPayment = $("#month-payment");
    public final SelenideElement maximumLoanAmount = $("#slider-financed");
}
