import java.util.*;

public class Lab8
{
	static ScalesSolution s = new ScalesSolution(5);
	public static void main(String args[])
	{
		/*
		System.out.println(CS2004.ReadNumberFile("src\\1000 Primes.txt"));
		for(int i=0;i<10;++i)
		{
			int x = CS2004.UI(0, 1);
			System.out.println(x);
		}
		
		ScalesSolution s = new ScalesSolution("10101x");
		s.println();
		*/
		
		/*
		ArrayList<Double> weights = new ArrayList<Double>();
		double a=1,b=2,c=3,d=4,e=10;
		weights.add(a);
		weights.add(b);
		weights.add(c);
		weights.add(d);
		weights.add(e);
		System.out.println(weights);
		s.println();
		System.out.println(s.ScalesFitness(weights));
		*/
		
		ArrayList<Double> NumberFile = CS2004.ReadNumberFile("src\\1000 Primes.txt");
		double Average=0;
		double xs;
		double NewAverage;
		
		for(int i=0;i<1000;i++)
		{
			ScalesSolution Scale1000 = new ScalesSolution(100);
			xs=Scale1000.ScalesFitness(NumberFile);
			Average+=xs;
		}
		NewAverage=Average/100;
		System.out.println(NewAverage);
	}
}