package controller.thread;

public class ThreadId extends Thread {
	private int x;
	
	public ThreadId(int x) {
		this.x=x;
	}
	@Override
	public void run() {
		imprime();
	}
	private void imprime(){
		int tempo = 10;
		try {
			sleep(x * tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread " + x + " TID = " + getId());
	}
}