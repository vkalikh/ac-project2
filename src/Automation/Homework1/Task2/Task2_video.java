package Automation.Homework1.Task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Task2_video {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/watch?v=WEkSYw3o5is");

        Thread.sleep(6500);

        WebElement currentTime = driver.findElement(By.className("ytp-time-current"));
        String currentTimeStr = currentTime.getText();

        WebElement playButton = driver.findElement(By.xpath("//div[@class='ytp-left-controls']//button[@class='ytp-play-button ytp-button']"));
        playButton.click();

        Thread.sleep(6500);

        playButton.click();
        WebElement playTime = driver.findElement(By.className("ytp-time-current"));
        String playTimeStr = playTime.getText();

        Assert.assertTrue(currentTimeStr.hashCode() < playTimeStr.hashCode());
        driver.quit();
    }
}
