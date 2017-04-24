package cn.pauu.javase.pattern7;

public class RingPhoneDecorate extends PhoneDecorate {
	private Phone phone;

	public RingPhoneDecorate(Phone phone) {
		this.phone = phone;
	}

	@Override
	public void call() {
		System.out.println("Ìý²ÊÁå");
		phone.call();
	}

}
