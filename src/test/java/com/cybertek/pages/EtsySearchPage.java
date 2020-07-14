package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearchPage {

    public EtsySearchPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//input[@id=\"global-enhancements-search-query\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"gnav-search\"]/div/div[1]/button/span")
    public WebElement clickButton;
}
