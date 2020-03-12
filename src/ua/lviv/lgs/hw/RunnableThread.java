package ua.lviv.lgs.hw;

import java.util.ArrayList;
import java.util.Collections;

public class RunnableThread implements Runnable {
	@Override
	public void run() {
		MyThread thread = new MyThread();
		ArrayList<Integer> aray = thread.Fibonachi();
		Collections.reverse(aray);

		System.out.print("Потік Runnable: ");
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
}
