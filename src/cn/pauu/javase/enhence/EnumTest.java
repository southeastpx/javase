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
		System.out.println("-------------------------------");
		TrafficLamp redLamp = TrafficLamp.RED;
		System.out.println(redLamp.nextLamp());
		System.out.println(redLamp.nextLamp().nextLamp());
	}

	public enum WeekDay {
		SUN, MON(1), TUE, WES, THI, FRI, SAT;
		private WeekDay() {
			System.out.println("first");
		}

		private WeekDay(int day) {
			System.out.println("second");
		}
	}
	
	public enum TrafficLamp{
		RED(30){

			@Override
			public TrafficLamp nextLamp() {
				return GREEN;
			}
			
		},
		GREEN(40){

			@Override
			public TrafficLamp nextLamp() {
				return YELLOW;
			}
			
		},
		YELLOW(5){

			@Override
			public TrafficLamp nextLamp() {
				return RED;
			}
			
		};
		private int time;
		private TrafficLamp(int time){
			this.time = time;
		}
		
		public abstract TrafficLamp nextLamp();
	}
}
