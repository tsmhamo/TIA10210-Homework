package hw1;

//題目3:請由程式算出256559秒為多少天、多少小時、多少分與多少秒

public class Homework3 {
	public static void main(String[] args) {
		int seconds = 256559;

		int days = seconds / (24 * 3600);
		seconds = seconds % (24 * 3600);

		int hours = seconds / 3600;
		seconds = seconds % 3600;

		int minutes = seconds / 60;
		seconds = seconds % 60;

		System.out.println("Days:" + days);
		System.out.println("Hours:" + hours);
		System.out.println("minutes:" + minutes);
		System.out.println("Seconds:" + seconds);

	}
}