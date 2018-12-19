package se.lexicon.falak.calculator3;

/**
 * Hello world!
 *
 */
public class App 
{
	public static double calculate3(double n1,double n2,String operator) {
		switch(operator) {
		case"+":
			return n1+n2;
		case "-":
			return n1-n2;
		case "*":
			return n1*n2;
		case "/":
			if (n1==0||n2==0){
				return 0;
			}			
			return n1/n2;
			default:
				return 0;
	     }
		
			
			
	}
}
   

