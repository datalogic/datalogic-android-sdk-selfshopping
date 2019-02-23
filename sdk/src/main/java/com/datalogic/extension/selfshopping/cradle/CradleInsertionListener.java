package com.datalogic.extension.selfshopping.cradle;

/**
 * This interface is used by the application to listen to the events of insertion
 * and extraction of the device from the Cradle.
 */
public interface CradleInsertionListener
{
	/**
	 * Method that will be called when the device has been inserted
	 * in the correct position into the Cradle.
	 */
	public void onDeviceInsertedCorrectly();

	/**
	 * Method that will be called when the device has been inserted
	 * in the wrong position into the Cradle.
	 */
	public void onDeviceInsertedWrongly();

	/**
	 * Method that will be called when the device has been extracted
	 * from the Cradle.
	 */
	public void onDeviceExtracted();
}
