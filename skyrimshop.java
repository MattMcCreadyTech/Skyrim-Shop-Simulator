import java.util.*;

public class SkyrimShopSim {

	public static void main(String[] args) {
		try (Scanner userInput = new Scanner (System.in)) {
			int userGold = 1000; //starting gold

			int ironDagger = 200;
			int ironGreatsword = 500;
			int ironBattleaxe = 700;
			int minorHealingPotion = 150;

			while (true) {
				System.out.println("You see a shop. Do you wish to enter?");
				System.out.println("[E - Enter] [L - Leave]");
				String greeting = userInput.nextLine();

				if(greeting.equalsIgnoreCase("E")) {
					System.out.println("You approach the door and enter the shop...");
					break;

				} else if (greeting.equalsIgnoreCase("L")){
					System.out.println("You leave marketplace.");
					return;

				} else {
					System.out.println("Please enter a valid option.");
					System.out.println(" ");
				}
			}

			//SHOPKEEPER DIALOGUE
			System.out.println("Shopkeeper: Got something for just about everybody in here. Give a holler if you have any questions.");
			System.out.println(""); //SPACING
			System.out.println("Would you like to take a look at the gear? [Y = yes] [N = no]");
			System.out.println("Gold: " + userGold);
			String response = userInput.nextLine();

			if(response.equalsIgnoreCase("Y")) {
				System.out.println("Looking to protect yourself, or deal some damage?");
				System.out.println(""); //SPACING
			}
			else if(response.equalsIgnoreCase("N")) {
				System.out.println("Shopkeeper: Until next time.");
				return;
			}
			else {
				System.out.println("I can't understand you...");
			}
			while (true) {

				String[] shopItems = {"- Iron Dagger - 200g ", "- Iron Greatsword - 500g ",
						"- Iron Battleaxe - 700g " , "- Minor Healing Potion - 150g"}; 
				for (String i : shopItems) {
					System.out.println(i);
				}

				//SELECT ITEMS FOR PURCHASE
				System.out.println(""); //SPACING
				System.out.println("Select item: ");
				System.out.println(userGold);
				response = userInput.nextLine();


				//--------------------

				//IRON DAGGER DIALOGUE
				if (response.equalsIgnoreCase("iron dagger"))
				{
					System.out.println("An iron dagger costs 200g. Would you like to purchase it? Gold: " + userGold + " [Y = yes] [N = no]");
					String responseItem = userInput.nextLine();

					if (responseItem.equalsIgnoreCase("Y") && (userGold >= ironDagger)) {

						System.out.println("You bought (1) Iron Dagger.");
						System.out.println("Gold: " + (userGold - ironDagger));
						userGold -= ironDagger;

					} else if (responseItem.equalsIgnoreCase("N")) {

					} else {
						System.out.println("You don't have enough gold.");

					}
				}
				//IRON GREATSWORD DIALOGUE
				if (response.equalsIgnoreCase("iron greatsword"))
				{
					System.out.println("An iron greatsword costs 500g. Would you like to purchase it? Gold: " + userGold + " [Y = yes] [N = no]");
					String responseItem = userInput.nextLine();

					if (responseItem.equalsIgnoreCase("Y") && (userGold >= ironGreatsword)) {

						System.out.println("You bought (1) Iron Greatsword.");
						System.out.println("Gold: " + (userGold - ironGreatsword));
						userGold -= ironGreatsword;

					} else if (responseItem.equalsIgnoreCase("N")) {

					} else {
						System.out.println("You don't have enough gold.");

					}
				}
				//IRON BATTLEAXE DIALOGUE
				if (response.equalsIgnoreCase("iron battleaxe"))
				{
					System.out.println("An iron dagger costs 700g. Would you like to purchase it? Gold: " + userGold + " [Y = yes] [N = no]");
					String responseItem = userInput.nextLine();

					if (responseItem.equalsIgnoreCase("Y") && (userGold >= ironBattleaxe)) {

						System.out.println("You bought (1) Iron Battleaxe.");
						System.out.println("Gold: " + (userGold - ironBattleaxe));
						userGold -= ironBattleaxe;

					} else if (responseItem.equalsIgnoreCase("N")) {

					} else {
						System.out.println("You don't have enough gold.");

					}
				}

				//MINOR HEALING POTION DIALOGUE
				if (response.equalsIgnoreCase("minor healing potion"))
				{
					System.out.println("A minor healing potion costs 150g. Would you like to purchase it? Gold: " + userGold + " [Y = yes] [N = no]");
					String responseItem = userInput.nextLine();

					if (responseItem.equalsIgnoreCase("Y") && (userGold >= minorHealingPotion)) {

						System.out.println("You bought (1) Minor Healing Potion.");
						System.out.println("Gold: " + (userGold - minorHealingPotion));
						userGold -= minorHealingPotion;

					} else if (responseItem.equalsIgnoreCase("N")) {

					} else {
						System.out.println("You don't have enough gold.");

					}
				}
				System.out.println("Continue shopping? [Y = yes] [N = no]");
				String playAgain = userInput.nextLine();

				if (!playAgain.equalsIgnoreCase("y")) {
					System.out.println("Shopkeeper: Safe travels.");
					break;
					
				}
			}
		}
	}
}

//Enter shop **DONE**
//Maybe add a press a button? or interactive action?
//talk to shop keeper **DONE**
//greeting **DONE**
//display inventory **DONE**
//select item 
//item costs etc. + would you like to purchase one? y/n
//it'll tell you if you don't have enough gold 
//add completed transaction dialogue and leave shop
//available gold = 1,000G 
