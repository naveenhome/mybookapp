package rpn.calc;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps {

	Book book = new Book();
	
	@Given("^user choose on \"([^\"]*)\"$")
	public void user_choose_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		book.setbName(arg1);
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^new window open with details \"([^\"]*)\", author \"([^\"]*)\" price \"([^\"]*)\"$")
	public void new_window_open_with_details_author_price(String arg1, String arg2, String arg3) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}


}
