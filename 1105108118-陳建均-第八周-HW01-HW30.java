import java.io.*;

public class HH {
	public static void main(String[] args)throws IOException{
		String a,b,c,d;
		int aa,bb,cc;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入第一個數值");
		a = buf.readLine();
		aa=Integer.parseInt(a);
		System.out.print("請問是否有第 2 個數值要輸入?(y/n)：");
		d = buf.readLine();
		if(d.equals("n")){method(aa);}
		else{
			System.out.print("請輸入第二個數值");
			b = buf.readLine();
			bb=Integer.parseInt(b);
			System.out.print("請問是否有第 3 個數值要輸入?(y/n)：");
			d = buf.readLine();
		if(d.equals("n")){method(aa,bb);}
		else{System.out.print("請輸入第三個數值");
		c = buf.readLine();
		cc=Integer.parseInt(c);
		method(aa,bb,cc);}}
	}
	public static void method(int e){
		System.out.print("這是一個圓形，面積為："+e*e*3.14);
}
	public static void method(int f,int g){
		System.out.print("這是一個矩形，面積為："+f*g);
}
	public static void method(int h,int i,int j){
		if((h*h+i*i)==(j*j)){
		System.out.print("這是一個直角三角形，面積為："+h*i/2);}
		else System.out.print("這不是一個直角三角形，我不會");
}
}
