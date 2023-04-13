interface Shape {
	final double PI = 3.14;
	
	void draw();		// ���� �׸��� �߻� �޼ҵ�
	double getArea();	// ������ ���� ���� �߻� �޼ҵ�
	default public void redraw() { // ����Ʈ �޼ҵ�
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}

class Circle implements Shape {
	private double radius;
	
	public Circle() {
		this.radius = 0;
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("�������� " + (int)this.radius + "�� ���Դϴ�.");
	}
	
	public double getArea() {
		return this.radius * this.radius * PI;
	}
}

class Oval implements Shape {
	private int ovalX;
	private int ovalY;
	
	public Oval() {
		this.ovalX = 0; this.ovalY = 0;
	}
	
	public Oval(int ovalX, int ovalY) {
		this.ovalX = ovalX; this.ovalY = ovalY;
	}
	
	public void draw() {
		System.out.println(this.ovalX + "x" + this.ovalY + "�� �����ϴ� Ÿ���Դϴ�.");
	}
	
	public double getArea() {
		return this.ovalX * this.ovalY * PI;
	}
}

class Rect implements Shape {
	private int rectX;
	private int rectY;
	
	public Rect() {
		this.rectX = 0; this.rectY = 0;
	}
	
	public Rect(int rectX, int rectY) {
		this.rectX = rectX; this.rectY = rectY;
	}
	
	public void draw() {
		System.out.println(this.rectX + "x" + this.rectY +"ũ���� �簢�� �Դϴ�.");
	}
	
	public double getArea() {
		return this.rectX * this.rectY;
	}
}

public class JavaProgramingTest04 {

	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i = 0; i < list.length; i++) list[i].redraw();
		for(int i = 0; i < list.length; i++) System.out.println("������ " + list[i].getArea());
	}

}
