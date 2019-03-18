public class Personal {
  private String name;
  public Personal(String name){
    this.name=name;
  }
  public boolean equals(Personal p){
    return this.name.equals(this.name);
  }

  public static void main(String[] args) {
    Personal personal = new Personal("A");
    System.out.println(personal.equals(personal));
  }
}
