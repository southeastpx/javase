package cn.pauu.javase.pattern6;

public class ForTest extends GetTime {

	@Override
	public void code() {
		for (int x = 0; x < 100000; x++) {
			System.out.println(x);
		}
	}

}
