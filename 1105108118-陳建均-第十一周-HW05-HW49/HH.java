import java.io.*;
public class HH {
	public static void main(String args[])throws IOException{
		String str;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		engineer cc = new engineer();
		System.out.println("�п�J�u�{�v�m�W");
		str = buf.readLine();
		cc.setname(str);
		System.out.println("�п�J�u�{�v���:");
		str = buf.readLine();
		cc.settelephone(str);
		System.out.println("�п�J�u�{�v�~��");
		str = buf.readLine();
		cc.setyear(Integer.parseInt(str));
		System.out.println("�п�J�u�{�v�~��");
		str = buf.readLine();
		cc.setsalary(Integer.parseInt(str));
		System.out.println("�п�J�u�{�v�M��");
		str = buf.readLine();
		cc.setskill(str);
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
			public int getyear(){
				return year;
			}
			public void show(){
				System.out.println("���u�m�W:"+name);
				System.out.println("���u���:"+telephone);
				System.out.println("���u�~��:"+year);
			}
			}
class engineer extends employee{
		private String skill;
		private int salary;
		private double yearsalary; 
		engineer(){}
		engineer( int s, String sk) {
			setsalary(s);
			setskill(sk);
		}
			public void setsalary(int s){
				salary=s;
			}
			public void setskill(String sk){
				skill=sk;
			}
			public int getsalary(){
					return salary;
			}
			public double getyearsalary(){
				if(getyear()<=5){
					yearsalary=salary*12*1.1;
					return yearsalary;
				}
				else if(getyear()>5&&getyear()<=15){
					yearsalary=salary*12*1.2;
					return yearsalary;
				}
				else if(getyear()>15&&getyear()<=25){
					yearsalary=salary*12*1.3;
					return yearsalary;
				}
				else if(getyear()>25&&getyear()<=30){
					yearsalary=salary*12*1.4;
					return yearsalary;
				}
				else return yearsalary=1;
			}
			public String getskill(){
				return skill;
			}
			public void show(){
				System.out.println("�u�{�v�m�W:"+getname());
				System.out.println("�u�{�v���:"+gettelephone());
				System.out.println("�u�{�v�~��:"+getyear());
				System.out.println("�u�{�v�M��:"+skill);
				System.out.println("�u�{�v�~��:"+salary);
				System.out.println("�u�{�v�~�s:"+getyearsalary());
			}
}