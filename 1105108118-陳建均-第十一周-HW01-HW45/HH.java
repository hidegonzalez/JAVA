import java.io.*;
public class HH {
	public static void main(String args[])throws IOException{
		String str;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		sportCar cc = new sportCar();
		System.out.println("�п�J���l�~�P");
		str = buf.readLine();
		cc.setbrand(str);
		System.out.println("�п�J���l����");
		str = buf.readLine();
		cc.setvechine(str);
		System.out.println("�п�J���l���̤j�ɳt");
		str = buf.readLine();
		cc.setkmh(Integer.parseInt(str));
		System.out.println("�п�J���l���̤j��t");
		str = buf.readLine();
		cc.setrpm(Integer.parseInt(str));
		cc.show();
}
}
class car{
		private String brand,vechine;
		car(){}
		car(String a, String b){
			setbrand(a);
			setvechine(b);
		}
		public void setbrand(String a){
				brand=a;
			}
			public void setvechine(String b){
				vechine=b;
			}
			public String getbrand(){
				return brand;
			}
			public String getvechine(){
				return vechine;
			}
			public void show(){
				System.out.println(brand+vechine);
			}
}
class sportCar extends car{
	private int kmh,rpm;
	sportCar(){}
	sportCar(int q,int v){
		super();
		setkmh(q);
		setrpm(v);
	}
	public void setkmh(int q){
				kmh=q;
	}
	public void setrpm(int v){
				rpm=v;
	}
	public int getkmh(){
				return kmh;
	}
	public int getrpm(){
				return rpm;
	}
	public void show(){
		System.out.print(getbrand()+getvechine()+","+"�̤j�ɳt��:"+kmh+"�̤j��t��:"+rpm);
	}
} 