package App;

import java.util.Scanner;

public class Service {
	public void targetAmount(int transactionsAmounts[]) {
		Scanner sc = new Scanner(System.in);

		int noOfTarget = sc.nextInt();
		int targetAmount[] = new int[noOfTarget];

		for(int i = 0; i < targetAmount.length; i++) {
			System.out.println("Enter the value of target");
			int amount = sc.nextInt();
			int total = 0;
			boolean targetAchieved = false;  
			for(int j = 0; j < transactionsAmounts.length; j++) {
				total += transactionsAmounts[j];
				if(total >= amount) {
					System.out.println("Target achieved after " + (j + 1) + " transactions");
					targetAchieved = true;
					break;
				}
			}
			if(!targetAchieved) {
				System.out.println("Given target is not achieved ");
			}
			
		}

		sc.close();
	}
}
