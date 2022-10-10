package com.MovieApp.web.step.definition;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


    public class sortFeatureStepDef {

        WebDriver driver;

        @Given("I am on the Popular page of MovieApp")
        public void i_am_on_the_popular_page_of_movie_app() {
            driver=new ChromeDriver();
            driver.navigate("https://MovieApp.com");
        }

        @When("I click on {string} tab")
        public void i_click_on_tab(String Popular) {
            driver.findElement(By.id("Popular")).click();
        }

        @Then("I verify that {string} label is present")
        public void verify_that_sort_label_is_present(String sort) {
            String expectedText = sort;
            WebElement Sort = driver.findElement(By.Id("Sort"));
            String actualText = actualTxt.getText();
            Assert.assertTrue("Sort label is present in popular screen",expectedText.equals(actualText));
        }


        @Then("I click on Sort")
        public void i_click_on_sort() {
            driver.findElement(By.Id("Sort")).click();
        }

        @Then("I verify that Sort is single select list")
        public void i_verify_that_sort_is_single_select_list() {
            Select sortBy = new Select(Sort);
            Boolean singleSelectSortList = sortBy.isMultiple();
        }

        @Then("I verify that Sort has three items {string},{string} and {string}")
        public void i_verify_that_sort_has_three_items_and(String Title, String Release_date, String Popularity_score) {
            String expectedItem1 = Title;
            String expectedItem2 = Release_date;
            String expectedItem3 = Popularity_score;
            String actualItem1 = sortBy.SelectByIndex(0);
            String actualItem2 = sortBy.SelectByIndex(1);
            String actualItem3 = sortBy.SelectByIndex(2);

            Assert.assertTrue("Title is present in Sort By List",expectedItem1.equals(actualItem1));
            Assert.assertTrue("Release_date is present in Sort By List",expectedItem2.equals(actualItem2));
            Assert.assertTrue("Popularity_score is present in Sort By List",expectedItem3.equals(actualItem3));
        }


    }



}
