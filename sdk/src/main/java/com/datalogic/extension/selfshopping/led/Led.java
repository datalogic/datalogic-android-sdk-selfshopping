package com.datalogic.extension.selfshopping.led;

/**
 * Interface exposing the API of a generic LED.
 */
public interface Led
{
        /**
         * Gets the ID of this LED.
         *
         * @return <code>int</code>
         *         The LED ID.
         */
        public int getId();

        /**
         * Turn the LED on.
         */
        public void turnOn();

        /**
         * Turn the LED off.
         */
        public void turnOff();

        /**
         * Blink the LED.
         *
         * @param numCycles
         *        The number of blinking cycles (-1 = infinite).
         * @param delayOn
         *        The number of milliseconds the LED is turned ON during a
         *        blinking cycle.
         * @param delayOff
         *        The number of milliseconds the LED is turned OFF during a
         *        blinking cycle.
         */
        public void blink(int numCycles, int delayOn, int delayOff);
}
