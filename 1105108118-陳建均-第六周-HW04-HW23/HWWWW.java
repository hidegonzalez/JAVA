import java.io.*;

public class HWWWW {
	public static void main(String[] args) throws IOException 
	{
		String str;
		int array[]=new int[100];
		int arraya[]=new int[100];
		int arrayb[]=new int[100];
		int arrayc[]=new int[100];
		int arrayd[]=new int[100];
		int arrayx[]=new int[100];
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int v,z,aa,q=0,a=0,b=0,c=0,d=0,e=0,f=0,g=99,h=0,o=99,j=0,k=99,x=0,y=99;
		System.out.print("�п�J�ǥͤH�ơG");
		str = buf.readLine();
		System.out.println("");
		array = new int[Integer.parseInt(str)];
		e=Integer.parseInt(str);
		for(int i=0; i<array.length; i++)
		{
			System.out.print("�п�J��" + (i+1) + "�ǥͥ��ɦ��Z");
			str = buf.readLine();
			System.out.println("");
			array[i] = Integer.parseInt(str);
			System.out.print("�п�J��" + (i+1) + "�ǥʹ������Z");
			str = buf.readLine();
			System.out.println("");
			arraya[i] = Integer.parseInt(str);
			System.out.print("�п�J��" + (i+1) + "�ǥʹ������Z");
			str = buf.readLine();
			System.out.println("");
			arrayb[i] = Integer.parseInt(str);
		}
		for(int i=0; i<array.length; i++){
		for(int w=0;w<array.length;w++ )
				{
				 if((array[i]*0.3+arraya[i]*0.35+arrayb[i]*0.35)<60){
				 arrayc[w]=(int)((array[i]*0.3+arraya[i]*0.35+arrayb[i]*0.35));
				 arrayd[w]=i;}
		}}
		for(int i=0; i<array.length; i++){		
				arrayx[i]=(int)(array[i]*0.3+arraya[i]*0.35+arrayb[i]*0.35);
		}
		for(int i=0; i<array.length; i++)
		{ 
			if(89<arrayx[i]){
			a++;
			}
			else if(79<arrayx[i]){
			b++;
			}
			else if(69<arrayx[i]){
			c++;
			}
			else if(59<arrayx[i]){
			d++;
			}
			else if(0<arrayx[i]){
			q++;
			}
		}
		for(int i=0; i<array.length; i++)
		{ 
			if(array[i]>=f){
				f=array[i];
				}
				else if(array[i]<=g){
				g=array[i];
				}
			if(arraya[i]>=h){
				h=arraya[i];
				}
				else if(arraya[i]<=o){
				o=arraya[i];
				}
			if(arrayb[i]>=j){
				j=arrayb[i];
				}
				else if(arrayb[i]<=k){
				k=arrayb[i];
				}
			if((array[i]*0.3+arraya[i]*0.35+arrayb[i]*0.35)>=x){
				x=(int)(array[i]*0.3+arraya[i]*0.35+arrayb[i]*0.35);
				}
				else if((array[i]*0.3+arraya[i]*0.35+arrayb[i]*0.35)<=y){
				y=(int)(array[i]*0.3+arraya[i]*0.35+arrayb[i]*0.35);
				}
		}
		
			do{
			System.out.print("�п�J�\��");
			str = buf.readLine();
			z= Integer.parseInt(str);
			switch(z){
			case 1:
				for(int i=0; i<array.length; i++)
				{System.out.print("��"+i+"��P��");
				 System.out.print("����"+array[i]);
				 System.out.print("����"+arraya[i]);
				 System.out.print("����"+arrayb[i]);
				 System.out.println("�Ǵ�"+(array[i]*0.3+arraya[i]*0.35+arrayb[i]*0.35));
					}
				 break;

			case 3: 
				 System.out.println(",60-70,"+d+",70-80,"+c+",80-90,"+b+",90-100,"+a+",0-60,"+q);
				break;

			case 2: for(int i=0; i<array.length; i++){
					 System.out.print("��"+(i+1)+"��P��");
					 System.out.println(arrayc[i]+"��");}
				break;

			case 4:  System.out.println("�ǥͿ��");
				 str = buf.readLine();
				 v= Integer.parseInt(str);
				 System.out.print("����"+array[v]);
				 System.out.print("����"+arraya[v]);
				 System.out.print("����"+arrayb[v]);
				 System.out.println("�Ǵ�"+(array[v]*0.3+arraya[v]*0.35+arrayb[v]*0.35));
				 break;
				
			case 5: System.out.println("���Z���");
				str = buf.readLine();
				switch(str){
				case "a": System.out.print("��"+f);
					System.out.print("�C"+g);
					break;
				case "b": System.out.print("��"+h);
					System.out.print("�C"+o);
					break;
				case "c": System.out.print("��"+j);
					System.out.print("�C"+k);
					break;
				case "d": System.out.print("��"+x);
					System.out.print("�C"+y);
					break;
				}
				break;
}
			System.out.println("�O�_�~��");
			str = buf.readLine();
}while(str.equals("y"));	
}
}