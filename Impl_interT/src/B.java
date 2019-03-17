public class B implements Inter<String> {
	public static void main(String[] args) {
		new B().fun();
	}
	public String fun() {
		System.out.println("B");
		return null;
	}
}
/*class C implements Inter<Boolean> {
	@Override
	public Boolean fun() {
		return fun();
	}
}*/
class C extends B {/*implements Inter<Boolean> {
	@Override
	public Boolean fun() {
		return fun();
	}
}*/
}
interface Inter<T> {
	T fun();
}