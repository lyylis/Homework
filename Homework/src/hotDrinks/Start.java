package hotDrinks;

public class Start {

	public static void main(String[] args) {
		double money = 0.0;
		money=Payment.enterMoney();
		
		if (AmountMoney.moneyEnough(money)){
			DispenseDrink.dispenseDrink();
		}
		else{
			Notify.notify("Not enough money!");
			
		}
		if(money>2.50){
			System.out.println("\nPlease take change "+ ChangeMoney.issueChange(money));
		}
		

	}

}
