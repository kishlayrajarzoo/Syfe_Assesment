package Syfe_Assesment.Assesment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();  
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click(); 
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();    

        
        driver.findElement(By.className("shopping_cart_link")).click();

        // Find all cart items
        List<WebElement> cartItems = driver.findElements(By.className("cart_item"));
        
        
        boolean removed = false;
        for (WebElement item : cartItems) {
            String priceText = item.findElement(By.className("inventory_item_price")).getText();
            double price = Double.parseDouble(priceText.replace("$", ""));
            // condition 1 
            if (price >= 8 && price <= 10) {
               
                item.findElement(By.cssSelector("button.cart_button")).click();
                removed = true;
                break; 
            }
        }

        
        String count = driver.findElement(By.className("shopping_cart_badge")).getText();

        if (count.equals("2")) {
            System.out.println("The cart icon shows the number 2");
        } else {
            System.out.println("The cart icon does not show the expected number 2");
        }

        driver.quit();
    }
}