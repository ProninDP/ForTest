public class TestMethodsthread {
	public static void main(String[] args) {
		TestMethodsthread testMethodsthread = new TestMethodsthread();
		Thread anotherThread = new Thread("Thread#2") {
			public void run() {
				staticMethod();
			}
		};
		anotherThread.start();
		testMethodsthread.instanceMethod();
	}
	public static synchronized void staticMethod(){
		System.out.println("Running static method");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e){
			System.out.println(Thread.currentThread().getName() + " interrupted!");
		}
		System.out.println("Exiting static method");
	}
	public synchronized void instanceMethod() {
		System.out.println("Running instance method");
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e){
			System.out.println(Thread.currentThread().getName() + " interupted");
		}
		System.out.println("Exiting instance method");
	}
}
