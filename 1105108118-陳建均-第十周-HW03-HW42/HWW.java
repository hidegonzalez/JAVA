import java.io.*;

public class HWW {
		public static void main(String[] args) throws IOException 
	{
		String str=null,str1=null,str2=null,str3,str4,str5;
        int n=0,f,g=0;
        String arr[]={"���h�_","�P��","���","þ�z��","�N����","�լ���","�Q����","���Ϥ�","�ñ�","�_��" };
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("�O�_��J�G");
		str3 = buf.readLine();
	if(Integer.parseInt(str3)==1){System.out.println("�п�J�W�l�G");
		str = buf.readLine();}
	System.out.println("�O�_��J�G");
		str4 = buf.readLine();
       if(Integer.parseInt(str4)==1){ System.out.println("�п�J�~�ءG");
            str1 = buf.readLine();
        for(f=0;f<arr.length;f++){
            if((str1.equals(arr[f]))){
                str1=str1;
            }
            else {str1="���ؤ�";}
        }}
	System.out.println("�O�_��J�G");
		str5 = buf.readLine();
        if(Integer.parseInt(str5)==1){System.out.println("�п�J�~���G");
		str2 = buf.readLine();}
        n=Integer.parseInt(str2);
        Dog dog=new Dog();
        Dog dog1=new Dog(str);
        Dog dog2=new Dog(str,str1);
        Dog dog3=new Dog(str,str1,n);
        if(Integer.parseInt(str3)==0){dog.show();}
        else if(Integer.parseInt(str3)==1){dog1.show();}
        else if((Integer.parseInt(str3)==1&&Integer.parseInt(str4)==1)){dog2.show();}
        else if((Integer.parseInt(str3))==1&&(Integer.parseInt(str4))==1&&(Integer.parseInt(str5))==1){dog3.show();}
	}
}
class Dog{
   private  String name,variety;
   private int age;
    Dog(){
        this(null,"���ؤ�",0);
    }
    Dog(String nName){
        this(nName,"���ؤ�",0);
    }
    Dog(String nName,String vVariety){
        this(nName,vVariety,0);
    } 
    Dog(String nName,String vVariety,int aAge) {
        setName( nName);
        setVariety( vVariety);
        setAge( aAge);
    }
    public void setName(String nName){
         name = nName;
    }
    public void setVariety(String vVariety){
             variety=vVariety;
    }
    public void setAge(int aAge){
        if(aAge>0){
            age=aAge;
        }
        else {
             age=1;}
    }
    public void show(){
       System.out.println("  �W�l  "+name+"  �~��  "+variety+"  �~��  "+age);
    }
}