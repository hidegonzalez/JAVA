import java.io.*;
class test {
	public static void main(String args[])throws IOException{
	RPGcharacter RPG =new RPGcharacter();
	BufferedReader buf =new BufferedReader(new InputStreamReader(System.in));
	System.out.print("�п�J�m�W");
	RPG.name= buf.readLine();
	System.out.print("�п�J����");
	RPG.level= Integer.parseInt(buf.readLine());
	System.out.print("�п�J¾�~");
	RPG.job= buf.readLine();
	System.out.print("�п�J�ޯ�");
	RPG.skill= buf.readLine();
	RPG.showProfile();
}
}
class RPGcharacter{
	String name,job,skill;
	int level;
	public void showProfile(){
		System.out.print("�m�W:"+name+"����:"+level+"¾�~:"+job+"�ޯ�:"+skill);
}
}