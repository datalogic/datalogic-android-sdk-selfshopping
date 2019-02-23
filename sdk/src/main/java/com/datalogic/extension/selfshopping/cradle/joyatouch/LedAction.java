package com.datalogic.extension.selfshopping.cradle.joyatouch;

/**
 * This enum lists the LED actions available.
 */
public enum LedAction
{
	/**
	 * Turn on the LED associated with the current Cradle slot
	 */
	ON,
	/**
	 * Turn off the LED associated with the current Cradle slot
	 */
	OFF,
	/**
	 * Fast blink of the LED associated with the current Cradle slot
	 */
	BLINK_FAST,
 	/**
 	 * Slow blink of the LED associated with the current Cradle slot
 	 */
 	BLINK_SLOW,
        /**
         * Toggle the LED associated with the current Cradle slot
         */
        TOGGLE;
};
