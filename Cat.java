package sec07.exam01_enum;

public class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	}
	
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}