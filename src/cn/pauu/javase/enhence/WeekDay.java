package cn.pauu.javase.enhence;

/*
 * ��ͨ��ģ��ö�ٹ���
 */
public abstract class WeekDay {
	private WeekDay() {
	}

	public static final WeekDay SUN = new WeekDay() {

		@Override
		public WeekDay nextDay() {
			return MON;
		}

	};
	public static final WeekDay MON = new WeekDay() {

		@Override
		public WeekDay nextDay() {
			return SUN;
		}
	};

	public abstract WeekDay nextDay();

	@Override
	public String toString() {
		return this == SUN ? "SUN" : "MON";
	}
}
