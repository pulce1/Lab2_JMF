/**
 * This class represents a wizard for
 * a D&D type game.
 * @author James Frauser
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable {

/**
* private String name for the wizard
*/
private String name;
/**
* private String health of the wizard
*/
private int health;
/**
* private int key, whether or not he has a key
*/
private int key;

/**
* private boolean locked determines whether the chest is locked
*/
private boolean locked;

/**
* private boolean locked determines whether the chest is unlocked
*/
private boolean unlocked;

/**
* getter for name
*/

/**
* empty argument constructor for Wizard
* Initializes key as 0
* Initializes locked as false
*/
public Wizard() {
this.key = 0;
this.locked = false;
this.unlocked = false;
this.health = 0;
this.health = 0;
}

/**
* preferred constructor for Wizard
* Initializes key to 0
* Initializes locked as false
* sets the name
*
* @param name
*/
public Wizard(int key,String name, int health, boolean locked, boolean unlocked) {
this.name = name;
this.key=key;
this.health = health;
this.locked = locked;
this.unlocked = unlocked;

}
public String getName() {
return name;
}

/**
* setter for name
* @param name
*/
public void setName(String name) {
this.name = name;
}

/**
* getter for health
*/
public int getHealth() {
return health;
}

/**
* setter for health
*
* @param health
*/
public void setHealth(int health) {
this.health = health;
}

/**
* setter for key
* @param key
*/
public void setKey(int key) {
if (this.key == 0 && key > 0)
this.key = key;
}



/**
* method checks whether the chest is locked
 * @param b 
* @return boolean
*/
public boolean isLocked() {
	if (this.key == 0)
		return locked;
	else
		return unlocked;
	
}//end isLocked



/**
* method takeDamage()
* wizard takes damage
* if chest is not locked
* @param power
*/
public void takeDamage(int power) {
if (isLocked() == true)
this.health = this.health - power;
}//end takeDamage

/**
* method lock()
* this locks if the key matches
*/
public void lock(int key) {
if (this.key == key)
this.locked = true;
}

/**
* method unlock()
* this unlocks if the key matches
*/
public void unlock(int key) {
if (this.key == key)
this.locked = false;

}

@Override
public String toString() {
return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
}

}//end class


