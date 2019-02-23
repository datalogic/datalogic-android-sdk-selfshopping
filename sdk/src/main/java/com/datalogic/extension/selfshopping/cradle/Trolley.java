package com.datalogic.extension.selfshopping.cradle;

/**
 * Interface exposing the API of a Trolley.
 */
public interface Trolley
{
        /**
	 * Checks if the device is inserted in the Trolley.
	 *
	 * @return <code>boolean</code> true if the device is inside the Trolley,
         * false otherwise or in case of failure in the detection.
	 */
	public boolean isDeviceInTrolley();

        /**
         * Add a listener that is used in order to manage the insertion and
         * extraction events from the Trolley.
         *
         * @param listener
         *            The {@link TrolleyInsertionListener} to add.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean addTrolleyInsertionListener(TrolleyInsertionListener listener);

        /**
         * Remove a listener previously inserted by the specific add method.
         *
         * @param listener
         *            The {@link TrolleyInsertionListener} to remove.
         *
         * @return <code>boolean</code> true in case of success, false otherwise.
         */
        public boolean removeTrolleyInsertionListener(TrolleyInsertionListener listener);
}
