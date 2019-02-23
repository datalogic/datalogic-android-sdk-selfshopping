package com.datalogic.extension.selfshopping.led;

/**
 * A point in the dimming sequence, characterized by a time value (in
 * milliseconds) and a brightness value (in percentage).
 */
public class DimmingSequencePoint
{
        /**
         * Constructor taking time and brightness values as parameters.
         *
         * @param time
         *        The number of milliseconds at which the specified brightness
         *        will be set on the LED.
         *
         * @param brightness
         *        The brightness level (in percentage) to set at a given moment
         *        in time.
         */
        public DimmingSequencePoint(int time, int brightness) throws IllegalArgumentException
        {

        }

        /**
         * Returns the point's time.
         *
         * @return <code>int</code>
         *         The sequence point's time in milliseconds.
         */
        public int getTime()
        {
                return 0;
        }

        /**
         * Returns the point's brightness.
         *
         * @return <code>int</code>
         *         The sequence point's brightness in percentage.
         */
        public int getBrightness()
        {
                return 0;
        }
}
