package hw1;

//題目2:請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)

public class Homework2 {
	public static void main(String[] args) {
		int totalEggs = 200;
		int dozen = totalEggs / 12;
		int remainder = totalEggs % 12;
		
		System.out.println(totalEggs + "蛋顆共是" + dozen + "打" + remainder + "顆");
	}

}
