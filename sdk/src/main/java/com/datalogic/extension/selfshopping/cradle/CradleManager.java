package com.datalogic.extension.selfshopping.cradle;

/**
 * This class is used to return the current Cradle API, depending on the
 * targeted device.
 */
public class CradleManager
{
	/**
	 * This method returns an instance of the specific Cradle available
         * depending on the current device, or null in case no Cradle is
         * currently supported.
	 *
         * @return A generic {@link Cradle} instance that can be cast depending
         * on the current Cradle type, or null in case no Cradle is available.
	 */
	public static Cradle getCradle()
        {
                return null;
	}

        /**
         * This method returns an instance of the specific Trolley available
         * depending on the current device, or null in case no Trolley is
         * currently supported.
         *
         * @return A generic {@link Trolley} instance, or null in case no
         * Trolley is available.
         */
        public static Trolley getTrolley()
        {
                return null;
        }
}
