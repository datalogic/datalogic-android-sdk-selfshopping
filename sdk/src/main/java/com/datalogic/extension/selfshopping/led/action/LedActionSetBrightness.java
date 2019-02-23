package com.datalogic.extension.selfshopping.led.action;

/**
 * LED action for setting the brightness of a LED.
 */
public class LedActionSetBrightness extends LedAction
{
        /**
         * Set brightness action type.
         */
        public static final String TYPE = "setBrightness";

        /**
         * Default constructor for the set brightness action.
         *
         * @param id
         *        The LED ID.
         * @param brightness
         *        The LED brightness to set (in percentage).
         */
        public LedActionSetBrightness(int id, int brightness)
        {
                
        }

        /**
         * Returns the brightness value.
         *
         * @return <code>int</code>
         *         The brightness value (in percentage).
         */
        public int getBrightness()
        {
                return 0;
        }
}
