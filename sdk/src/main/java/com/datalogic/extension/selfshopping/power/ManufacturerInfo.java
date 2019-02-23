package com.datalogic.extension.selfshopping.power;

/**
 * Class representing generic battery manufacturer info.
 */
public class ManufacturerInfo
{
	/**
	 * Unknown battery model.
	 */
	public static final int MODEL_ID_UNKNOWN = 0;

	/**
	 * BT-44 battery.
	 */
	public static final int MODEL_ID_BT44 = 1;

	/**
	 * BT-44 black battery.
	 */
	public static final int MODEL_ID_BT44_BLACK = 2;

        /**
         * @hide
         */
        ManufacturerInfo()
        {

        }

        /**
         * Gets the current battery model ID.
         *
         * @return <code>int</code>
         *         An ID representing the current battery model.
         */
        public int getModelID()
        {
                return 0;
        }

        /**
         * Returns the battery model name.
         *
         * @return <code>String</code>
         *         The battery model name.
         */
        public String getModelName()
        {
                return null;
        }

        /**
         * Returns the battery technology in String form.
         *
         * @return <code>String</code>
         *         The battery technology.
         */
        public String getTechnology()
        {
                return null;
        }

        /**
         * Returns the battery full design capacity (in mAh).
         *
         * @return <code>int</code>
         *         The full design capacity of the battery.
         */
        public int getFullCapacityDesign()
        {
                return 0;
        }

        /**
         * Returns the battery serial number.
         *
         * @return <code>String</code>
         *         The battery serial number.
         */
        public String getSerialNumber()
        {
                return null;
        }
}
