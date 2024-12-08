package LearnJava;

import java.util.Scanner;

public class Lab01Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chieu dai la: ");
		int height = scanner.nextInt();
		System.out.println("Chieu rong la: ");
		int width = scanner.nextInt();
		System.out.println("Chu vi la: " + (height + width) * 2);
		System.out.println("Dien tich la: " + (height * width));
		System.out.println("Canh nho nhat la: " + Math.min(height, width));
		scanner.close();
	}
}
