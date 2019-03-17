public class Test {
	private static int s;
	Test(){
		s=0;
	}

	public static strictfp void main(String[] args) throws RuntimeException{
		Test t = new Test();
		t.s=5;
		System.out.println(s==t.s);
	}
}
