package sec07.exam01_enum;

public class TargetThread extends Thread {
	public void run() {
		for(long i=0; i<100000000; i++) {}
		
		try {
			//1.5초간 일시 정지
			Thread.sleep(1500);
		} catch(Exception e) {}
		
		for(long i=0; i<100000000; i++) {}
	}
}