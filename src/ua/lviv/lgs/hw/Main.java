package ua.lviv.lgs.hw;

public class Main {

	public static void main(String[] args) {
		MyThread a = new MyThread();
		a.run();
		
		RunnableThread b = new RunnableThread();
		b.run();

	}

}
