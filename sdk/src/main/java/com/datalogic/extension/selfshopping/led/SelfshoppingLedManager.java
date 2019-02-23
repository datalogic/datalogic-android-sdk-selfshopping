package com.datalogic.extension.selfshopping.led;

import android.content.Context;

import com.datalogic.extension.selfshopping.led.action.LedAction;
import com.datalogic.extension.selfshopping.led.event.LedEvent;

import java.util.List;

/**
 * The LED Manager used in the Selfshopping Extension SDK. It allows to
 * command the different LEDs available on the device, using specific
 * APIs dependent on the type of LED in use.
 * The currently available types of LED are the standard {@link Led},
 * that can blink or be turned ON/OFF, and the {@link DimmingLed},
 * in which is also possible to set the brightness and start a
 * dimming sequence.
 * It is also possible to command the LEDs through specific
 * {@link LedAction} objects.
 */
public class SelfshoppingLedManager
{
        /**
         * ID of the left LED.
         */
        public static final int LED_ID_LEFT = 0;

        /**
         * ID of the right LED.
         */
        public static final int LED_ID_RIGHT = 1;

        /**
         * ID of the bottom LED.
         */
        public static final int LED_ID_BOTTOM = 2;

        /**
         * ID of the left and right LEDs. In this configuration the two LEDs
         * will be commanded simultaneously.
         */
        public static final int LED_ID_LEFT_AND_RIGHT = 3;

        /**
         * ID of the left and right alternative LEDs. In this configuration
         * only one of the two LEDs will be on while blinking and they
         * will alternate.
         */
        public static final int LED_ID_LEFT_AND_RIGHT_ALTERNATE = 4;

        /**
         * ID for the shutdown event.
         */
        public static final int EVENT_ID_SHUTDOWN = 0;

        /**
         * ID for the boot animation event.
         */
        public static final int EVENT_ID_BOOT_ANIMATION = 1;

        /**
         * ID for the battery charging event.
         */
        public static final int EVENT_ID_BATTERY_CHARGING = 2;

        /**
         * ID for the end of charge event.
         */
        public static final int EVENT_ID_END_OF_CHARGE = 3;
	
	/**
	 * @hide
	 */
	private SelfshoppingLedManager()
        {
                
        }

        /**
         * Returns an instance of the {@link SelfshoppingLedManager}.
         *
         * @return
         *         The Selfshopping LED Manager.
         */
        public static SelfshoppingLedManager getInstance()
        {
                return null;
        }

        /**
         * Retrieves a LED given its ID. This method always returns the given
         * LED if the ID is correct, however any control on the LED is not
         * guaranteed to work if the LED is already used for other operations,
         * such as running LED events.
         *
         * @param id
         *        The ID of the LED to retrieve.
         *
         * @return
         *         The {@link Led} instance associated with this ID if it
         *         exists, <code>null</code> otherwise.
         */
        public Led getLed(int id)
        {
                return null;
        }

        /**
         * Acquires a LED given its ID and the current application context.
         * The LED acquired will be locked and cannot be controlled by other
         * applications or by LED events. The method will return
         * <code>null</code> in case the ID is not correct or the LED is
         * already used by another application or a LED event.
         *
         * @param id
         *        The ID of the LED to retrieve.
         * @param context
         *        The application context.
         *
         * @return
         *         The {@link Led} instance associated with this ID if it
         *         exists and is not in use, <code>null</code> otherwise.
         */
        public Led acquireLed(int id, Context context)
        {
                return null;
        }

        /**
         * Releases a previously acquired LED by specifying its id and the
         * current application context.
         *
         * @param id
         *        The ID of the LED to retrieve.
         * @param context
         *        The application context.
         */
        public void releaseLed(int id, Context context)
        {
                
        }

        /**
         * Returns a list of all available LEDs on this device.
         *
         * @return
         *         The list of available LEDs.
         */
        public List<Led> getAvailableLeds()
        {
                return null;
        }

        /**
         * Applies a {@link LedAction}, corresponding to a method
         * invocation on a specific LED.
         *
         * @param action
         *        The {@link LedAction} to apply.
         */
        public boolean applyAction(LedAction action)
        {
                return false;
        }

        /**
         * Retrieves a LED event given its ID.
         *
         * @param id
         *        The ID of the LED event to retrieve.
         *
         * @return
         *         The {@link com.datalogic.extension.selfshopping.led.event.LedEvent}
         *         instance associated with this ID if it exists,
         *         <code>null</code> otherwise.
         */
        public LedEvent getLedEvent(int id)
        {
                return null;
        }

        /**
         * Returns a list of all available LED events, being them predefined or
         * created by applications.
         *
         * @return
         *         The list of available LED events.
         */
        public List<LedEvent> getAvailableLedEvents()
        {
                return null;
        }
}
