package com.datalogic.extension.selfshopping.led.action;

import com.datalogic.extension.selfshopping.led.DimmingSequencePoint;

/**
 * LED action for the dimming of a LED.
 */
public class LedActionDim extends LedAction
{
        /**
         * Dimming action type.
         */
        public static final String TYPE = "dim";

        /**
         * Default constructor for the dimming action.
         *
         * @param id
         *        The LED ID.
         * @param numCycles
         *        The number of dimming cycles (-1 = infinite).
         * @param sequence
         *        An array of {@link com.datalogic.extension.selfshopping.led.DimmingSequencePoint} 
         *        objects representing the dimming sequence to execute.
         */
        public LedActionDim(int id, int numCycles, DimmingSequencePoint[] sequence)
        {
                
        }

        /**
         * Returns the number of dimming cycles.
         *
         * @return <code>int</code>
         *         The number of dimming cycles (-1 = infinite).
         */
        public int getNumCycles()
        {
                return 0;
        }

        /**
         * Returns the dimming sequence array.
         *
         * @return
         *         The array of {@link com.datalogic.extension.selfshopping.led.DimmingSequencePoint} objects.
         */
        public DimmingSequencePoint[] getSequence()
        {
                return null;
        }
}
