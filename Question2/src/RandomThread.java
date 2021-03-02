import java.util.Random;

class RandomThread implements Runnable {

	Random r = new Random();

	int num;

	public void run() {

		num = r.nextInt(10) + 1;

	}

	int getNumber() {

		return num;

	}

	public static void main(String args[]) throws InterruptedException {

		RandomThread thread1 = new RandomThread();

		RandomThread thread2 = new RandomThread();

		RandomThread thread3 = new RandomThread();

		RandomThread thread4 = new RandomThread();

		RandomThread thread5 = new RandomThread();

		Thread t1 = new Thread(thread1);

		Thread t2 = new Thread(thread2);

		Thread t3 = new Thread(thread3);

		Thread t4 = new Thread(thread4);

		Thread t5 = new Thread(thread5);

		t1.start();

		t2.start();

		t3.start();

		t4.start();

		t5.start();

		t1.join();

		t2.join();

		t3.join();

		t4.join();

		t5.join();

		System.out.println("rt1: " + thread1.getNumber());

		System.out.println("rt2: " + thread2.getNumber());

		System.out.println("rt3: " + thread3.getNumber());

		System.out.println("rt4: " + thread4.getNumber());

		System.out.println("rt5: " + thread5.getNumber());

		int sum = 0;

		sum = sum + thread1.getNumber();

		sum = sum + thread2.getNumber();

		sum = sum + thread3.getNumber();

		sum = sum + thread4.getNumber();

		sum = sum + thread5.getNumber();

		System.out.println("Sum of random numbers generated: " + sum);

	}

}