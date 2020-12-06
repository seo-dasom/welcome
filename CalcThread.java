package sec07.exam01_enum;

public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}
	
	public void run() {
		for(int i=0; i<2000000000; i++) {
		}
		System.out.println(getName());
	}
}