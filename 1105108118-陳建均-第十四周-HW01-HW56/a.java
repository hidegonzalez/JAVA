import java.io.*;
import java.util.*;
 public class a{
     public static void main (String[] args)throws IOException{
         BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
         String n,s,p,a;
         int y;
         System.out.print("name");
		 n = buf.readLine();
         System.out.print("sex");
		 s = buf.readLine();
         System.out.print("phone");
		 p = buf.readLine();
         System.out.print("address");
		 a = buf.readLine();
         System.out.print("year");
		 y = Integer.parseInt(buf.readLine());
         employee  first=new Basic_Employee(n,s,p,a,y);
         first.show();
         employee  second=new managers(n,s,p,a,y);
         second.show();
         employee  third=new supervisors(n,s,p,a,y);
         third.show();
     }
 }
abstract class employee{
    private String name;
    private String sex;
    private String phone;
    private String address;
    private int year;
    public employee(String na ,String se,String ph ,String ad,int ye){
        setaddress(ad);
        setname(na);
        setphone(ph);
        setsex(se);
        setyear(ye);
    }
    public void setname(String na){
        name=na;
    }
    public void setsex(String se){
        sex=se;
    }
    public void setphone(String ph){
        phone=ph;
    }
    public void setaddress(String ad){
        address=ad;
    }
    public void setyear(int ye){
        year=ye;
    }
    public String getname(){
        return name;
    }
    public String getsex(){
        return sex;
    }
    public String getphone(){
        return phone;
    }
    public String getaddress(){
        return address;
    }
    public int getyear(){
        return year;
    }
    public abstract double salary( );
    public abstract void show( );
} 
 class Basic_Employee extends employee{
    private double salary;
    public Basic_Employee(String na ,String se,String ph ,String ad,int ye){
        super(na,se,ph,ad,ye);
        setBasic_Employeesalary(salary);
    }
    public void setBasic_Employeesalary(double salary){
        this.salary=30000+getyear()*1500;
    }
    public double salary(){
        return salary;
    }
    public double getBasic_Employeesalary(){
        return salary;
    }
    public void show(){
        System.out.println("name: "+getname()+" sex:"+getsex()+" phone:"+getphone()+" address: "+getaddress()+" year: "+getyear()+"salary"+salary());
    }
}
 class managers extends employee{
    private double salary;
    public managers(String na ,String se,String ph ,String ad,int ye){
        super(na,se,ph,ad,ye);
        setmanagers(salary);
    }
    public void setmanagers(double salary){
        this.salary=50000+getyear()*2500+1800+5000;
    }
    public double salary(){
        return salary;
    }
    public double getmanagers(){
        return salary;
    }
    public void show(){
        System.out.println("name: "+getname()+" sex:"+getsex()+" phone:"+getphone()+" address: "+getaddress()+" year: "+getyear()+"salary"+salary());
    }
}
 class supervisors extends employee{
    private double salary;
    public supervisors(String na ,String se,String ph ,String ad,int ye){
        super(na,se,ph,ad,ye);
        setsupervisors(salary);
    }
    public void setsupervisors(double salary){
        this.salary=50000+getyear()*2500+3000+1800;
    }
    public double salary(){
        return salary;
    }
    public double getsupervisors(){
        return salary;
    }
    public void show(){
        System.out.println("name: "+getname()+" sex:"+getsex()+" phone:"+getphone()+" address: "+getaddress()+" year: "+getyear()+"salary"+salary());
    }
}