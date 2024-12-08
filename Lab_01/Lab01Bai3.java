package LearnJava;

import java.util.Scanner;

public class Lab01Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Canh lap phuong la: ");
		double canh = scanner.nextDouble();
		System.out.println("The tich lap phuong la: " + Math.pow(canh, 3));
		scanner.close();
	}
}
