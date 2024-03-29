package factory;


import java.util.Scanner;



public class EnemyShipTesting {

	public static void main(String[] args) {
		
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		
		EnemyShip theEnemy = null;
		
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.println("What type of ship ? (U / R / B)");
		
		if(userInput.hasNextLine()) {
			
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		if(theEnemy != null) {
			doStuffEnemy(theEnemy);
		}else System.out.println("Please enter right type of Ship");
		
	}
	

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
