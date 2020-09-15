package myapp;

public class AcoountingApp {

	public static void main(String[] args) {
		
		double valueofsupply = Double.parseDouble(args[0]);
		double expenseRate = 0.3;
		double vatrate = 0.1;
		double VAT = valueofsupply*vatrate;
		double Total = valueofsupply + VAT;
		double Expense = valueofsupply*expenseRate;
		double income = valueofsupply-Expense;
		double Dividend1 = (income) * 0.5;
		double Dividend2 = (income) * 0.3;
		double Dividend3 = (income) * 0.2;
		
		System.out.println("value of supply : "+valueofsupply);
		System.out.println("VAT : "+VAT );
		System.out.println("Total : "+Total );
		System.out.println("Expense : "+Expense );
		System.out.println("income : "+income );
		System.out.println("Dividend1 : "+Dividend1 );
		System.out.println("Dividend2 : "+Dividend2 );
		System.out.println("Dividend3 : "+Dividend3 );
	}

}
