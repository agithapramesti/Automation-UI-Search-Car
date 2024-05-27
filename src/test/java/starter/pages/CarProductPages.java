package starter.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static kotlin.concurrent.ThreadsKt.thread;

@DefaultUrl("https://www.traveloka.com/")
public class CarProductPages extends PageObject {

    private String generateXpath = "";

    @FindBy(xpath="//div[contains(text(),'Car Rental')]")
    private WebElementFacade carRentalMenu;

    @FindBy(xpath="//h4[contains(text(),'Without Driver')]")
    private WebElementFacade withoutDriverMenu;

    @FindBy(xpath = "//input[@data-testid='rental-search-form-location-input']")
    private WebElementFacade rentalLocationInput;

    @FindBy(xpath = "//input[@data-testid='rental-search-form-date-input-start']")
    private WebElementFacade rentalStartDateInput;

    @FindBy(xpath = "//input[@data-testid='rental-search-form-time-input-start']")
    private WebElementFacade rentalStartTimeInput;

    @FindBy(xpath = "//input[@data-testid='rental-search-form-date-input-end']")
    private WebElementFacade rentalEndDateInput;

    @FindBy(xpath = "//input[@data-testid='rental-search-form-time-input-end']")
    private WebElementFacade rentalEndTimeInput;

    @FindBy(xpath = "//div[@data-testid='rental-search-form-cta']")
    private WebElementFacade rentalSearchButton;

    @FindBy(xpath = "//div[contains(text(),'Done')]")
    private WebElementFacade doneBtn;

    @FindBy(xpath = "//div[@class='css-1dbjc4n']")
    private WebElementFacade carProductList;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[6]/div[1]")
    private WebElementFacade carTypeBtn;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[8]/div[1]")
    private WebElementFacade carProvider;

    @FindBy(xpath = "//div[contains(text(),'Continue')]")
    private WebElementFacade continueBtnOnCarProductList;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-18u37iz r-nsbfu8']")
    private WebElementFacade selectRentalProvider;

    @FindBy(xpath = "//div[@role='button' and contains(., \"Continue\") and @tabindex='0']")
    private WebElementFacade continueBtnOnProductDetail;

    @FindBy(xpath = "//h2[contains(text(),'Please check your booking')]")
    private WebElementFacade popUpBookingErrorMessage;

    @FindBy(xpath = "//div[@role='radio' and contains(.,'Rental Office')]")
    private WebElementFacade rentalOfficeBtn;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-mgfd1o r-1ljd8xs r-edyy15']")
    private WebElementFacade rentalOfficeDropdown;

    @FindBy(xpath = "//div[@class='css-1dbjc4n r-1loqt21 r-1otgn73 r-1i6wzkk r-lrvibr r-13qz1uu']")
    private WebElementFacade rentalOfficeDropdownItem;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/div[1]")
    private WebElementFacade otherLocationDropOff;

    @FindBy(xpath = "//input[@placeholder='Search location or address']")
    private WebElementFacade dropOffLocationInput;

    @FindBy(xpath = "//textarea[@placeholder='Additional notes (optional)']")
    private WebElementFacade additionalNotes;

    @FindBy(xpath = "//input[@aria-labelledby='name.full']")
    private WebElementFacade customerNameInput;

    @FindBy(xpath = "//input[@aria-label='Phone Number']")
    private WebElementFacade phoneNumberInput;

    @FindBy(xpath = "//input[@aria-labelledby='emailAddress']")
    private WebElementFacade emailInput;

    @FindBy(xpath = "//select[@class='r-30o5oe r-1niwhzg r-1yadl64 r-1p0dtai r-t1w4ow r-ubezar r-majxgm r-1pi2tsx r-1r74h94 r-135wba7 r-crgep1 r-orgf3d r-1ny4l3l r-10paoce r-u8s1d r-3mc0re r-ipm5af r-34rx7k r-417010']")
    private WebElementFacade selectTitle;

    @FindBy(xpath = "//input[@aria-describedby='(without title and punctuation)']")
    private WebElementFacade driverNameInput;

    @FindBy(xpath = "//input[@aria-label='Phone Number']")
    private WebElementFacade driverPhoneNumberInput;

