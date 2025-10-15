package day26;

public class Numeric extends Thread {
	public Numeric() {
	}

	public Numeric(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 26; i++) {
			System.out.println("\t" + i);
		}
	}
}
