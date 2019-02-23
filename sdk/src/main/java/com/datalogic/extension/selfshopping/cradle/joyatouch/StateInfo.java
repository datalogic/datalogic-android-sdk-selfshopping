package com.datalogic.extension.selfshopping.cradle.joyatouch;

/**
 * Info about the state of the Joya Touch Cradle. Some info are general
 * to the Cradle, while other are specific to the Cradle slot in use
 * by the device.
 */
public class StateInfo
{
        /**
         * Empty constructor for the Joya Touch State Info.
         */
        public StateInfo()
        {

        }

        /**
         * Gets the Cradle system version.
         *
         * @return <code>long</code> the Cradle system version.
         */
        public long getApplVersion()
        {
                return 0;
        }

        /**
         * Gets the Cradle bootloader version.
         *
         * @return <code>long</code> the Cradle bootloader version.
         */
        public long getBtldrVersion()
        {
                return 0;
        }

        /**
         * Gets the current slot index.
         *
         * @return <code>short</code> the slot index occupied by the device.
         */
        public short getSlotIndex()
        {
                return 0;
        }

        /**
         * Gets the current insertion count for this Cradle slot.
         *
         * @return <code>long</code> the Cradle insertion count.
         */
        public long getInsertionCount()
        {
                return 0;
        }

        /**
         * Checks if fast charge is available in this Cradle.
         *
         * @return <code>boolean</code> true if fast charge is available,
         * false otherwise.
         */
        public boolean isFastChargeAvailable()
        {
                return false;
        }

        /**
         * Checks if concurrency between NFC and WLC is supported by this Cradle.
         *
         * @return <code>boolean</code> true if concurrency is supported,
         * false otherwise.
         */
        public boolean isConcurrencySupported()
        {
                return false;
        }
}
