package Exam_apr20;

 class Sports {
	public void play() {
		System.out.println("spports class");
	}

}
class Football extends Sports{
	public void play() {
		System.out.println("foot ball is a game");
	}
}
class Rugby extends Sports{
	public void play() {
		System.out.println("Rugby ball is a game");
	}
}
public class main11{
	public static void main(String []args) {
		Sports s1=new Football();
		s1.play();
		Sports s2=new Rugby();
		s2.play();
		//Sports s2=new 
		// TODO Auto-generated constructor stub
	}
	
}


