package com.datalogic.extension.selfshopping.led.action.persistence;

import com.datalogic.extension.selfshopping.led.action.LedAction;

/**
 * Helper class to allow persisting {@link com.datalogic.extension.selfshopping.led.action.LedAction}
 * objects to the JSON format. The same operation is also available through reflection
 * by using a classic JSON library (such as Google GSON).
 */
public class PersistJSON
{
        /**
         * Converts a {@link com.datalogic.extension.selfshopping.led.action.LedAction}
         * into a JSON string. This is done taking into consideration all the internal
         * variables composing the object and making them available in the resulting string.
         * If the input object cannot be converted to JSON, a null string will be returned.
         *
         * @param action
         *        The input {@link com.datalogic.extension.selfshopping.led.action.LedAction}.
         *
         * @return <code>String</code>
         *         The resulting JSON String if the conversion succeeds, <code>null</code> otherwise.
         */
        public static String toJson(LedAction action)
        {
                return null;
        }

        /**
         * Converts a JSON string into a {@link com.datalogic.extension.selfshopping.led.action.LedAction}.
         * This is done taking into consideration all the JSON attributes present
         * in the string to generate the resulting object. If there are wrong or
         * missing attributes the operation will fail by returning null.
         *
         * @param json
         *        The input JSON string.
         *
         * @return
         *         The resulting {@link com.datalogic.extension.selfshopping.led.action.LedAction}
         *         if the conversion succeeds, <code>null</code> otherwise.
         */
        public static LedAction fromJson(String json)
        {
                return null;
        }
}
