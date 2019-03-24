import java.io.*;

public class HWW {
		public static void main(String[] args) throws IOException 
	{
		String str;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        Car car=new Car("ACURA",123,2500,250);
        Car carr=new Car();
        Car carrr=new Car("shelby");
        Car carrrr=new Car("dodge",123);
        car.show();
        carr.show();
        carrr.show();
        carrrr.show();
	}
}
class Car{
   private  String name;
   private int length,engcc,speed;
    Car(){
        this(null,0,0,0);
    }
    Car(String modelName){
        this(modelName,0,0,0);
    }
    Car(String modelName,int carLength){
        this(modelName,carLength,0,0);
    } 
    Car(String modelName,int carLength,int engCC,int maxSpeed) {
        setModel( modelName);
        setCarlength( carLength);
        setEngcc( engCC);
        setMaxspeed( maxSpeed);
    }
    public void setModel(String modelName){
         name = modelName;
    }
    public void setCarlength(int carLength){
        if(carLength>0){
             length=carLength;
        }
        else {
             length=0;}
    }
    public void setEngcc(int engCC){
        if(engCC>=2000&&engCC<=5000){
            engcc=engCC;
        }
        else {
             engcc=0;}
    }
    public void setMaxspeed(int maxSpeed){
        if(maxSpeed>0&&maxSpeed<=400){
            speed=maxSpeed;
        }
        else {
             speed=0;}
    }
    public void show(){
       System.out.println("name:"+name+"  carlength:"+length+"  engcc:"+engcc+"  speed:"+speed);
    }
}