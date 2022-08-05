/**
 * @author James Frayser
 * Summer 2022
 * Lab 1
 * Lockable.java
 */
public interface Lockable {
	
	/**
	 * uses key to determine these factors
	 * setKey to determine if you have a key
	 * lock to determine if you dont have a key that it is locked
	 * unlock to unlock if you have a key
	 * isLocked to determine if you dont have a key that it is locked
	 * @param key
	 */
	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean isLocked();

}//end interface
