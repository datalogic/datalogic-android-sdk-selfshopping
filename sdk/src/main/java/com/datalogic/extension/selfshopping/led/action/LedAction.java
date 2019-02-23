package com.datalogic.extension.selfshopping.led.action;

/**
 * Abstract class used to represent an action to be executed by the
 * {@link com.datalogic.extension.selfshopping.led.SelfshoppingLedManager}.
 * It is characterized by a LED ID (whose value is one of the different
 * exposed by the LED Manager) and a String representing the action type.
 */
public abstract class LedAction
{
        /**
         * Returns the LED ID associated with this action.
         *
         * @return <code>int</code>
         *         The LED ID associated with this action.
         */
        public int getId()
        {
                return 0;
        }

        /**
         * Returns the action type.
         *
         * @return <code>String</code>
         *         The action type.
         */
        public String getType()
        {
                return null;
        }
}
