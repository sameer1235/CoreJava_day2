package accessfire;

class b{
	public void pull(){
		System.out.println("This is invoked from differnt class");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		b obj1 = new b();
		obj1.pull();
		

	}

	public void pull() {
		// TODO Auto-generated method stub
		System.out.println("This is invoked from differnt class Demo1");

		
	}

}
