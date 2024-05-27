package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.pages.CarProductPages;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CarProductSteps {

    CarProductPages carProductPages;

    @Given("I open Traveloka home page")
    public void iOpenTravelokaHomePage() {
        carProductPages.open();
    }

    @When("I click on the Car")
    public void iClickOnTheCar() throws InterruptedException {
        carProductPages.clickCarRentalMenu();
    }

    @Then("I should see the Car Page")
    public void iShouldSeeTheCarPage() {
        assertThat("car page is not visible", carProductPages.isCarRentalMenuSelected(), equalTo(true));
    }

    @When("I click on the tab without driver")
    public void iClickOnTheTabWithoutDriver() {
        carProductPages.clickWithoutDriverMenu();
    }

    @Then("I should see the Your Rental Location input")
    public void iShouldSeeTheYourRentalLocationInput() {
        assertThat("rental location input is not visible", carProductPages.isRentalLocationInputVisible(),
                equalTo(true));
    }

    @And("I should see the Rental Start Date input")
    public void iShouldSeeTheRentalStartDateInput() {
        assertThat("rental start date input is not visible", carProductPages.isRentalStartDateInputVisible(),
                equalTo(true));
    }

    @And("I should see the Start Time input")
    public void iShouldSeeTheStartTimeInput() {
        assertThat("rental start time input is not visible", carProductPages.isRentalStartTimeInputVisible(),
                equalTo(true));
    }

    @And("I should see the Rental End Date input")
    public void iShouldSeeTheRentalEndDateInput() {
        assertThat("rental end date input is not visible", carProductPages.isRentalEndDateInputVisible(),
                equalTo(true));
    }

    @And("I should see the End Time input")
    public void iShouldSeeTheEndTimeInput() {
        assertThat("rental end time input is not visible", carProductPages.isRentalEndTimeInputVisible(),
                equalTo(true));
    }

    @And("I should see the Search button")
    public void iShouldSeeTheSearchButton() {
        assertThat("rental search button is not visible", carProductPages.isRentalSearchButtonVisible(),
                equalTo(true));
    }

    @When("I select Pickup Location {string}")
    public void iSelectPickupLocationJakarta(String location) {
        System.out.println("ini location: " + location);
        carProductPages.selectPickupLocation(location);
    }

    @And("I select Rental Start Date {string} add {string} days")
    public void iSelectRentalStartDateTodayAddDays(String date, String days) {
        carProductPages.selectRentalStartDate(date, days);
    }

    @And("I select Start Time at {string} with {string} minutes")
    public void iSelectStartTimeAtWihMinutes(String hours, String minutes) throws InterruptedException {
        int hoursInt = Integer.parseInt(hours);
        int minutesInt = Integer.parseInt(minutes);
        carProductPages.selectStartTime(hoursInt, minutesInt);
    }

    @And("I select Rental End Date {string} add {string} days")
    public void iSelectRentalEndDateTodayAddDays(String date, String days) throws InterruptedException {
        carProductPages.selectRentalEndDate(date, days);
    }

    @And("I select End Time at {string} with {string} minutes")
    public void iSelectEndTimeAtWithMinutes(String hours, String minutes) {
        int hoursInt = Integer.parseInt(hours);
        int minutesInt = Integer.parseInt(minutes);
        carProductPages.selectEndTime(hoursInt, minutesInt);
    }

    @And("I click on the Search button")
    public void iClickOnTheSearchButton() {
        carProductPages.clickRentalSearchButton();
    }

    @Then("I should see the list of cars")
    public void iShouldSeeTheListOfCars() throws InterruptedException {
        assertThat("list of cars is not visible", carProductPages.isCarProductListVisible(),
                equalTo(true));
    }

    @When("I select Car as {string}")
    public void iSelectCarAsMiniMPV(String carType) {
        carProductPages.selectCarType(carType);
    }

    @And("I select Car Provider as {string}")
    public void iSelectCarProviderAs(String carProvider) {
        carProductPages.selectCarProvider(carProvider);
    }

    @And("I select first car")
    public void iSelectFirstCar() {
        carProductPages.clickFirstContinueBtnOnCarProductList();
    }

    @Then("I should see the product detail")
    public void iShouldSeeTheProductDetail() {
        assertThat("product detail is not visible", carProductPages.isNextStepAfterContinueBtnVisible(),
                equalTo(true));
    }

    @When("I click on continue on the product detail")
    public void iClickOnContinueOnTheProductDetail() {
        carProductPages.clickContinueBtnOnProductDetail();
    }

    @Then("I should see pop-up error with message Please check your booking")
    public void iShouldSeePopUpErrorWithMessagePleaseCheckYourBooking() {
        assertThat("pop-up error is not visible", carProductPages.isPopUpBookingErrorMessageVisible(),
                equalTo(true));
    }


    @And("I click button Book Now")
    public void iClickButtonBookNow() {
        carProductPages.clickContinueBtnOnProductDetail();
    }

    @And("I fill Driver Details")
    public void iFillDriverDetails() {
    }

    @And("I click Continue")
    public void iClickContinue() {
        carProductPages.continueBtnOnBookingPage();
    }

    @And("I add a special request is optional with notes {string}")
    public void iAddASpecialRequestIsOptional(String notes) {
        carProductPages.inputSpecialRequest(notes);
    }

    @And("I select payment method and proceed payment")
    public void iSelectPaymentMethodAndProceedPayment() {
        carProductPages.selectPaymentMethod();
    }

    @When("I select Pick-up Location in Rental Office")
    public void iSelectPickUpLocationInRentalOffice() {
        carProductPages.clickRentalOfficeBtn();
    }


    @And("I input Pick-up or Drop-off notes is optional with notes {string}")
    public void iInputPickUpDropOffNotesIsOptional(String notes) {
        carProductPages.inputAdditionalNotes(notes);
    }

    @And("I select Drop-off Location in Other Location with Location is {string}")
    public void iSelectDropOffLocationInOtherLocationWithLocationIsJakarta(String dropOffLocation) {
        carProductPages.selectDropOffLocation(dropOffLocation);
    }

    @And("I fill Contact Details with name is {string} and email is {string} and phone number is {string}")
    public void iFillContactDetailsWithNameIsJohnDoeAndEmailIsJohnGmailComAndPhoneNumberIs(String name, String email, String phoneNumber) {
        carProductPages.fillContactDetails(name, email, phoneNumber);
    }

    @And("I fill Driver Details with title is {string} and full name is {string} and phone number is {string}")
    public void iFillDriverDetailsWithTitleIsMrAndFullNameIsJohnDoeAndPhoneNumberIs(String title, String fullName, String phoneNumber) {
        carProductPages.fillDriverDetails(title, fullName, phoneNumber);
    }

    @And("I click Continue To Payment")
    public void iClickContinueToPayment() {
        carProductPages.continueToPayment();
    }

    @And("I check all rental requirements")
    public void iCheckAllRentalRequirements() {
        carProductPages.checkAllRequirements();
    }

    @Then("I should see Car Rental Summary Page")
    public void iShouldSeeCarRentalSummaryPage() {
        assertThat("car rental summary page is not visible", carProductPages.isPaymentSummaryHeaderVisible(),
                equalTo(true));
    }
}
