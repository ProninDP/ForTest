class Y {
  public Y() {
    System.out.println("Y");
  }
}
class Z{
  public Z() {
    System.out.println("Z");
  }
}
public class X extends Z {
  private Y m_objY = new Y();
  public X() {
    System.out.println("X");
  }
  public static void main(String[] args) {
   X x = new X();
  }
}
