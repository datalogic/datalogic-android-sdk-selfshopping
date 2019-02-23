package com.datalogic.extension.selfshopping;

/**
 * The Version class contains the Selfshopping extension version.
 */
public class Version {
	/**
	 * @hide
	 */
	public static final short SELFSHOPPING_EXTENSION_VERSION_MAJOR = 1;
	/**
	 * @hide This changes frequently
	 */
	public static final short SELFSHOPPING_EXTENSION_VERSION_MINOR = 8;

	/**
	 * Returns a number indicating the installed Datalogic Selfshopping
         * extension version in use at compile time.
	 */
	public static final int SELFSHOPPING_EXTENSION_VERSION_INT =
                (SELFSHOPPING_EXTENSION_VERSION_MAJOR << 16) +
                (SELFSHOPPING_EXTENSION_VERSION_MINOR);

	/**
	 * Returns a String indicating the installed Datalogic Selfshopping
	 * extension version in use at compile time.
	 */
	public static final String SELFSHOPPING_EXTENSION_VERSION = "" + (SELFSHOPPING_EXTENSION_VERSION_MAJOR) + "." + (SELFSHOPPING_EXTENSION_VERSION_MINOR);

	/**
	 * Returns a String indicating the first Datalogic SDK version supporting the SelfShopping SDK Extension v1.1.
	 */
	public static final String SELFSHOPPING_SDK_EXTENSION_V_1_1 = "1.3";

	/**
	 * Returns a String indicating the first Datalogic SDK version supporting the SelfShopping SDK Extension v1.2.
	 */
	public static final String SELFSHOPPING_SDK_EXTENSION_V_1_2 = "1.5";

	/**
	 * Returns a String indicating the first Datalogic SDK version supporting the SelfShopping SDK Extension v1.3.
	 */
	public static final String SELFSHOPPING_SDK_EXTENSION_V_1_3 = "1.6";

	/**
	 * Returns a String indicating the first Datalogic SDK version supporting the SelfShopping SDK Extension v1.4.
	 */
	public static final String SELFSHOPPING_SDK_EXTENSION_V_1_4 = "1.8";

	/**
	 * Returns a String indicating the first Datalogic SDK version supporting the SelfShopping SDK Extension v1.5.
	 */
	public static final String SELFSHOPPING_SDK_EXTENSION_V_1_5 = "1.10";

	/**
	 * Returns a String indicating the first Datalogic SDK version supporting the SelfShopping SDK Extension v1.6.
	 */
	public static final String SELFSHOPPING_SDK_EXTENSION_V_1_6 = "1.11";

	/**
	 * Returns a String indicating the first Datalogic SDK version supporting the SelfShopping SDK Extension v1.7.
	 */
	public static final String SELFSHOPPING_SDK_EXTENSION_V_1_7 = "1.12";

	/**
	 * Returns a String indicating the first Datalogic SDK version supporting the SelfShopping SDK Extension v1.8.
	 */
	public static final String SELFSHOPPING_SDK_EXTENSION_V_1_8 = "1.13";


        /**
         * Returns a number indicating the installed Datalogic Selfshopping
         * extension version on the device.
         */
        public static final int DEVICE_SELFSHOPPING_EXTENSION_VERSION_INT = getSdkInt();

        /**
         * Returns a String indicating the installed Datalogic Selfshopping
         * extension version on the device.
         */
        public static final String DEVICE_SELFSHOPPING_EXTENSION_VERSION = getSdkString();

	/**
	 * Returns statically SDK version number.
	 *
	 * @hide
	 */
	private static int getSdkInt() {
		return 0;
	}

	/**
	 * Returns statically SDK version String.
	 *
	 * @hide
	 */
	private static String getSdkString() {
		return null;
	}
}
