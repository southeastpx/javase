package cn.pauu.javase.enhence;

public class EnumTest {
	public static void main(String[] args) {
		WeekDay1 weekDay = WeekDay1.MON;
		System.out.println(weekDay.nextDay());
		WeekDay weekDay2 = WeekDay.FRI;
		System.out.println(weekDay2);
		System.out.println(weekDay2.name());
		System.out.println(weekDay2.ordinal());
		System.out.println(WeekDay.valueOf("TUE"));
		System.out.println(WeekDay.values().length);
	}
	
	public enum WeekDay{
		SUN,MON,TUE,WES,THI,FRI,SAT;
	}
}
