package com.datalogic.extension.selfshopping.led;

/**
 * Interface exposing the API of a dimming LED.
 */
public interface DimmingLed extends Led
{
        /**
         * Set a specific LED brightness.
         *
         * @param brightness
         *        A brightness value (in percentage).
         */
        public void setBrightness(int brightness);

        /**
         * Starts the specified dimming sequence, constituted of a
         * series of (time, brightness) pairs. The brightness will
         * be calculated by interpolating between the time intervals,
         * in order to have a smooth dimming of the LED.
         * The sequence will repeat for the specified number of cycles.
         *
         * @param numCycles
         *        The number of dimming cycles to execute (-1 = infinite).
         * @param sequence
         *        The {@link DimmingSequence} to start.
         */
        public void startSequence(int numCycles, DimmingSequence sequence);
}
