package hw2;

//題目1:請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

public class Homework01 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i =2; i <= 1000; i += 2) {
			
			sum += i;
		}
		System.out.println("1到100之間的所有偶數和為:" + sum);
	}

}
