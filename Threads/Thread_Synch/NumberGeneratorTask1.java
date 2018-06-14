package thread3.project;

public class NumberGeneratorTask1 implements Runnable {

	private static int count;
	private static String lock = new String();

	@Override
	public void run() {
		for (int i = 1; i <= 10000; i++) {
			updator();
		}
		System.out.println(count);
	}

	/*
	 * private static synchronized void updator() { count = count + 1; }
	 */
	private static void updator() {

		synchronized (Object.class) {
			count = count + 1;
		}
	}

	public static void main(String[] args) {

		NumberGeneratorTask1 task1 = new NumberGeneratorTask1();
		NumberGeneratorTask1 task2 = new NumberGeneratorTask1();
		ThreadGroup group1 = new ThreadGroup("Group1");
		ThreadGroup group2 = new ThreadGroup("Group2");

		Thread t1 = new Thread(group1, task1);
		Thread t2 = new Thread(group1, task1);
		Thread t3 = new Thread(group1, task1);

		Thread t4 = new Thread(group2, task2);
		Thread t5 = new Thread(group2, task2);
		Thread t6 = new Thread(group2, task2);

		t1.start();
		t2.start();
		t3.start();

		t4.start();
		t5.start();
		t6.start();

	}
}
