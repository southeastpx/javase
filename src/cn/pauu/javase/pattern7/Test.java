package cn.pauu.javase.pattern7;

public class Test {
	public static void main(String[] args) {
		Phone phone = new IPhone();
		phone.call();
		System.out.println("-------------------");
		PhoneDecorate pd = new RingPhoneDecorate(phone);
		pd.call();
		System.out.println("--------------------");
		pd = new MusicPhoneDecorate(phone);
		pd.call();
		System.out.println("------------");
		pd = new MusicPhoneDecorate(new RingPhoneDecorate(phone));
		pd.call();
	}
}
