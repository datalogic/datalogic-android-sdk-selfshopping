package com.datalogic.extension.selfshopping.cradle.joyatouch;

/**
 * This enum lists the lock actions available.
 */
public enum LockAction
{
	/**
	 * Lock the device in the Cradle
	 */
	LOCK,
	/**
	 * Lock the device in the Cradle turning off the LED
	 */
	LOCK_WITH_LED_OFF,
	/**
	 * Unlock the device from the Cradle
	 */
	UNLOCK,
 	/**
 	 * Unlock the device from the Cradle turning on the LED
 	 */
 	UNLOCK_WITH_LED_ON;
};
