
public class LineComparison {

	 public void equalsMethod(Double LengthOfFirstLine,Double LengthOfSecondLine)
	    {
	    if (LengthOfFirstLine.equals(LengthOfSecondLine) )
	    {	
	        System.out.println("Lines Are Equal");
	    }
	    else
	    {
	        System.out.println("Lines are not equal");
	    }
	    }
	 
	 public void compareToMethod(Double LengthOfFirstLine,Double LengthOfSecondLine)
	    {
	    int compare = LengthOfFirstLine.compareTo(LengthOfSecondLine);
	    if ( compare == 0)
	    {
	        System.out.println("The Two Line are equal");
	    }
	    else if(compare < 0)
	    {
	        System.out.println("Line 2 is greater than Line 1 ");
	    }
	    else
	    {
	        System.out.println("Line 1 is greater than Line 2");
	    }
	    }
	    public static double lengthOfLine(int x1,int y1,int x2,int y2)
	    {
	    return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
	    }
	 public static void main(String[] args)
	    {
	    Double LengthOfFirstLine = lengthOfLine(2,5,6,10);
	    
	    Double LengthOfSecondLine = lengthOfLine(4,7,2,9);
	    
	    System.out.printf("Length of First Line is = %.2f \n",LengthOfFirstLine);
	    
	    System.out.printf("Length of Second Line is = %.2f \n",LengthOfSecondLine);
	    
	    LineComparison obj = new LineComparison();
	    
	    obj.equalsMethod(LengthOfFirstLine,LengthOfSecondLine);
	    
	    obj.compareToMethod(LengthOfFirstLine,LengthOfSecondLine);
	}

}
