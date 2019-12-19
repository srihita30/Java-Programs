import java.util.Scanner; 

public class LargestOfSevenNumbers{
	public static void main(String[] args) {
		int a, b, c, d, e, f, g, Max, Min ; 
		System.out.println("Enter seven integers: ");

		Scanner in = new Scanner(System.in); 
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		e = in.nextInt(); 
		f = in.nextInt();
		g = in.nextInt();
		Max = a ; 
		if (b>Max)
			Max = b; 
		if (c>Max)
			Max = c; 
		if (d>Max)
			Max = d;
		if (e>Max)
			Max = e;
		if (f>Max)
			Max = f;
		if (g>Max)
			Max = g; 
		System.out.println ("Maximum number is " + Max); 

		Min = a ; 
		if (b<Min)
			Min = b;
		if (c<Min)
			Min = c;
		if (d<Min)
			Min = d; 
		if (e<Min)
			Min = e;
		if (f<Min)
			Min = f;
		if (g<Min)
			Min = g;   
		System.out.println("Minimum number is " + Min); 
	}
}