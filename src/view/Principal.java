package view;
import controller.thread.ThreadId;
public class Principal {

	public static void main(String[] args) {
		for (int x = 1; x <= 5; x++) {
			Thread t  = new ThreadId(x);
			t.start();
		}

	}
}	
