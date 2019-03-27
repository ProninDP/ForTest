public class TestStaticFinal {
  static int b = TestStaticFinal.a;
  static final int a=3;

  public static void main(String[] args) {
    System.out.println("a= " + a + ", b= " + b);
  }
}
