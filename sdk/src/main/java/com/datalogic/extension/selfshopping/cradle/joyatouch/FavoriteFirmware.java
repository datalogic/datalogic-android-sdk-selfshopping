package com.datalogic.extension.selfshopping.cradle.joyatouch;

/**
 * This enum lists the favorite Cradle firmware version.
 */
public enum FavoriteFirmware
{
	/**
	 * Favor the legacy Cradle firmware
     * 
     * @deprecated Use either LATEST_DETECTED or FORCE_LEGACY
	 */
    @Deprecated
	LEGACY,
	/**
	 * Favor the Kehto firmware
     * 
     * @deprecated Use either LATEST_DETECTED or FORCE_LEGACY
	 */
    @Deprecated
	KEHTO,
	/**
	 * Favor the latest detected firmware, taken from the last Cradle the
	 * device has been inserted into
	 */
	LATEST_DETECTED,
    /**
     * Force the communication in legacy mode (even with new cradles)
     */
    FORCE_LEGACY;
    
    /**
	 * Converts the ConcurrencyPreference enum to its integer representing value.
	 *
	 * @return int
	 */
	public int toInt()
	{
		return 0;
	}
    
    /**
	 * Retrieves the corresponding ConcurrencyPreference value, from a valid integer.
	 *
	 * @param n
	 *            <code>int</code>
	 * @return ConcurrencyPreference the corresponding one.
	 * */
	public static FavoriteFirmware fromInt(int n)
	{
        return FORCE_LEGACY;
    }
};
