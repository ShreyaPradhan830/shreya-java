package Multithread;

public class MultiApplication {
	
	public static void main(String[] args) {
        // Create an instance of Runnable1
        Runnable r1 = new Runnable1();
        // Create a thread (t1) and associate it with the first runnable instance (r1)
        Thread t1 = new Thread(r1);

        // Create an instance of Runnable2
        Runnable r2 = new Runnable2();
        // Create a thread (t2) and associate it with the second runnable instance (r2)
        Thread t2 = new Thread(r2);

        // Start the first thread (t1)
        t1.start();
        // Start the second thread (t2)
        t2.start();
    }
}

// Implementation of the Runnable interface for handling integers
class Runnable1 implements Runnable {
    // Run method to be executed when the thread starts
    public void run() {
        // Loop from 1 to 10 and print each integer
        for (int i = 1; i <= 10; i++) {
            System.out.println("Integer:" + i);
        }
    }
}

// Implementation of the Runnable interface for handling alphabets
class Runnable2 implements Runnable {
    // Run method to be executed when the thread starts
    public void run() {
        // Loop through alphabets from 'A' to 'Z' and print each alphabet
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println("Alphabet:" + ch);
        }
    }
}
