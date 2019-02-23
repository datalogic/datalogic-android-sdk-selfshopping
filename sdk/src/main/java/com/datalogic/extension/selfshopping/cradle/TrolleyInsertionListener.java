package com.datalogic.extension.selfshopping.cradle;

/**
 * This interface is used by the application to listen to the events of insertion
 * and extraction of the device from the Trolley.
 */
public interface TrolleyInsertionListener
{
	/**
	 * Method that will be called when the device has been inserted
	 * in the Trolley.
	 */
	public void onDeviceInserted();

	/**
	 * Method that will be called when the device has been extracted
	 * from the Trolley.
	 */
	public void onDeviceExtracted();
}