    @FindBy(xpath = "//div[@role='button' and contains(., \"Continue\")]")
    private WebElementFacade continueBtnOnBookingPage;

    @FindBy(xpath = "//textarea[@placeholder='Odd or even license plates, car charger, baby car seat, etc.")
    private WebElementFacade specialRequest;

    @FindBy(xpath = "//div[@role='button' and contains(., \"Continue to Payment\")]")
    private WebElementFacade continueToPaymentBtn;

    @FindBy(xpath = "//div[@data-testid='modal-confirm-booking']")
    private WebElementFacade confirmBookingPopup;

    @FindBy(xpath = "//body/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]")
    private WebElementFacade continueOnPopupBooking;

    @FindBy(xpath = "//div[contains(text(),'Tap to check the requirements.')]")
    private WebElementFacade tapCheckRequirements;

    @FindBy(xpath = "//div[contains(text(),'Check All')]")
    private WebElementFacade checkAllBox;

    @FindBy(xpath = "//div[contains(text(),'Save')]")
    private WebElementFacade saveBtn;
    @FindBy(xpath = "//div[@data-testid='paymentScopeLogo-BCA Virtual Account']")
    private WebElementFacade bcaVAOption;

    @FindBy(xpath = "//div[@data-testid='paymentProductSummaryHeader']")
    private WebElementFacade paymentSummaryHeader;

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[2]")
    private WebElementFacade payBtn;


    private String rentalLocationInputItem = "//div[@data-testid='rental-search-form-location-item']//div[contains(., '%s')]";
    private String dateMarkerTodayStartDate = "//div[@data-testid='date-marker-today']";
    private String startDateXpath = "//div[@data-month='%s']//div[@data-testid='date-cell-%s']";
    private String endDateXpath = "//div[@data-testid='mds-calendar']//div[@data-month='%s']//div[@data-testid='date-cell-%s']";
    private String startTimeHourXpath = "//div[@class='css-1dbjc4n r-1l31rp8 r-kdyh1x r-rs99b7 r-key0ze r-1udh08x']//div[contains(., 23)]";
    private String startTimeMinuteXpath = "//div[@class='css-1dbjc4n r-1l31rp8 r-kdyh1x r-rs99b7 r-key0ze r-1udh08x']//div[contains(., 30)]";

    private String longEndDateXpath = "//body/div[@id='__next']/div[4]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]";
    private String dropOffLocationItem = "//div[@aria-label='%s']";

    public void clickCarRentalMenu() {
        carRentalMenu.waitUntilClickable();
        carRentalMenu.click();
    }

    public boolean isCarRentalMenuSelected() {
        return withoutDriverMenu.isEnabled() && withoutDriverMenu.isVisible();
    }

    public void clickWithoutDriverMenu() {
        withoutDriverMenu.waitUntilClickable();
        withoutDriverMenu.click();
    }

    public boolean isRentalLocationInputVisible() {
        return rentalLocationInput.isVisible();
    }

    public boolean isRentalStartDateInputVisible() {
        return rentalStartDateInput.isVisible();
    }

    public boolean isRentalStartTimeInputVisible() {
        return rentalStartTimeInput.isVisible();
    }

    public boolean isRentalEndDateInputVisible() {
        return rentalEndDateInput.isVisible();
    }

    public boolean isRentalEndTimeInputVisible() {
        return rentalEndTimeInput.isVisible();
    }

    public boolean isRentalSearchButtonVisible() {
        return rentalSearchButton.isVisible();
    }

    public void selectPickupLocation(String location) {
        rentalLocationInput.waitUntilClickable();
        rentalLocationInput.click();
        rentalLocationInput.type(location);
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String xpathGenerated = String.format(rentalLocationInputItem, location);
        generateXpath(xpathGenerated, "click");

    }

