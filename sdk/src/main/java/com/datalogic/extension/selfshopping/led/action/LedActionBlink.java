package com.datalogic.extension.selfshopping.led.action;

/**
 * LED action for the blinking of a LED.
 */
public class LedActionBlink extends LedAction
{
        /**
         * Blinking action type.
         */
        public static final String TYPE = "blink";

        /**
         * Default constructor for the blinking action.
         *
         * @param id
         *        The LED ID.
         * @param numCycles
         *        The number of blinking cycles (-1 = infinite).
         * @param delayOn
         *        The number of milliseconds the LED is turned ON during a
         *        blinking cycle.
         * @param delayOff
         *        The number of milliseconds the LED is turned OFF during a
         *        blinking cycle.
         */
        public LedActionBlink(int id, int numCycles, int delayOn, int delayOff)
        {
                
        }

        /**
         * Returns the number of blinking cycles.
         *
         * @return <code>int</code>
         *         The number of blinking cycles (-1 = infinite).
         */
        public int getNumCycles()
        {
                return 0;
        }

        /**
         * Returns the number of milliseconds the LED is turned ON
         * during a blinking cycle.
         *
         * @return <code>int</code>
         *         The number of milliseconds the LED is turned ON.
         */
        public int getDelayOn()
        {
                return 0;
        }

        /**
         * Returns the number of milliseconds the LED is turned OFF
         * during a blinking cycle.
         *
         * @return <code>int</code>
         *         The number of milliseconds the LED is turned OFF.
         */
        public int getDelayOff()
        {
                return 0;
        }
}
