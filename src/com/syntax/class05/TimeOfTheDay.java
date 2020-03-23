package com.syntax.class05;

public class TimeOfTheDay {

	public static void main(String[] args) {
		int hour=11;
		String timeOfDay;
		
		if (hour>=1 && hour <=11) {
			timeOfDay="Morning";
		}else if (hour<=12 && hour <=15) {
				timeOfDay="Noon";
		}		else if (hour >=16 && hour <=20) {
					timeOfDay="Afternoon";
		}			else if (hour >=21 && hour <=24) {
						timeOfDay="Night";
					}else {
						timeOfDay="Unknow";
					}
				if (!timeOfDay.equals("Unknown")){
					System.out.println("Right now is " + timeOfDay);
				}
				}
}
