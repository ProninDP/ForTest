public class Test extends A {
  public int i = 1;

  public static void main(String[] args) {
    System.out.println(new Test().i);
    System.out.println(new A().i);
    System.out.println(((A)new Test()).i);
  }
}
class A{
  public int i = 2;
}