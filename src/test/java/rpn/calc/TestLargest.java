package rpn.calc;

import junit.framework.TestCase;

public class TestLargest extends TestCase {
	
	public void testCase1() throws Exception
	{
		int [] arr= {5,6,4,8,3};
		Largest obj = new Largest();
		assertEquals(8, obj.find(arr));
	}
	public void testCase2() throws Exception
	{
		int [] arr= {5,6,4,8,9};
		Largest obj = new Largest();
		assertEquals(9, obj.find(arr));
	}
	public void testCase3() throws Exception
	{
		int [] arr= {-5,-6,-4,-8,-9};
		Largest obj = new Largest();
		assertEquals(-4, obj.find(arr));
	}
	public void testCase4()
	{
		try{
			
		
		int [] arr= {};
		Largest obj = new Largest();
		assertEquals(-4, obj.find(arr));
		fail();
		}catch (Exception ex)
		{
			//assertTrue(true);
			assertEquals("Array is empty", ex.getMessage());
		}
	}

}
