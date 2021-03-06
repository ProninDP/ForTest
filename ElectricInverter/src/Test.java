public class Test {
	public static void main(String[] args) {
		ElectricInverter electricInverter = new ElectricInverter();
		int AC =220;
		System.out.println(electricInverter.invert(AC));      // 0
	}
}
class ElectricInverter{
	public static final int AC = ~220;
	public static final int DC = -110;
	public static final int GROUND = 0;

	int invert(int i){
		if (i==AC) {
			return DC;
		} else if(i==DC){
			return AC;
		}
		return GROUND;
	}
}
