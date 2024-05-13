package StepDefinition;

import io.cucumber.java.en.Then;

import static pages.ProductCategoryPage.*;
public class ProductCategoryPage {
    @Then("^User should be able to view the product category page$")
    public void product_category_validation() throws InterruptedException {
        productCategory_visibility();
    }
}
