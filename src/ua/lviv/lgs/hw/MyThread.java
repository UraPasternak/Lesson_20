package ua.lviv.lgs.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class MyThread extends Thread {
	@Override
	public void run() {
		ArrayList<Integer> aray = Fibonachi();
		System.out.print("Потік Thread: ");

		for (int a : aray) {
			try {
				Thread.sleep(1000);
				System.out.print(a + " ");
			} catch (Exception e) {
				System.out.println("Помилка виконання");
			}
		}
		System.out.println("");
	}

	public ArrayList<Integer> Fibonachi() {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int numer = scan.nextInt();
		ar.add(1);
		ar.add(1);

		for (int i = 1; i < numer - 1; i++) {
			int num = i + ar.get(i - 1);
			ar.add(num);
		}

		return ar;

	}

}
