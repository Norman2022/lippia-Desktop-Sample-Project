package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}

	public static void operacion(String num,String op, String num2) {
    	ActionManager.click(CalculatorConstants.NUMERO, num);
    	ActionManager.click(CalculatorConstants.OPERACION, op);
        ActionManager.click(CalculatorConstants.NUMERO,num2);
        ActionManager.click(CalculatorConstants.EQUAL);

    }
    
    public static void result(String resultado){
    	Assert.assertEquals(getResult(),resultado);
    }
    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("[a-zA-Z]+", "").trim();
    }

}
