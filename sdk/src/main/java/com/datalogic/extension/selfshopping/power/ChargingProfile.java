package com.datalogic.extension.selfshopping.power;

/**
 * Class representing a generic charging profile that can be used in the
 * {@link SelfshoppingBatteryManager} in order to setup a different charging
 * preference (device dependent).
 */
public class ChargingProfile
{
        /**
         * @hide
         */
        private ChargingProfile()
        {

        }

        /**
         * Returns the charging profile ID.
         *
         * @return <code>int</code>
         *         The charging profile ID.
         */
        public int getId()
        {
                return 0;
        }

        /**
         * Returns the charging profile name.
         *
         * @return <code>String</code>
         *         The charging profile name.
         */
        public String getName()
        {
                return null;
        }

        /**
         * Returns the description of this charging profile.
         *
         * @return <code>String</code>
         *         The description of this charging profile.
         */
        public String getDescription()
        {
                return null;
        }
}
