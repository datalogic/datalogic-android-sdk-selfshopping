package com.datalogic.extension.selfshopping.cradle.joyatouch;

/**
 * This enum lists cradle's failure states.
 */
public enum FailureState
{
    /**
	 * No failure was detected.
	 */
	NONE,
    /**
	 * The cradle is not calibrated.
	 */
	UNCALIBRATED,
    /**
	 * The slot's lever is not in the correct position. 
	 */
    BAD_LEVER_POSITION,
    /**
	 * There is some metal object which prevents a successful wireless
     * charge power transmission between the cradle and the device.
	 */
    WLC_FOD,
    /**
	 * The device asked for an "end of power transmission" for too long.
	 */
    WLC_EOC_TIMEOUT,
    /**
	 * Generic wireless charge error.
	 */
    WLC_GENERIC,
    /**
	 * The device reported an error on its internal charging system.
	 */
    DEVICE_CHARGING_FAILURE,
    /**
	 * The current cradle's daisy chain configuration is not allowed.
	 */
    WRONG_DAISY_CHAIN_CONFIG,
    /**
	 * The cradle's internal flash is corrupted.
	 */
    FLASH_CORRUPTED;
    
    /**
     * @hide
     */
    public int getMask()
	{
		return 0;
	}
    
    public String getMessage()
    {
        return "";
    }
};
