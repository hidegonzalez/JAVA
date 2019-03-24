import java.io.*;

public class HH {
	public static void main(String[] args)throws IOException{
		String a;
		int b,c=0,d=0,e=0;

		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("請輸入數值");
		a = buf.readLine();
		String[] tokens = a.split(",");
		for(b=0;b<tokens.length;b++){
		System.out.print("");}
		if(b==1){c=Integer.parseInt(tokens[0]);method(c);}
		else if(b==2){c=Integer.parseInt(tokens[0]);d=Integer.parseInt(tokens[1]);method(c,d);}
		else if(b==3){c=Integer.parseInt(tokens[0]);d=Integer.parseInt(tokens[1]);e=Integer.parseInt(tokens[2]);method(c,d,e);}
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
