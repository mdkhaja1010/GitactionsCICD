package com.TextExecutor;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector(".nav-search-field #twotabsearchtextbox")).sendKeys("Iphone 16 pro", Keys.ENTER);
        Thread.sleep(3000);
        WebElement ele=driver.findElement(By.cssSelector("[class='a-section a-spacing-base a-spacing-top-base s-slider-container']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        WebElement min=driver.findElement(By.cssSelector(" [id='p_36/range-slider_slider-item'] [id='p_36/range-slider_slider-item_lower-bound-slider']"));
        WebElement max=driver.findElement(By.cssSelector(" [class='a-section s-range-input-container s-upper-bound'] [id='p_36/range-slider_slider-item_upper-bound-slider']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
       Thread.sleep(6000);
        js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));", min, "80");
       // js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));", max, "150");
        Thread.sleep(3000);
        driver.quit();
    }
}
