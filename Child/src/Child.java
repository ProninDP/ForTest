public class Child extends Parent{
	public Child() {
		super("a");
	}
	public Child(String s) {
		super(s);
	}

	public static void print(String s){
		System.out.println("Child: " + s);
	}

	public static void main(String[] args) {
		Child child = new Child("s");
		print("created");
	}
}
class Parent{
	public Parent(String s) {
		print("created");
	}
	public static void print(String s){
		System.out.println("Parent: " + s);
	}

}
