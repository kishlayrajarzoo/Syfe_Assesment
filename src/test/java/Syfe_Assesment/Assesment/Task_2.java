package Syfe_Assesment.Assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Select sort = new Select(driver.findElement(By.className("product_sort_container")));
        sort.selectByVisibleText("Price (low to high)");

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        String count = driver.findElement(By.className("shopping_cart_badge")).getText();

        if (count.equals("2")) {
            System.out.println("The cart icon shows the number 2");
        } else {
            System.out.println("The cart icon does not show the expected number 2");
        }

        driver.quit();
    }
}