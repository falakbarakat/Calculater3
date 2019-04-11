package se.lexicon.falak.calculator3;


import org.junit.Assert;
import org.junit.*;
public class Sometest {
	private i_calculator cal2 = new calculatori();
	@Test
        public void test_calculate_addition() {
        double number1 = 10;
        double number2 = 5;
        String operator = "+";
        double expected = 15.0;
        double ratio=0.1;
        double actual = cal2.add(number1, number2);
        Assert.assertEquals(expected, actual ,ratio);
   } 
	
	@Test
	public void test_calculate_substract() {
		   double actual = cal2.substract(1, 4);
		   double expected = -3.0;
		   Assert.assertEquals(expected,actual, 0.1);
	}
	
	@Test
	public void test_calculate_multiple() {
		double expected = 8.0;
		Assert.assertEquals(expected,cal2.multiply(2, 4) , 0.1);
	}
	
	@Test
	public void test_calculate_devision() {
		double expected = 2.0;
		Assert.assertEquals(expected, cal2.devide(2, 4), 0.1);
	}	
	
}		

