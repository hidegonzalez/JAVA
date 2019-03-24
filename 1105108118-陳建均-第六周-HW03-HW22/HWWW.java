import java.io.*;

public class HWWW {
	public static void main(String[] args) throws IOException 
	{
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		int num,a=0,re;
		int arr[]=new int[6];
		int arra[]=new int[6];
		for(int i= 0;i<6 ;i++){
			double d = Math.random();
			num = (int) (d*49)+1;
			arr[i] = num;
		}
			for(int b = 1;b<6;b++){
				if(arr[b]<arr[b-1]){
					re = arr[b];
					arr[b] = arr[b-1];
					arr[b-1] = re;
				}	
			}
		for(int b = 1;b<6;b++){
			arra[b]=arr[b];}
		for(int c = 0; c < 6 ; c++){
			for(int b = 0;b<6;b++){
				{
				if(arra[c]==arr[a]){
					arr[b]= (int) (Math.random()*6)+1 ;
				}}	
			}
		}
		for(int c = 0; c < 6 ; c++){
			for(int b = 1;b<6;b++){
				if(arr[b]<arr[b-1]){
					re = arr[b];
					arr[b] = arr[b-1];
					arr[b-1] = re;
				}	
			}
		}
		for(int c = 0; c < 6 ; c++){
		System.out.print("¼Ö³z¸¹½X"+arr[c]);}
}
}