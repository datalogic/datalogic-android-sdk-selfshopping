package com.datalogic.extension.selfshopping.cradle.joyatouch;

import com.datalogic.extension.selfshopping.cradle.Cradle;

/**
 * Interface for the Joya Touch Cradle API.
 */
public interface CradleJoyaTouch extends Cradle
{
        /**
         * Enumerative representing a Joya Touch Cradle type.
         */
        public enum Type
        {
                /**
                 * Unknown Cradle.
                 */
                UNKNOWN,

                /**
                 * SSD Charge Only.
                 */
                SIMPLIFIED_SINGLE,

                /**
                 * SSD Locking.
                 */
                SINGLE,

                /**
                 * 3-Slot Cradle.
                 */
                MULTIPLE;
        }

        /**
         * Read the current state from the Joya Touch Cradle.
         *
         * @param state
         *            The {@link StateInfo} that will be filled by the method
         *            with the current information read from the Cradle if
         *            the operation is successful, otherwise the input object
         *            will not be modified from its previous values.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean getCradleState(StateInfo state);

	/**
	 * Execute a specific lock action.
	 * This method is used to lock or unlock the device from the Cradle,
	 * optionally controlling the LED associated with the current Cradle slot.
	 *
	 * @param action
	 *            Specifies which {@link LockAction} to execute.
	 *
	 * @return <code>boolean</code> true in case of success, false otherwise.
	 */
	public boolean controlLock(LockAction action);

	/**
	 * Execute a specific action on the current LED.
	 * This method is used to control the Cradle LED of the slot in which the
	 * device is inserted.
	 *
	 * @param action
	 *            Specifies which {@link LedAction} to execute.
	 *
	 * @return <code>boolean</code> true in case of success, false otherwise.
	 */
	public boolean controlLed(LedAction action);

        /**
         * Read the custom area from the Cradle.
         *
         * @param area
         *            The {@link CustomArea} to be filled with the result read
         *            from the Cradle.
         * @param size
         *            The required size for the custom area. This parameter has
         *            a maximum value of {@link CustomArea#SIZE}.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean readCustomArea(CustomArea area, int size);

        /**
         * Write the custom area into the Cradle.
         *
         * @param area
         *            The {@link CustomArea} to write into the Cradle.
         * @param size
         *            The number of bytes to write in the custom area.
         *            This parameter has a maximum value of {@link CustomArea#SIZE}.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean writeCustomArea(CustomArea area, int size);

        /**
         * Method used to reset the Joya Touch Cradle.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean reset();

        /**
         * Read the configuration area from the Cradle.
         *
         * @param area
         *            The {@link ConfigArea} to be filled with the result read
         *            from the Cradle.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean readConfigArea(ConfigArea area);

        /**
         * Write the configuration area into the Cradle.
         *
         * @param area
         *            The {@link ConfigArea} to write into the Cradle.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean writeConfigArea(ConfigArea area);

        /**
         * Checks if the device is currently in fast charge.
         *
         * @return <code>boolean</code> true in case the device is in fast
         * charge, false otherwise.
         */
        public boolean isFastChargeEnabled();

        /**
         * Returns the type of Cradle the device is currently inserted into (or
         * <code>UNKNOWN</code> in case the device is not currently inside a
         * Cradle).
         *
         * @return A {@link Type} enum representing the type of Cradle in which
         *         the device is inserted.
         */
        public Type getCurrentlyInsertedCradleType();

        /**
         * Gets the favorite firmware value currently in use.
         *
         * @return A {@link FavoriteFirmware} enum representing the
         *         firmware to favor during Cradle detection.
         */
        public FavoriteFirmware getFavoriteFirmware();

        /**
         * Sets the favorite firmware between the list of allowed values.
         *
         * @param favoriteFirmware
         *        A {@link FavoriteFirmware} enum representing the
         *        firmware to favor during Cradle detection.
         */
        public void setFavoriteFirmware(FavoriteFirmware favoriteFirmware);
        
        /**
         * Return current slot's failure state.
         *
         * @return A {@link FailureState} enum representing the current
         *          failure state.
         */
        public FailureState getFailureState();
}
