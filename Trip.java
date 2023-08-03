import java.util.Scanner;

public class Trip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0)/* if number of students are 0*/

                break;

            double[] expenses = new double[n];/* creates an array expenses of length n to store the expenses of each student.*/
            double totalExpenses = 0.0;/* keep track of the total expenses for this trip.*/

            for (int i = 0; i < n; i++) { //read the expenses of each student and adds them to the expenses array and updates the totalExpenses./
                expenses[i] = scanner.nextDouble();
                totalExpenses += expenses[i];
            }

            double averageExpense = totalExpenses / n;
            System.out.println("Average : "+averageExpense);
            double totalMoneyToExchange = 0.0;//store the total amount of money that needs to be exchanged among the students to equalize their expenses./

            for (int i = 0; i < n; i++) {//loop to calculate the total amount of money that needs to be exchanged/
                if (expenses[i] > averageExpense) { /* if their expense is greater than the averageExpense */
                    totalMoneyToExchange += expenses[i] - averageExpense;
                }
            }

            System.out.printf("$%.2f%n", totalMoneyToExchange);
        }
        
    }
}