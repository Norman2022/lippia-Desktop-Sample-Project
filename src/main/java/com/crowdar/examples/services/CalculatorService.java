package com.crowdar.examples.services;

import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {}

	public static void operacion(String num,String op, String num2) {

        if (num.length()==1){
            ActionManager.click(CalculatorConstants.NUMERO, num);
        }else{
            for (int i=0;i<num.length();i++){
                ActionManager.click(CalculatorConstants.NUMERO, String.valueOf((num.charAt(i))));
            }
        }


    	ActionManager.click(CalculatorConstants.OPERACION, op);


        if (num2.length()==1){
            ActionManager.click(CalculatorConstants.NUMERO, num2);
        }else{
            for (int i=0;i<num2.length();i++){
                ActionManager.click(CalculatorConstants.NUMERO, String.valueOf((num2.charAt(i))));
            }
        }

        ActionManager.click(CalculatorConstants.EQUAL);

    }
    
    public static void result(String resultado){
    	Assert.assertEquals(getResult(),resultado);
    }
    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("[a-zA-Z]+", "").trim();
    }

}
