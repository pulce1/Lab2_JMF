/**
 * @author james Frayser
 * Summer 2022
 * Lab 2
 * TestObjects.java
 */
public class TestObjects {

	public static void main(String[] args) {
		
		/**
		 * wiz to call to the wizard class
		 */
		Wizard wiz = new Wizard();
		/**
		 * set health to have a starting health total
		 * set key to set how many keys he has
		 * lock to determine if it is locked
		 * setName to determine the name of the wizard
		 */
		wiz.setHealth(100);
		wiz.setKey(0);
		wiz.lock(0);
		wiz.setName("Gandalf");
		
		/**
		 * print wiz.toString to show the stats at the beginning
		 */
		System.out.println(wiz.toString());

		System.out.println("Name: " + wiz.getName() + ", Health: " + wiz.getHealth());
		
		/**
		 * unlock and take damage to deal the wizard damage to their health
		 */
		wiz.unlock(5);
		wiz.takeDamage(20);
		System.out.println("Health: " + wiz.getHealth());
		
		/**
		 * takeDamage to prove takedamage works
		 */
		wiz.takeDamage(12);
		System.out.println("Health: " + wiz.getHealth());
		
		wiz.takeDamage(17);
		System.out.println(wiz.getHealth());
		System.out.println("Is the chest locked? " +wiz.isLocked());
		
		wiz.unlock(6);
		System.out.println("Is the chest locked? " +wiz.isLocked());

		/**
		 * wiz.setKey is to represent the obtaining of the key and the unlocking of the chest
		 */
		System.out.println("Obtained Key!");
		wiz.setKey(1);
		System.out.println("Is the chest locked? " +wiz.isLocked());


		System.out.println("Name: " + wiz.getName() + ", Health: " + wiz.getHealth());
	
	}//end main

}//end class
