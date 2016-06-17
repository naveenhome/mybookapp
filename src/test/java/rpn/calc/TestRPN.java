package rpn.calc;

import junit.framework.TestCase;

public class TestRPN extends TestCase{

	
	public void testCase1()
	{
		String expr = "2,3,+";
		RPNCalc obj = new RPNCalc();
		assertEquals(5, obj.Calculate(expr));
	}
	public void testCase5()
	{
		String expr = "2,3,-";
		RPNCalc obj = new RPNCalc();
		assertEquals(-1, obj.Calculate(expr));
	}
	public void testCase4()
	{
		String expr = "2,3,*";
		RPNCalc obj = new RPNCalc();
		assertEquals(-1, obj.Calculate(expr));
	}
	public void testCase2()
	{
		String expr = "2,2,+";
		RPNCalc obj = new RPNCalc();
		assertEquals(4, obj.Calculate(expr));
	}
	public void testCase3()
	{
		String expr = "2,2,+,4,+";
		RPNCalc obj = new RPNCalc();
		assertEquals(8, obj.Calculate(expr));
	}
}
