import java.io.*;

public class HH {
	public static void main(String[] args)throws IOException{
		String a,b,c,d;
		int aa,bb,cc;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�Ĥ@�Ӽƭ�");
		a = buf.readLine();
		aa=Integer.parseInt(a);
		System.out.print("�аݬO�_���� 2 �Ӽƭȭn��J?(y/n)�G");
		d = buf.readLine();
		if(d.equals("n")){method(aa);}
		else{
			System.out.print("�п�J�ĤG�Ӽƭ�");
			b = buf.readLine();
			bb=Integer.parseInt(b);
			System.out.print("�аݬO�_���� 3 �Ӽƭȭn��J?(y/n)�G");
			d = buf.readLine();
		if(d.equals("n")){method(aa,bb);}
		else{System.out.print("�п�J�ĤT�Ӽƭ�");
		c = buf.readLine();
		cc=Integer.parseInt(c);
		method(aa,bb,cc);}}
	}
	public static void method(int e){
		System.out.print("�o�O�@�Ӷ�ΡA���n���G"+e*e*3.14);
}
	public static void method(int f,int g){
		System.out.print("�o�O�@�ӯx�ΡA���n���G"+f*g);
}
	public static void method(int h,int i,int j){
		if((h*h+i*i)==(j*j)){
		System.out.print("�o�O�@�Ӫ����T���ΡA���n���G"+h*i/2);}
		else System.out.print("�o���O�@�Ӫ����T���ΡA�ڤ��|");
}
}
