import java.io.*;

public class HH {
	public static void main(String[] args)throws IOException{
		int num_long , num_short;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("��έ��n���G" + circle(2.5) );
		System.out.print("����έ��n���G" + square(3) );
		System.out.print("�x�έ��n���G" + rectangle(4,8) );
		System.out.print("��έ��n���G" + traqezium(5,6,2) );
	}
	static double circle(double length1)
	{
	return 3.14*length1*length1;
	}
	static double square(double length1)
	{
	return length1*length1;
	}
	static double rectangle(double length1,double length2)
	{
	return length1 * length2;
	}
	static double traqezium(double length1,double length2,double length3)
	{
	return (length1 + length2)*length3/2;
	}
}