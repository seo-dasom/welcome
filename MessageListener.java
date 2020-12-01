package sec07.exam01_enum;

public class MessageListener implements Button.OnClickListener {
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
	}
}