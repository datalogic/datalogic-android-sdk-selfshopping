package com.datalogic.extension.selfshopping.cradle;

/**
 * Interface exposing the API of a generic Cradle.
 */
public interface Cradle
{
        /**
         * Enumerative representing an insertion state depending on the device's
         * position.
         */
        public enum InsertionState
        {
                /**
                 * Correct insertion.
                 */
                INSERTED_CORRECTLY,

                /**
                 * Wrong insertion.
                 */
                INSERTED_WRONGLY,

                /**
                 * Extraction.
                 */
                EXTRACTED;
        }

        /**
         * Returns the platform dependent Cradle API type. This method does not
         * refer to the type of Cradle the device is inserted into but only
         * to the different API that can be called from the current device.
         *
         * @return A {@link CradleType} specifying the current Cradle API type.
         */
        public CradleType getType();

        /**
	 * Checks if the device is inserted in the Cradle.
	 *
	 * @return <code>boolean</code> true if the device is inside the Cradle,
         * false otherwise or in case of failure in the detection.
	 */
	public boolean isDeviceInCradle();

        /**
         * Add a listener that is used in order to manage the insertion and
         * extraction events from the Cradle.
         *
         * @param listener
         *            The {@link CradleInsertionListener} to add.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean addCradleInsertionListener(CradleInsertionListener listener);

        /**
         * Remove a listener previously inserted by the specific add method.
         *
         * @param listener
         *            The {@link CradleInsertionListener} to remove.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean removeCradleInsertionListener(CradleInsertionListener listener);

        /**
         * Returns the current device insertion state.
         *
         * @return An {@link InsertionState} representing the current device
         * insertion state.
         */
        public InsertionState getInsertionState();
}
