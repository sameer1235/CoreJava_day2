package accessfire;

class a {
	String name;
	String clgname="PDA Engineering college";
	protected void display(String name){
		System.out.println("your name is : "+name);
	}
	public void display1(){

		System.out.println("your college name is : "+clgname);
	}
	
}

public class Accessfire extends b {

	public static void main(String[] args) {
		a obj  = new a();
		obj.display("sam");
		obj.display1();
		Demo1 d = new Demo1();
		b obj2 =new b();
		obj2.pull();
		d.pull();
		
		
	}

}
