package cn.pauu.javase.enhence;

/*
 * ��ͨ��ģ��ö�ٹ���
 */
public abstract class WeekDay1 {
	private WeekDay1() {
	}

	public static final WeekDay1 SUN = new WeekDay1() {

		@Override
		public WeekDay1 nextDay() {
			return MON;
		}

	};
	public static final WeekDay1 MON = new WeekDay1() {

		@Override
		public WeekDay1 nextDay() {
			return SUN;
		}
	};

	public abstract WeekDay1 nextDay();

	@Override
	public String toString() {
		return this == SUN ? "SUN" : "MON";
	}
}
