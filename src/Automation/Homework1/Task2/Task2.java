package Automation.Homework1.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

@Test
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://mail.ru/");

        WebElement loginField = driver.findElement(By.id("mailbox:login"));
        WebElement passButton = driver.findElement(By.xpath("//label[@id='mailbox:submit']/input"));
        WebElement passField = driver.findElement(By.id("mailbox:password"));

        loginField.sendKeys("vkalikh");
        passButton.click();
        Thread.sleep(1000);
        passField.sendKeys("101057333kvp");
        passButton.click();

        WebElement checkAfterLogin = (new WebDriverWait(driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Написать письмо']")));
        Assert.assertTrue(checkAfterLogin.isDisplayed());

        driver.findElement(By.xpath("//span[text()='Написать письмо']")).click();
        WebElement checkCreationWindow = (new WebDriverWait(driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-type='to']//input")));
        Assert.assertTrue(checkCreationWindow.isDisplayed());

        WebElement to = driver.findElement(By.xpath("//div[@data-type='to']//input"));
        to.sendKeys("vkalikh@mail.ru");
        driver.findElement(By.name("Subject")).sendKeys("title");
        driver.findElement(By.xpath("//div[@role='textbox']/div/div[1]")).sendKeys("Hello");
        driver.findElement(By.xpath("//span[text()='Отправить']")).click();
        Thread.sleep(25000);

        List<WebElement> emailsList = driver.findElements(By.xpath("//a[@class='llc js-tooltip-direction_letter-bottom js-letter-list-item llc_normal']//span[contains(@title, 'vkalikh@mail.ru')][1]"));
        WebElement lastLetter = emailsList.get(0);
        lastLetter.click();

        WebElement checkNewLetter = (new WebDriverWait(driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("//div[@class='js-helper js-readmsg-msg']//div//div//div//div//div[contains(text(), 'Hello')]")));
        Assert.assertTrue(checkNewLetter.isDisplayed());

        driver.quit();
    }
}
