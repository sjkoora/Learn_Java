package Assignments;

class Mythread extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	}
}
public class multithreading {

	public static void main(String[] args) {
		Mythread t1 =new Mythread();
		Mythread t2 = new Mythread();
t1.start();
t2.start();
	}

}
