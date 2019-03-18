
class A{
  private int counter = 0;
  public static int getInstanceCount(){
    return counter;
  }
  public A(){
    counter++;
  }
}
public class B{
  public static void main(String args[]){
    A a1= new A();
    A a2= new A();
    A a3= new A();
    System.out.println(A.getInstanceCount());
  }
}