import cucumber.api.java.en.*;

import static org.junit.Assert.assertEquals;


public class MyStepdefs {

    // buttonsGT - fails BUT it's excluded
    @Given("there is a GT")
    public void thereIsAGT() {

    }

    @When("the user modifies the script from IDE and runs the Pipeline")
    public void theUserModifiesTheScriptFromIDEAndRunsThePipeline() {

    }

    @Then("the buttons should appear in Octane")
    public void theButtonsShouldAppearInOctane() {
        String result = "hello";
        assertEquals(result.length(), 5556);

    }

    //backgroundGT
    @Given("Background given")
    public void backgroundGiven() {

    }

    @When("Background when")
    public void backgroundWhen() {

    }

    @And("Background and")
    public void backgroundAnd() {

    }

    @Then("Background then")
    public void backgroundThen() {
        
        assertEquals(303, Calcs.sum(33, 3));

    }

    @Given("<username> and <password> are known")
    public void usernameAndPasswordAreKnown() {

    } // this is not taken into consideration since the scenario outline has to be written separately, like below

    @Given("a and 1 are known")
    public void aand1areknown() {

    }

    @Given("b and 2 are known")
    public void band2areknown() {
    }

    @When("the credentials are written")
    public void theCredentialsAreWritten() {

    }

    @And("the Login button is clicked")
    public void theLoginButtonIsClicked() {

    }

    @Then("The login is successful")
    public void theLoginIsSuccessful() {
    }

    @Given("I am logged in as Wilson")
    public void iAmLoggedInAsWilson() {

    }

    @When("I try to post to {string}")
    public void iTryToPostTo(String arg0) {
                    }

    @Then("I should see {string}.")
    public void iShouldSee(String arg0) {
        assertEquals(33333, Calcs.sum(3, 3));
    }

    @Given("there are {int} coffees left in the machine")
    public void thereAreCoffeesLeftInTheMachine(int arg0) {

    }

    @And("I have deposited {int} dollar")
    public void iHaveDepositedDollar(int arg0) {

    }

    @When("I press the coffee button")
    public void iPressTheCoffeeButton() {

    }

    @Then("I should be served a coffee")
    public void iShouldBeServedACoffee() {

    }

    @Given("there are {int} cucumbers")
    public void thereAreCucumbers(int arg0) {

    }

    @When("I eat {int} cucumbers")
    public void iEatCucumbers(int arg0) {

    }

    @Then("I should have {int} cucumbers")
    public void iShouldHaveCucumbers(int arg0) {
    }

    // commentsGT - passes
    @Given("the following users exist")
    public void theFollowingUsersExist() {

    }

    @But("Clicking the Create New requirement")
    public void clickingTheCreateNewRequirement() {

    }

    @And("Clicking the Create New defect")
    public void clickingTheCreateNewDefect() {

    }

    @When("Clicking the New Feature")
    public void clickingTheNewFeature() {

    }

    @Then("I should receive an email with")
    public void iShouldReceiveAnEmailWith() {
//        assertEquals(77, Calcs.sum(7, 7));
    }

    //    OnlineShoppingGT
    @Given("I'm in tablets search results")
    public void iMInTabletsSearchResults() {

    }

    @When("filter by price lower than one thousand")
    public void filterByPriceLowerThanOneThousand() {
        assertEquals(888, Calcs.sum(8, 8));

    }

    @Then("Only tablets with lower price will be presented")
    public void onlyTabletsWithLowerPriceWillBePresented() {
    }

    // fromYanivGT - fails

    @Given("some precondition")
    public void somePrecondition() {
    }

    @And("some other precondition")
    public void someOtherPrecondition() {
    }

    @When("some action by the actor")
    public void someActionByTheActor() {
    }

    @And("some other action")
    public void someOtherAction() {

    }

    @And("yet another action")
    public void yetAnotherAction() {

    }

    @Then("some testable outcome is achieved")
    public void someTestableOutcomeIsAchieved() {
//        assertEquals(55, Calcs.sum(5, 5));
    }


    @Given("I am in <module> module focused on a <entity>")
    public void iAmInModuleModuleFocusedOnAEntity() { // this is not taken into consideration since the scenario outline has to be written separately, like below

    }

    @Given("I am in defects module focused on a defect")
    public void iAmInDefectsModuleFocusedOnADefect() {

    }

    @Given("I am in requirements module focused on a requirement")
    public void iAmInRequirementsModuleFocusedOnARequirement() {

    }

    @When("Clicking the Create New <entity> to add a <entity>")
    public void clickingTheCreateNewEntityToAddAEntity() { // this is not taken into consideration since the scenario outline has to be written separately, like below

    }

    @When("Clicking the Create New defect to add a defect")
    public void clickingTheCreateNewDefectToAddADefect() {
//        assertEquals(66, Calcs.sum(6, 6));
    }

    @When("Clicking the Create New requirement to add a requirement")
    public void clickingTheCreateNewRequirementToAddAREquirement() {

    }

    @Then("Feature dialog is open")
    public void featureDialogIsOpen() {
    }


    @Given("there is abalbla")
    public void thereIsAbalbla() {

    }

    @When("the user blabla")
    public void theUserBlabla() {

    }

    @Then("the buttons blabla")
    public void theButtonsBlabla() {

        assertEquals(6666, Calcs.sum(6, 6));
    }

    @Given("there is a TEST")
    public void thereIsATEST() {
        assertEquals(7777, Calcs.sum(7, 7));

    }

    @When("the user modifies the SCRIPT")
    public void theUserModifiesTheSCRIPT() {

    }

    @Then("the buttons should APPEAR")
    public void theButtonsShouldAPPEAR() {
    }
}

//    assertEquals(100, Calcs.sum(7, 7));
//    String result = "hello";
//    assertEquals(result.length(), 555);

