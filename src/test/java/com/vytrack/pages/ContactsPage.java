package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;

public class ContactsPage extends BasePage {

    @FindBy(css=".input-widget")
    public WebElement pageNumber;

    public ContactsPage() throws MalformedURLException {
    }


    public WebElement getContactEmail(String email) throws MalformedURLException {
        String xpath = "//*[contains(text(), '"+email+"') and @data-column-label='Email']";
        return Driver.get().findElement(By.xpath(xpath));
    }


}

