package _5_JourneyCalculat;

import java.util.Scanner;

public class JourneyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Speed and Time values");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		double distance=journeyCalculator.calculateDistance(speed,time);
		System.out.println(distance);

	}
public double calculateDistance(double speed,double time)
{return speed*time;

}
}


