import java.io.*;

public class HH {
	public static void main(String[] args)throws IOException{
		String a;
		int b,c=0,d=0,e=0;

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�ƭ�");
		a = buf.readLine();
		String[] tokens = a.split(",");
		for(b=0;b<tokens.length;b++){
		System.out.print("");}
		if(b==1){c=Integer.parseInt(tokens[0]);method(c);}
		else if(b==2){c=Integer.parseInt(tokens[0]);d=Integer.parseInt(tokens[1]);method(c,d);}
		else if(b==3){c=Integer.parseInt(tokens[0]);d=Integer.parseInt(tokens[1]);e=Integer.parseInt(tokens[2]);method(c,d,e);}
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
