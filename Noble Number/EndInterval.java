import java.util.Scanner;

public class EndInterval {
	/*
	 * This method increases each digit of the EndInterval number to the power of
	 * its number of digits and finally, if the sum is equal to the main number,
	 * which is the input number, it prints that number.
	 */
	public static void sharifiNumber(int number, int digit) {

		int a = 0, sum = 0;
		int result = number;
		while (number > 0) {
			a = number % 10;
			sum += Math.pow(a, digit);
			number /= 10;
		}

		if (sum == result) {
			System.out.println(result);
		}
	}

	// This method counts the number of digits of the original number
	public static int isDigitCounter(int result) {
		int length = 0;
		while (result > 0) {
			result /= 10;
			length++;
		}
		return length;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int[] array = new int[number];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		for (int i = 0; i < number; i++) {
			for (int j = i + 1; j < number; j++) {
				sum += (array[i] * array[j]);
			}
		}

		// this number is end interval
		int start = 100;
		int end = sum * 2;

		for (int i = start; i < end; i++) {
			int result = isDigitCounter(i);
			sharifiNumber(i, result);
		}
		input.close();

	}

}
