package se.lexicon.falak.calculator3;

public class calculatori implements i_calculator {
	public static Object cal;

	double calculate(double num1,double num2, String operator) {
    	switch (operator) {
    	case"+":
    		return add(num1, num2);
    	case "-":
    		return substract(num1,num2);
    	case"*":
    			
    	    return multiply(num1,num2);
    	case "/":
    		return devide(num1,num2);
    	
    		default:
    			throw new IllegalArgumentException("operator : "+operator+" is not valid ");
    	}
	}	

@Override
public double add(double num1,double num2) {
	return num1+num2;
}

@Override
public double substract(double num1, double num2) {
		return  num1-num2;
}

@Override
public double devide(double num1, double num2) {
	 
	 if (num2==0) {
		 System.out.println("unable to divide by zero ");
		 return 0;
	 }
return num1/num2;
}


@Override
public double multiply(double num1, double num2) {
	return num1*num2;
}
}
