import java.io.*;

public class HWW {
	public static void main(String[] args) throws IOException 
	{
		String str;
		int num,i=0,s=0;
		int a[]= new int[]{153,198,211,286,384,426,999};
		String b[]=new String[]{"A ��"," C ��"," E ��"," F ��","G ��","H ��","Z ��"};
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("�п�J�N�X");
			num = Integer.parseInt(buf.readLine());
			for (i=0; i< a.length ; i++){
				if(num==a[i]){
					System.out.println(a[i]+"�b"+b[i]);
					s++;
				}
				else if(s==0){
					System.out.println("�ӫ~���s�b");}
			}
		s=0;	
		System.out.println("�O�_�~��");
		str = buf.readLine();
		}while(str.equals("y"));
}
}