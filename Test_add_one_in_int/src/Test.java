public class Test {
	public static void main(String[] args) {
		int i = 1;
		add(i++);
		System.out.println(i);
	}
	static void add(int i) {
		i+=2;
	}
}
