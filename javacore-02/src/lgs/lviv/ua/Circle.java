package lgs.lviv.ua;

public class Circle {
	private double radius = 5.5;
	private double diametr = 14.2;
	double p=3.14;
	double c=2*p*radius;
	double s=(p*diametr*diametr)/4;
	
	Circle(){}
	
	@Override
    public String toString() {
		return "Circle length" + c + ";\n"	+ "Circle square="+s;
	}}


