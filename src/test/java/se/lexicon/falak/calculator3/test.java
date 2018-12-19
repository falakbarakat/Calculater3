package se.lexicon.falak.calculator3;


import org.junit.Assert;
import org.junit.*;
public class test {
    
	@Test
    //method in test class does not take prameters in baranteeth
    public void test_calculate_addition() {
        double number1 = 10;
        double number2 = 5;
        
        String operator = "+";
        
        // expected result 
        
        double expected = 15.0;
        
        // actual value 
        double actual = App.calculate3(number1, number2, operator);
        Assert.assertEquals(expected, actual ,0.1);
   } 
	
	@Test
	public void test_calculate_subtract() {
		double expected = -3.0;
		
		Assert.assertEquals(expected, App.calculate3(0, 3, "-"), 0);
	}
	
	@Test
	public void test_calculate_multiple() {
		double expected = 5.0;
		
		Assert.assertEquals(expected, App.calculate3(1, 5, "*"), 0);
	}
	
	@Test
	public void test_calculate_devision() {
		double expected = 2.0;
		
		Assert.assertEquals(expected, App.calculate3(10, 5, "/"), 0);
	}	
	
}		

//program id successful and tested