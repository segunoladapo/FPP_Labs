package fpp.lab2;

public class Prog7 {
	public static void main(String[] args){
		String output = "";
		for(int i=0; i<2;i++) {
			output = String.format("%16d %12d %12d %12d %n %n", RandomNumbers.getRandomInt(1,99), RandomNumbers.getRandomInt(1,99), RandomNumbers.getRandomInt(1,99),RandomNumbers.getRandomInt(1,99));
			output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", RandomNumbers.getRandomInt(1,99), "+", RandomNumbers.getRandomInt(1,99),"+", RandomNumbers.getRandomInt(1,99), "+", RandomNumbers.getRandomInt(1,99));
			output += String.format("%16s %12s %12s %12s","____", "____", "____", "____");
			System.out.println(output);
			System.out.print("\n\n\n");
		}
	}

}
