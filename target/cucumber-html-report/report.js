$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1_Login.feature");
formatter.feature({
  "line": 1,
  "name": "User Login",
  "description": "",
  "id": "user-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4052000800,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validation of Login Screen",
  "description": "",
  "id": "user-login;validation-of-login-screen",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@LoginScenario"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to the \"SAUCEDEMOSITE\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the login page UI is validated",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SAUCEDEMOSITE",
      "offset": 23
    }
  ],
  "location": "StepDefinition.urlNavigation(String)"
});
formatter.result({
  "duration": 2707061400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.loginPageValidation()"
});
formatter.result({
  "duration": 253891500,
  "status": "passed"
});
formatter.after({
  "duration": 794232400,
  "status": "passed"
});
formatter.before({
  "duration": 1783979200,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Login Success - Standard User",
  "description": "",
  "id": "user-login;login-success---standard-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "user navigates to the \"SAUCEDEMOSITE\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "a user logs in with \"STANDARDUSER\" and \"PASSWORD\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user is redirected to the Saucedemo homepage",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SAUCEDEMOSITE",
      "offset": 23
    }
  ],
  "location": "StepDefinition.urlNavigation(String)"
});
formatter.result({
  "duration": 2540619100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "STANDARDUSER",
      "offset": 21
    },
    {
      "val": "PASSWORD",
      "offset": 40
    }
  ],
  "location": "StepDefinition.userLogin(String,String)"
});
formatter.result({
  "duration": 675929500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.successfulLogin()"
});
formatter.result({
  "duration": 187096500,
  "status": "passed"
});
formatter.after({
  "duration": 968867300,
  "status": "passed"
});
formatter.before({
  "duration": 2223170600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Failed - Locked Out User",
  "description": "",
  "id": "user-login;login-failed---locked-out-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "user navigates to the \"SAUCEDEMOSITE\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "a user logs in with \"LOCKEDUSER\" and \"PASSWORD\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "a \"LOCKED\" error message will be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SAUCEDEMOSITE",
      "offset": 23
    }
  ],
  "location": "StepDefinition.urlNavigation(String)"
});
formatter.result({
  "duration": 2891735300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOCKEDUSER",
      "offset": 21
    },
    {
      "val": "PASSWORD",
      "offset": 38
    }
  ],
  "location": "StepDefinition.userLogin(String,String)"
});
formatter.result({
  "duration": 589712700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LOCKED",
      "offset": 3
    }
  ],
  "location": "StepDefinition.unsuccessfulLogin(String)"
});
formatter.result({
  "duration": 374331500,
  "status": "passed"
});
formatter.after({
  "duration": 749436600,
  "status": "passed"
});
formatter.before({
  "duration": 1585555600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Login Failed - Invalid User",
  "description": "",
  "id": "user-login;login-failed---invalid-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "user navigates to the \"SAUCEDEMOSITE\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "a user logs in with \"INVALIDUSER\" and \"PASSWORD\"",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "a \"INCORRECT\" error message will be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SAUCEDEMOSITE",
      "offset": 23
    }
  ],
  "location": "StepDefinition.urlNavigation(String)"
});
formatter.result({
  "duration": 3086836500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INVALIDUSER",
      "offset": 21
    },
    {
      "val": "PASSWORD",
      "offset": 39
    }
  ],
  "location": "StepDefinition.userLogin(String,String)"
});
formatter.result({
  "duration": 560899200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "INCORRECT",
      "offset": 3
    }
  ],
  "location": "StepDefinition.unsuccessfulLogin(String)"
});
formatter.result({
  "duration": 266545400,
  "status": "passed"
});
formatter.after({
  "duration": 749073500,
  "status": "passed"
});
formatter.before({
  "duration": 2307073800,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Login Failed - Missing Username",
  "description": "",
  "id": "user-login;login-failed---missing-username",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user navigates to the \"SAUCEDEMOSITE\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "a user logs in with \"EMPTY\" and \"PASSWORD\"",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "a \"MISSING USERNAME\" error message will be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SAUCEDEMOSITE",
      "offset": 23
    }
  ],
  "location": "StepDefinition.urlNavigation(String)"
});
formatter.result({
  "duration": 3470600000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EMPTY",
      "offset": 21
    },
    {
      "val": "PASSWORD",
      "offset": 33
    }
  ],
  "location": "StepDefinition.userLogin(String,String)"
});
formatter.result({
  "duration": 511447700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MISSING USERNAME",
      "offset": 3
    }
  ],
  "location": "StepDefinition.unsuccessfulLogin(String)"
});
formatter.result({
  "duration": 401326800,
  "status": "passed"
});
formatter.after({
  "duration": 967853600,
  "status": "passed"
});
formatter.before({
  "duration": 3672995100,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Login Failed - Missing Password",
  "description": "",
  "id": "user-login;login-failed---missing-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "user navigates to the \"SAUCEDEMOSITE\" website",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "a user logs in with \"STANDARDUSER\" and \"EMPTY\"",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "a \"MISSING PASSWORD\" error message will be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "SAUCEDEMOSITE",
      "offset": 23
    }
  ],
  "location": "StepDefinition.urlNavigation(String)"
});
formatter.result({
  "duration": 2951907000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "STANDARDUSER",
      "offset": 21
    },
    {
      "val": "EMPTY",
      "offset": 40
    }
  ],
  "location": "StepDefinition.userLogin(String,String)"
});
formatter.result({
  "duration": 539056400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MISSING PASSWORD",
      "offset": 3
    }
  ],
  "location": "StepDefinition.unsuccessfulLogin(String)"
});
formatter.result({
  "duration": 232580500,
  "status": "passed"
});
formatter.after({
  "duration": 930447000,
  "status": "passed"
});
formatter.uri("2_Homepage.feature");
formatter.feature({
  "line": 2,
  "name": "Homepage",
  "description": "",
  "id": "homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HomepageScenarios"
    }
  ]
});
formatter.before({
  "duration": 2621920700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Validation of Homepage",
  "description": "",
  "id": "homepage;validation-of-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user has logged in successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the homepage page UI is validated",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.loginSuccessfully()"
});
formatter.result({
  "duration": 3602121700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.homepageValidation()"
});
formatter.result({
  "duration": 916981900,
  "status": "passed"
});
formatter.after({
  "duration": 1544469700,
  "status": "passed"
});
formatter.before({
  "duration": 2156592000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Filter - By Name(Z to A)",
  "description": "",
  "id": "homepage;filter---by-name(z-to-a)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "the user has logged in successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "the user filters the products by Name Z to A",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the products will be displayed in a descending name order",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.loginSuccessfully()"
});
formatter.result({
  "duration": 3330556200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.filterZtoA()"
});
formatter.result({
  "duration": 214728300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateZtoA()"
});
formatter.result({
  "duration": 92323600,
  "status": "passed"
});
formatter.after({
  "duration": 717943200,
  "status": "passed"
});
formatter.before({
  "duration": 2091643800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Filter - By Price (High to Low)",
  "description": "",
  "id": "homepage;filter---by-price-(high-to-low)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "the user has logged in successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "the user filters the products by Price High to Low",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the products will be displayed in a descending price order",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.loginSuccessfully()"
});
formatter.result({
  "duration": 3597168200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.filterHighToLow()"
});
formatter.result({
  "duration": 251028200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateHighToLow()"
});
formatter.result({
  "duration": 83433700,
  "status": "passed"
});
formatter.after({
  "duration": 1064324900,
  "status": "passed"
});
formatter.before({
  "duration": 2201513300,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Filter - By Price (Low to High)",
  "description": "",
  "id": "homepage;filter---by-price-(low-to-high)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "the user has logged in successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "the user filters the products by Price Low to High",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the products will be displayed in a ascending price order",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.loginSuccessfully()"
});
formatter.result({
  "duration": 3580313700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.filterLowToHigh()"
});
formatter.result({
  "duration": 231789200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateLowToHigh()"
});
formatter.result({
  "duration": 90060000,
  "status": "passed"
});
formatter.after({
  "duration": 745545300,
  "status": "passed"
});
formatter.before({
  "duration": 1849421500,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Add To Cart",
  "description": "",
  "id": "homepage;add-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "the user has logged in successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "the user adds products to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "the user\u0027s cart is updated",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.loginSuccessfully()"
});
formatter.result({
  "duration": 6893741900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.addToCart()"
});
formatter.result({
  "duration": 984688000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validateCartBadge()"
});
formatter.result({
  "duration": 802059200,
  "status": "passed"
});
formatter.after({
  "duration": 1931556500,
  "status": "passed"
});
formatter.uri("3_Checkout.feature");
formatter.feature({
  "line": 1,
  "name": "Checkout",
  "description": "",
  "id": "checkout",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2392683900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Checkout multiple products",
  "description": "",
  "id": "checkout;checkout-multiple-products",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@CheckoutScenario"
    }
  ]
});
formatter.after({
  "duration": 1380992200,
  "status": "passed"
});
});