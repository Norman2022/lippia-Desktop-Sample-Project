package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.ca.Cal;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {




    @When("{string} {string} con {string}")
    public void numeroOperacionConNumero(String num,String op,String num2) {
            CalculatorService.operacion(num, op, num2);

    }


    @Then("Result is {string}")
    public void resultIsResultado(String resultado) {
        CalculatorService.result(resultado);    }
}
