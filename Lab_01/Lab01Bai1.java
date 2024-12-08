package LearnJava;

import java.util.Scanner;

public class Lab01Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ho va ten: ");
		String name = scanner.nextLine();
		System.out.println("Diem trung binh: ");
		int score = scanner.nextInt();
		System.out.println("Sinh vien " + name + " co diem trung binh la: " + score);
		scanner.close();
	}
}
