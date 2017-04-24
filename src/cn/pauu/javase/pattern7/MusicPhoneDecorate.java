package cn.pauu.javase.pattern7;

public class MusicPhoneDecorate extends PhoneDecorate {

	private Phone phone;

	public MusicPhoneDecorate(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void call() {
		phone.call();
		System.out.println("Ã˝“Ù¿÷");
	}

}
