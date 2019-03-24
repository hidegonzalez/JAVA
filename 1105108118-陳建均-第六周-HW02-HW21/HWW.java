import java.io.*;

public class HWW {
	public static void main(String[] args) throws IOException 
	{
		String str;
		int num,i=0,s=0;
		int a[]= new int[]{153,198,211,286,384,426,999};
		String b[]=new String[]{"A 區"," C 區"," E 區"," F 區","G 區","H 區","Z 區"};
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("請輸入代碼");
			num = Integer.parseInt(buf.readLine());
			for (i=0; i< a.length ; i++){
				if(num==a[i]){
					System.out.println(a[i]+"在"+b[i]);
					s++;
				}
				else if(s==0){
					System.out.println("商品不存在");}
			}
		s=0;	
		System.out.println("是否繼續");
		str = buf.readLine();
		}while(str.equals("y"));
}
}