class A {
	String name = "a ";
	String test() {
		return "test A ";
	}
}
class B extends A {
	String name = "b ";
	String test() {
		return "test B ";
	}
}
public class ABgo {
	public static void main(String[] args) {
		new ABgo().go();
	}
	void go(){
		A m = new B();
		System.out.println(m.name + m.test());
	}
}
