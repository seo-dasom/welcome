package sec07.exam01_enum;

public class PrePostDemo {
	public static void mian(String[] args) {
		int i = 3;
		i++;
		System.out.println(i); // 4 출력
		++i;
		System.out.println(i); // 5 출력
		System.out.println(++i); // 6 출력
		System.out.println(i++); // 6 출력
		System.out.println(i); // 7 출력
	}

}
