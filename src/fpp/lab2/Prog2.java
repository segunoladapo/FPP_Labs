package fpp.lab2;

public class Prog2 {

	public static void main(String... args){
		int x = RandomNumbers.getRandomInt(1, 9);
		int y = RandomNumbers.getRandomInt(3, 14);
		double result = Math.pow(Math.PI, x);
		double result2 = Math.pow(y, Math.PI);
		System.out.println(result);
		System.out.println(result2);
	}
}
