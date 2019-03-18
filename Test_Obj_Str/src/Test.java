public class Test {
  public static void main(String[] args) {
    Object obj = new String("String object");
    String str = (String) new Object();
    System.out.println(obj);
    System.out.println(str);
  }
}
