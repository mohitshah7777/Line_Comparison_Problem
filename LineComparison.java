import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {

		System.out.println("Enter coordinates of line 1");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter x1, x2, y1, y2 = ");
		int ax1=scan.nextInt();
		int ax2=scan.nextInt();
		int ay1=scan.nextInt();
		int ay2=scan.nextInt();
		
		int diff_ax=ax2-ax1;
		int power=2;
		int diff_ay=ay2-ay1;
		Double length1=Math.sqrt(Math.pow(diff_ax,power) + Math.pow(diff_ay,power));
		System.out.println("Length of line 1 is = " + length1);	
	
		System.out.println("Enter coordinates of line 2");		
		System.out.print("Enter x1, x2 ,y1 ,y2 = ");
		int bx1=scan.nextInt();
		int bx2=scan.nextInt();
		int by1=scan.nextInt();
		int by2=scan.nextInt();
		
		int diff_bx=bx2-bx1;
		int diff_by=by2-by1;
		Double length2=Math.sqrt(Math.pow(diff_bx,power) + Math.pow(diff_by,power));
		System.out.println("Length of line 2 is = " + length2);	
	}

}
