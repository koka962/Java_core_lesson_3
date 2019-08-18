package lgs.lviv.ua;

public class Rectangle {
	
	private int length;
	private int width;
	int a=width*length;
	int p = 2*(width+length);
	
	Rectangle(){
		this.length = 5;
		this.width = 3;
		this.a=width*length;
		this.p= 2*(width+length);
	}
	Rectangle(int length, int width){
		this.length=length;
		this.width=width;
		this.a=width*length;
		this.p= 2*(width+length);
	}
	
	@Override
    public String toString() {
		return "Rectangle area=" + a +";\n" + "Rectangle perimetr="+p +".";
	}}
	
	
