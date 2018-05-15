package irvinecompany.pages

import geb.Page
import groovy.util.logging.Log4j

@Log4j
class LoginPage extends Page{

    static url = "https://residents.irvinecompanyapartments.com/Account/LogOn"
    static at = {
        title == "Irvine Company Apartment Communities | Resident Log In"
        loginContainer.displayed
    }
    static content = {
        loginContainer(wait: 30, required: true) { $("div#loginContainer") }
        userNameTexbox(required: true) { $("input#LoginUserName") }
        passwordTextbox(required: true) { $("input#LoginPassword") }
        signinBtn { $("input[type=submit]") }
        rememberMeCheckbox { $("input#RememberMe") }
        forgotCredsBtn { $("a.forgot") }
        registerBtn { $("a.register") }
        validationErrorText { $("div.validation-summary-errors li").text() }
    }

}
