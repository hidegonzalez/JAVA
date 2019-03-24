import java.io.*;
class test {
	public static void main(String args[])throws IOException{
	RPGcharacter RPG =new RPGcharacter();
	BufferedReader buf =new BufferedReader(new InputStreamReader(System.in));
	System.out.print("請輸入姓名");
	RPG.name= buf.readLine();
	System.out.print("請輸入等級");
	RPG.level= Integer.parseInt(buf.readLine());
	System.out.print("請輸入職業");
	RPG.job= buf.readLine();
	System.out.print("請輸入技能");
	RPG.skill= buf.readLine();
	RPG.showProfile();
}
}
class RPGcharacter{
	String name,job,skill;
	int level;
	public void showProfile(){
		System.out.print("姓名:"+name+"等級:"+level+"職業:"+job+"技能:"+skill);
}
}