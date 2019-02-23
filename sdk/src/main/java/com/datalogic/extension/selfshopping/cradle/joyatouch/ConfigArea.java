package com.datalogic.extension.selfshopping.cradle.joyatouch;

/**
 * Class representing the Joya Touch configuration area, consisting in an
 * array of bytes and its size. Each Cradle slot contains one of these areas.
 * An exposed method allows to get or set the fast charge value contained
 * in one of the bytes of the configuration area.
 */
public class ConfigArea extends GenericArea
{
        /**
         * Config area size for the Joya Touch Cradle. It is not
         * possible to write or read more than this amount of bytes.
         */
        public static final int SIZE = 32;

        /**
         * Constructor for an area of {@link #SIZE} elements.
         */
        public ConfigArea()
        {

        }

        /**
         * Constructor that fills the area with the byte array given as input.
         *
         * @param content
         *            The byte array that will represent the content of the
         *            new area. This array will be deep copied inside the class,
         *            any modification to the original array will not be
         *            reproduced inside the ConfigArea object.
         *
         * @throws IllegalArgumentException in case the input array is invalid.
         */
        public ConfigArea(byte[] content)
        {

        }

        /**
         * Gets a value representing if the fast charge is enabled or disabled
         * in the current configuration area of the Joya Touch Cradle.
         *
         * @return <code>boolean</code> true if the fast charge is enabled,
         * false otherwise.
         */
        public boolean isFastChargeEnabled()
        {
                return false;
        }

        /**
         * Sets the value controlling the fast charge in the configuration area
         * of the Joya Touch Cradle.
         *
         * @param enable
         *            True for fast charge enable, false for fast charge disable.
         */
        public void setFastChargeEnabled(boolean enable)
        {
                return;
        }
        
        /**
         * Returns the relock timeout stored in the cradle's configuration area.
         * The value stored on the cradle is the timeout divided by 5. As a 
         * consequence the returned value is multiplied by 5.
         *
         * @return <code>int</code> the relock timeout in seconds.
         */
        public int getRelockTimeout()
        {
                return 420;
        }
        
        /**
         * Sets the relock timeout in the cradle's configuration area. Allowed
         * values are in the range [5 - 420] seconds.
         * The stored value is divided by 5 before saving it (see above).
         *
         * @param new_timeout
         *            An integer value between 5 seconds and 420 seconds (7 minutes).
         */
        public void setRelockTimeout(int new_timeout)
        {
                
        }
        
        /**
         * Returns the configuration area's flag which states whether the 
         * notification LED's smoothing is enabled or not.
         *
         * @return <code>boolean</code> true if the smoothing is enabled,
         * false otherwise.
         */
        public boolean isNotificationLedSmoothingEnabled()
        {
                return false;
        }

        /**
         * Sets the configuration area's flag which states whether the 
         * notification LED's smoothing is enabled or not.
         *
         * @param enable
         *            True to enable smoothing, false for disabling it.
         */
        public void setNotificationLedSmoothingEnabled(boolean enable)
        {
                
        }
        
        /**
         * Returns the configuration area's flag which states whether the 
         * standby LED is enabled or not.
         *
         * @return <code>boolean</code> true if the smoothing is enabled,
         * false otherwise.
         */
        public boolean isStandbyLedEnabled()
        {
                return false;
        }

        /**
         * Sets the configuration area's flag which states whether the 
         * standby LED is enabled or not.
         *
         * @param enable
         *            True to enable smoothing, false for disabling it.
         */
        public void setStandbyLedEnabled(boolean enable)
        {
                
        }
        
        /**
         * Returns the configuration area's flag which states whether the 
         * WLC is blocked all the times the lever is open or only when 
         * an unlock command is received.
         *
         * @return <code>boolean</code> true means that the WLC is blocked
         * all the times that the lever is open, no matter if this is done
         * with an unlock command or with the unlocking key. 
         * When disabled (false) it means that the WLC is blocked only when
         * the unlock command is received, whereas the unlocking key has
         * no effect.
         */
        public boolean isStopWlcWhenLeverOpenEnabled()
        {
                return true;
        }

        /**
         * Sets the corresponding configuration area's flag.
         *
         * @param enable
         *            True to bind the WLC status to the lever's one; false 
         * for binding the WLC status to the unlock command.
         */
        public void setStopWlcWhenLeverOpenEnabled(boolean enable)
        {

        }
        
        /**
         * Get the failure notification bitmask from the cradle. Failures
         * on the cradle will be notified only when the corresponding
         * bit is set on the mask.
         * 
         * @return <code>int</code> the current failure notification mask
         */
        public int getFailureNotificationMask()
        {
                return 0;
        }
        
        /**
         * Set the failure notification mask.
         * 
         * @param mask
         *          The failure bitmask that will be used from the cradle
         * for notifying failures.
         */
        public void setFailureNotificationMask(int mask)
        {
            
        }
}
