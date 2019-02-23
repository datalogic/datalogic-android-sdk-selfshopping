package com.datalogic.extension.selfshopping.power;

import java.util.List;

/**
 * The Battery Manager used in the Selfshopping Extension SDK. It allows to
 * read specific battery parameters related to lifetime, manufacturer
 * information or realtime values.
 * This class is also used to setup the current charging profile between the
 * ones available.
 */
public class SelfshoppingBatteryManager
{
        /**
         * Action for a sticky broadcast containing health information about
         * the battery. All intent extras are documented in the
         * {@link SelfshoppingBatteryManager} class.
         */
        public static final String ACTION_LIFETIME_DATA_CHANGED =
                "com.datalogic.extension.selfshopping.power.action.LIFETIME_DATA_CHANGED";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the current state of health in percentage.
         */
        public static final String EXTRA_LIFETIME_STATE_OF_HEALTH = "lifetime_state_of_health";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the amount of discharge (in 0.1 Ah) taken by the battery during its
         * life.
         */
        public static final String EXTRA_LIFETIME_TOTAL_DISCHARGE = "lifetime_total_discharge";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the remaining battery capacity in mAh.
         */
        public static final String EXTRA_LIFETIME_CAPACITY_REMAINING = "lifetime_capacity_remaining";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the full battery capacity in mAh.
         */
        public static final String EXTRA_LIFETIME_CAPACITY_FULL = "lifetime_capacity_full";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the minimum temperature reached by the battery during its life
         * (in 0.1 °C).
         */
        public static final String EXTRA_LIFETIME_TEMPERATURE_MIN = "lifetime_temperature_min";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the maximum temperature reached by the battery during its life
         * (in 0.1 °C).
         */
        public static final String EXTRA_LIFETIME_TEMPERATURE_MAX = "lifetime_temperature_max";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the minimum voltage reached by the battery during its life (in mV).
         */
        public static final String EXTRA_LIFETIME_VOLTAGE_MIN = "lifetime_voltage_min";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the maximum voltage reached by the battery during its life (in mV).
         */
        public static final String EXTRA_LIFETIME_VOLTAGE_MAX = "lifetime_voltage_max";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the maximum charge current reached by the battery during its life
         * (in mA).
         */
        public static final String EXTRA_LIFETIME_CHARGE_CURRENT_MAX = "lifetime_charge_current_max";

        /**
         * Extra for {@link #ACTION_LIFETIME_DATA_CHANGED}: integer containing
         * the maximum discharge current reached by the battery during its life
         * (in mA).
         */
        public static final String EXTRA_LIFETIME_DISCHARGE_CURRENT_MAX = "lifetime_discharge_current_max";

        /**
         * Charging profile on the Joya Touch device with charging speed only
         * preference.
         */
        public static final int CHARGING_PROFILE_JOYA_TOUCH_CHARGING_SPEED = 1;

        /**
         * Charging profile on the Joya Touch device with capacity only
         * preference.
         */
        public static final int CHARGING_PROFILE_JOYA_TOUCH_CAPACITY = 2;

        /**
         * Charging profile on the Joya Touch device with charging speed and
         * capacity preference.
         */
        public static final int CHARGING_PROFILE_JOYA_TOUCH_CHARGING_SPEED_CAPACITY = 3;

        /**
         * Charging profile on the Joya Touch device with lifetime only
         * preference.
         */
        public static final int CHARGING_PROFILE_JOYA_TOUCH_LIFETIME = 4;

        /**
         * Charging profile on the Joya Touch device with charging speed and
         * lifetime preference.
         */
        public static final int CHARGING_PROFILE_JOYA_TOUCH_CHARGING_SPEED_LIFETIME = 5;

        /**
         * Charging profile on the Joya Touch device with capacity and
         * lifetime preference.
         */
        public static final int CHARGING_PROFILE_JOYA_TOUCH_CAPACITY_LIFETIME = 6;

        /**
         * Integer property representing the estimated remaining battery
         * life (in seconds).
         */
        public static final int PROPERTY_TIME_TO_EMPTY = 1;

        /**
         * @hide
         */
        private SelfshoppingBatteryManager()
        {

        }

        /**
         * Returns an instance of the {@link SelfshoppingBatteryManager}.
         *
         * @return
         *         The Selfshopping Battery Manager.
         */
        public static SelfshoppingBatteryManager getInstance()
        {
                return null;
        }

        /**
         * Reads the battery manufacturer info.
         *
         * @return
         *         A {@link com.datalogic.extension.selfshopping.power.ManufacturerInfo}
         *         object containing all battery manufacturer info.
         */
        public ManufacturerInfo getManufacturerInfo()
        {
                return null;
        }

        /**
         * Gets the supported charging profiles in this device. You can use one
         * of the returning objects to setup the desired charging profile.
         *
         * @return
         *         A list of {@link com.datalogic.extension.selfshopping.power.ChargingProfile}
         *         objects, each representing one of the supported charging profile.
         *         The list can be empty in case no charging profile is supported in the
         *         current device.
         */
        public List<ChargingProfile> getSupportedChargingProfiles()
        {
                return null;
        }

        /**
         * Sets the current charging profile. This setting is persistent to
         * device reboots or even factory resets.
         *
         * @param chargingProfile
         *         The {@link com.datalogic.extension.selfshopping.power.ChargingProfile}
         *         to set.
         */
        public void setCurrentChargingProfile(ChargingProfile chargingProfile)
        {

        }

        /**
         * Gets the current charging profile setup in this device.
         *
         * @return
         *         The {@link com.datalogic.extension.selfshopping.power.ChargingProfile}
         *         currently setup in this device.
         */
        public ChargingProfile getCurrentChargingProfile()
        {
                return null;
        }

        /**
         * Reads a specific integer value given its ID. This value is present
         * as one of the properties of the {@link SelfshoppingBatteryManager}
         * and it must be positive.
         *
         * @param id
         *         The property ID (needs to be one of the supported).
         *
         * @return <code>int</code>
         *         The value of the specified property, or throws an
         *         <code>Exception</code> in case of failure.
         */
        public int getIntProperty(int id)
        {
                return 0;
        }
}
