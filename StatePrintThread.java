package sec07.exam01_enum;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5초 일시 정지
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}