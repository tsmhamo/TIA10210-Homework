package hw2;

//題目3:請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

public class Homework03 {
	public static void main(String[] args) {

		int product = 1;
		int i = 1;

		while (i <= 10) {

			product *= i;

			i++;
		}
		System.out.println("1到10的連乘積為:" + product);
	}

}
