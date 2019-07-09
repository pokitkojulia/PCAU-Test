package utils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class UiTestListener implements ITestListener{

    public void onTestStart(ITestResult iTestResult) {

    }

    public void onTestSuccess(ITestResult iTestResult) {


    }

    public void onTestFailure(ITestResult iTestResult) {

    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {
        String browserName = iTestContext.getCurrentXmlTest().getParameter("browserName");
        WebDriver driver = RemoteWebDriverFactory.createInstance(browserName);
        RemoteDriverManager.setWebDriver(driver);
    }

    public void onFinish(ITestContext iTestContext) {
        RemoteDriverManager.getDriver().close();
    }
}