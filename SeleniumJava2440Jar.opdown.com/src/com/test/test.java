package com.test;


import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.*;  
  
public class test {  
  
    public static void main(String[] args) {  
          
        //如果火狐浏览器没有默认安装在C盘，需要制定其路径  
        System.setProperty("webdriver.firefox.bin", "D:/firefox/firefox.exe"); 
        WebDriver driver = new FirefoxDriver();  
        driver.get("http://www.baidu.com/");  
          
        driver.manage().window().maximize();  
          
        WebElement txtbox = driver.findElement(By.name("李维"));  
        txtbox.sendKeys("2015117220");  
          
        WebElement btn = driver.findElement(By.id("su"));  
        btn.click();  
          
        
  
    }  
  
}  