    public void selectRentalStartDate(String date, String days) {
        rentalStartDateInput.waitUntilClickable();
        rentalStartDateInput.click();

        int daysInt = Integer.parseInt(days);

        if(date.equals("today") && daysInt == 0) {
            generateXpath(dateMarkerTodayStartDate, "click");
        } else if (daysInt > 0) {
            DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.add(Calendar.DATE, daysInt);
            String newDate = dateFormat.format(cal.getTime());
            System.out.println("new date is " + newDate + " and  month is "+ cal.get(Calendar.MONTH));

            String dateCell = cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) +1) + "-" + cal.get(Calendar.YEAR);
            startDateXpath = String.format(startDateXpath, cal.get(Calendar.MONTH), dateCell);
            generateXpath(startDateXpath,"click");
        }
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void selectStartTime(int hours, int minutes) throws InterruptedException {
        Actions actions = new Actions(getDriver());
        System.out.println("hours: " + hours + " minutes: " + minutes);
        rentalStartTimeInput.waitUntilClickable();
        rentalStartTimeInput.click();
        Thread.sleep(2000);

        //select hour
        By hourSelector = By.xpath(startTimeHourXpath);
        List<WebElement> hoursElement = getDriver().findElements(hourSelector);
        for (WebElement hourElement : hoursElement) {
            System.out.println("hourElement: " + hourElement.getText());
            if (hourElement.getText().equals(String.valueOf(hours))) {
                actions.scrollToElement(hourElement).perform();
                Thread.sleep(2000);
                System.out.println("hourElement: " + hourElement.getText());
                hourElement.click();
                Thread.sleep(2000);
                break;
            }
        }

        //select minute
        By minuteSelector = By.xpath(startTimeMinuteXpath);
        List<WebElement> minutesElement = getDriver().findElements(minuteSelector);
        for (WebElement minuteElement : minutesElement) {
            if (minuteElement.getText().equals(String.valueOf(minutes))) {
                System.out.println("minuteElement: " + minuteElement.getText());
                minuteElement.click();
                break;
            }
        }

        doneBtn.click();
    }

    public void selectRentalEndDate(String date, String days) {
        rentalEndDateInput.waitUntilClickable();
        rentalEndDateInput.click();

        int daysInt = Integer.parseInt(days);

        if(date.equals("today") && daysInt == 0) {
            generateXpath(dateMarkerTodayStartDate, "click");
        } else if (daysInt > 0) {
            DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
            Calendar cal = Calendar.getInstance();
            cal.setTime(new Date());
            cal.add(Calendar.DATE, daysInt);
            String newDate = dateFormat.format(cal.getTime());
            System.out.println("new date is " + newDate + " and  month is "+ cal.get(Calendar.MONTH));

            String dateCell = cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) +1) + "-" + cal.get(Calendar.YEAR);
            endDateXpath = longEndDateXpath+endDateXpath;
            endDateXpath = String.format(endDateXpath, cal.get(Calendar.MONTH), dateCell);
            generateXpath(endDateXpath,"click");
        }
        getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void selectEndTime(int hours, int minutes) {
        Actions actions = new Actions(getDriver());
        System.out.println("hours: " + hours + " minutes: " + minutes);
        rentalEndTimeInput.waitUntilClickable();
        rentalEndTimeInput.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //select hour
        By hourSelector = By.xpath(startTimeHourXpath);
        List<WebElement> hoursElement = getDriver().findElements(hourSelector);
        for (WebElement hourElement : hoursElement) {
            System.out.println("hourElement: " + hourElement.getText());
            if (hourElement.getText().equals(String.valueOf(hours))) {
                actions.scrollToElement(hourElement).perform();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hourElement: " + hourElement.getText());
                hourElement.click();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        //select minute
        By minuteSelector = By.xpath(startTimeMinuteXpath);
        List<WebElement> minutesElement = getDriver().findElements(minuteSelector);
        for (WebElement minuteElement : minutesElement) {
            if (minuteElement.getText().equals(String.valueOf(minutes))) {
                System.out.println("minuteElement: " + minuteElement.getText());
                minuteElement.click();
                break;
            }
        }

        doneBtn.click();
    }

    public void clickRentalSearchButton() {
        rentalSearchButton.waitUntilClickable();
        rentalSearchButton.click();
    }

    public boolean isCarProductListVisible() throws InterruptedException {
        carProductList.waitUntilVisible();
        carProductList.waitUntilClickable();
        return carProductList.isVisible();
    }

    public void selectCarType(String carType) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)","");
        getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        carTypeBtn.waitUntilClickable();
        carTypeBtn.click();
        String carTypeXpath = "//div[contains(text(),'%s')]";
        carTypeXpath = String.format(carTypeXpath, carType);
        generateXpath(carTypeXpath, "click");
    }

    public void selectCarProvider(String carProviderValue) {
        carProvider.waitUntilClickable();
        carProvider.click();

        List<WebElement> providers = getDriver().findElements(By.xpath(
                "//body/div[@id='__next']/div[1]/div[5]/div[2]/div[1]/div[1]/div[8]/div[2]/div[2]/div[1]/div[1]/div"));
        for (WebElement provider : providers) {
            if (provider.getText().contains(carProviderValue)) {
                provider.click();
                break;
            }
        }
    }

    public void clickFirstContinueBtnOnCarProductList() {
        continueBtnOnCarProductList.waitUntilClickable();
        List<WebElement> continueBtns = getDriver().findElements(By.xpath("//div[contains(text(),'Continue')]"));
        for (int i = 0 ; i<=continueBtns.size(); i++) {
            if (continueBtns.get(0).isDisplayed()) {
                continueBtns.get(0).click();
                break;
            }
        }
    }

    public boolean isNextStepAfterContinueBtnVisible() {
        selectRentalProvider.waitUntilVisible();
        return selectRentalProvider.isVisible();
    }

    private void generateXpath(String xpath, String ability) {
        System.out.println("xpathGenerated: " + xpath);

        if (ability.equals("click")) {
            getDriver().findElement(By.xpath(xpath)).click();
        }
    }

    public void clickContinueBtnOnProductDetail() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)","");
        continueBtnOnProductDetail.waitUntilClickable();
        continueBtnOnProductDetail.click();
    }

    public boolean isPopUpBookingErrorMessageVisible() {
        popUpBookingErrorMessage.waitUntilVisible();
        return popUpBookingErrorMessage.isVisible();
    }

    public void clickRentalOfficeBtn() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,500)","");
        rentalOfficeBtn.waitUntilClickable();
        rentalOfficeBtn.click();
        rentalOfficeDropdown.click();
        rentalOfficeDropdownItem.waitUntilVisible();
        rentalOfficeDropdownItem.click();
    }

    public void selectDropOffLocation(String dropOffLocation) {
        otherLocationDropOff.waitUntilClickable();
        otherLocationDropOff.click();
        dropOffLocationInput.click();
        dropOffLocationInput.typeAndEnter(dropOffLocation);
        String generatedXpath = String.format(dropOffLocationItem, dropOffLocation);
        generateXpath(generatedXpath, "click");

    }

    public void inputAdditionalNotes(String notes) {
        additionalNotes.waitUntilClickable();
        additionalNotes.click();
        additionalNotes.type(notes);
    }

    public void fillContactDetails(String name, String email, String phoneNumber) {
        customerNameInput.typeAndEnter(name);
        emailInput.typeAndEnter(email);
        phoneNumberInput.typeAndEnter(phoneNumber);
    }

    public void fillDriverDetails(String title, String name, String phoneNumber) {
        selectTitle.selectByVisibleText(title);
        driverNameInput.typeAndEnter(name);
        driverPhoneNumberInput.typeAndEnter(phoneNumber);
    }

    public void continueBtnOnBookingPage() {
        continueBtnOnBookingPage.waitUntilClickable();
        continueBtnOnBookingPage.click();
    }

    public void inputSpecialRequest(String request) {
        specialRequest.waitUntilClickable();
        specialRequest.click();
        specialRequest.type(request);
    }

    public void continueToPayment() {
        continueToPaymentBtn.waitUntilClickable();
        continueToPaymentBtn.click();
        if (confirmBookingPopup.isVisible()) {
            continueOnPopupBooking.click();
        }
    }

    public void checkAllRequirements() {
        tapCheckRequirements.waitUntilClickable();
        tapCheckRequirements.click();
        checkAllBox.waitUntilClickable();
        checkAllBox.click();
        saveBtn.waitUntilClickable();
        saveBtn.click();
    }

    public void selectPaymentMethod() {
        bcaVAOption.waitUntilClickable();
        bcaVAOption.click();
        payBtn.click();
    }

    public boolean isPaymentSummaryHeaderVisible() {
        paymentSummaryHeader.waitUntilVisible();
        return paymentSummaryHeader.isVisible();
    }

}
