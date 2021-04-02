public class LineComparison {

	public Double LengthOfLine(Double x1, Double x2, Double y1, Double y2)
	{
		Double lengthofline=Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		//System.out.println("Length of line is = " + lengthofline);
		return lengthofline;
	}
	
	public static boolean equalMethod(Double val1, Double val2)
	{
		System.out.println("Are both the lines equal? " + val1.equals(val2));
		return val1.equals(val2);
	}
	
	public static void compareMethod(Double val1, Double val2)
	{
		int compare=(val1.compareTo(val2));
		if(compare > 0)
			System.out.println("Length of line 1 is greater");
		else if(compare < 0)
			System.out.println("Length of line 2 is greater");
		else
			System.out.println("Lengths are equal");
	}
	
	public static void main(String[] args) {

		LineCompOOP obj1 = new LineCompOOP();
		LineCompOOP obj2 = new LineCompOOP();
		
		Double val1=obj1.LengthOfLine(1.0, 2.0, 4.0, 5.0);
		System.out.println("Length of line 1 is = "+val1);
		Double val2=obj2.LengthOfLine(4.0, 5.0, 6.0, 9.0);
		System.out.println("Length of line 2 is = "+val2);
		
		equalMethod(val1, val2);
		compareMethod(val1, val2);
		
	}
}
