import java.io.*;

public class Q_1 {
	public static void main(String arg[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�b�|�G");
		double r = Double.parseDouble(buf.readLine());
		Circle c = new Circle(r);
	}
}
class Circle {
	private  double pi = 3.14;

	Circle(double r) {
		System.out.println("�ꪺ���n��:" + r*r*pi);
	}
}
//�令private�u���o�����O��