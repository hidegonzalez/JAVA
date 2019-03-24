import java.io.*;
public class HH {
	public static void main(String args[])throws IOException{
		String str;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		employee cc = new employee();
		System.out.println("請輸入員工姓名");
		str = buf.readLine();
		cc.setname(str);
		System.out.println("請輸入員工手機:");
		str = buf.readLine();
		cc.settelephone(str);
		System.out.println("請輸入員工年資");
		str = buf.readLine();
		cc.setyear(Integer.parseInt(str));
		cc.show();
}
}
class employee{
		private String name,telephone ;
		private int year;
		public void setname(String n){
				name=n;
			}
			public void settelephone(String t){
				if(t.startsWith("09")){
				telephone=t;}
				else telephone="0912345678";
			}
			public void setyear(int y){
				if(y>=1&&y<=30){
				year=y;}
				else year=1;
			}
			public String getname(){
				return name;
			}
			public String gettelephone(){
				return telephone;
			}
			public int getsetyear(){
				return year;
			}
			public void show(){
				System.out.println("員工姓名:"+name);
				System.out.println("員工手機:"+telephone);
				System.out.println("員工年資:"+year);
			}
}
