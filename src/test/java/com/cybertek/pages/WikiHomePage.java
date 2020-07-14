package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiHomePage {

    public WikiHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "search")
    public WebElement searchBox;

    @FindBy(xpath ="//*[@id=\"search-form\"]/fieldset/button/i" )
    public WebElement searchButton;

    @FindBy(id="firstHeading")
    public WebElement mainHeaderAfterSearch;

    @FindBy (className = "fn")
    public WebElement imageHeaderAfterSearch;

}
