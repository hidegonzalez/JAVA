public class hw16_04 {
	public static void main(String[] args) {
		try{
		Animal animal = new Horse();
		animal = (Bird) animal;
		}
		catch(ClassCastException e){
             System.out.println("wake up");
         }
	}
}
