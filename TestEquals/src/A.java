import static java.lang.System.*;
public class A {
	public static void main(String[] args) {
		B b1 = new B("one", "two");
		B b2 = new B("one", "two");
		B b3 = b1;
		out.println(b1==b2);
		out.println(b1==b3);
		out.println(b2==b3);
		out.println(b1.equals(b2));
		out.println(b1.equals(b3));
		out.println(b3.equals(b2));
	}
}
class B{
	public B(String prop1, String prop2){
		this.prop1= prop1;
		this.prop2=prop2;
	}
	private String prop1 = null;
	private String prop2 = null;
}
