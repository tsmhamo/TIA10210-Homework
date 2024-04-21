package hw1;

//題目4:請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長

public class Homework4 {
	public static final double PI = 3.1415;

	public static void main(String[] args) {
		double radius = 5.0;

		double area = PI * radius * radius;

		double circumference = 2 * PI * radius;

		System.out.println("圓面積:" + area);

		System.out.println("圓周長:" + circumference);
	}
}
