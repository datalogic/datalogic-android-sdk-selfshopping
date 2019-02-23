package com.datalogic.extension.selfshopping.led.event;

import com.datalogic.extension.selfshopping.led.action.LedAction;

/**
 * Interface exposing the API of a generic LED event.
 */
public interface LedEvent
{
        /**
         * Gets the ID of this LED event.
         *
         * @return <code>int</code>
         *         The LED event ID.
         */
        public int getId();

        /**
         * Gets the name of this LED event.
         *
         * @return <code>String</code>
         *         The LED event name.
         */
        public String getName();

        /**
         * Gets the description of this LED event.
         *
         * @return <code>String</code>
         *         The LED event description.
         */
        public String getDescription();

        /**
         * Assign a LED action to this event.
         * @param action
         *        The  {@link com.datalogic.extension.selfshopping.led.action.LedAction}
         *        to assign to this event, can be null in case we don't want to
         *        associate any action to the LED event.
         */
        public void assignLedAction(LedAction action);

        /**
         * Retrieves the LED action associated with this event, if it exists.
         * @return
         *         The {@link com.datalogic.extension.selfshopping.led.action.LedAction}
         *         currently assigned to this event or <code>null</code> in case
         *         no action is assigned.
         */
        public LedAction getAssignedLedAction();

        /**
         * Clears the LED action associated to this event, making it unresponsive.
         */
        public void clearAssignedLedAction();
}
