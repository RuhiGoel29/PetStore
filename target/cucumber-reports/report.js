$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PetStore.feature");
formatter.feature({
  "line": 2,
  "name": "petstore feature file",
  "description": "",
  "id": "petstore-feature-file",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 452600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User sets the base url",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I set the base url for pet store",
  "keyword": "Given "
});
formatter.match({
  "location": "PetStoreStepDefinitions.i_set_the_base_url_for_pet_store()"
});
formatter.result({
  "duration": 87294799,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Implementing the API automated checks for DEMO PET STORE",
  "description": "",
  "id": "petstore-feature-file;implementing-the-api-automated-checks-for-demo-pet-store",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@TC_01"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I GET all the available pets",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I validate the status code of API is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I POST a new available pets in the store",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I validate the status code of API is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I PUT the pet status to sold",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I validate the status code of API is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "PetStoreStepDefinitions.i_GET_all_the_available_pets()"
});
formatter.result({
  "duration": 6881921800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 37
    }
  ],
  "location": "PetStoreStepDefinitions.i_validate_the_status_code_of_API_is(int)"
});
formatter.result({
  "duration": 8883101,
  "status": "passed"
});
formatter.match({
  "location": "PetStoreStepDefinitions.i_POST_a_new_available_pets_in_the_store()"
});
formatter.result({
  "duration": 1765851201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 37
    }
  ],
  "location": "PetStoreStepDefinitions.i_validate_the_status_code_of_API_is(int)"
});
formatter.result({
  "duration": 114900,
  "status": "passed"
});
formatter.match({
  "location": "PetStoreStepDefinitions.i_PUT_the_pet_status_to_sold()"
});
formatter.result({
  "duration": 1633136100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 37
    }
  ],
  "location": "PetStoreStepDefinitions.i_validate_the_status_code_of_API_is(int)"
});
formatter.result({
  "duration": 423801,
  "status": "passed"
});
formatter.after({
  "duration": 125400,
  "status": "passed"
});
});