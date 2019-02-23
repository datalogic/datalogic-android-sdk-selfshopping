package com.datalogic.extension.selfshopping.cradle.joyatouch;

/**
 * Class representing the Joya Touch custom area of data, consisting in an
 * array of bytes and its size. Each Cradle slot contains one of these areas.
 */
public class CustomArea extends GenericArea
{
        /**
         * Custom area size for the Joya Touch Cradle. It is not
         * possible to write or read more than this amount of bytes.
         */
        public static final int SIZE = 512;

        /**
         * Constructor for an area of {@link #SIZE} elements.
         */
        public CustomArea()
        {

        }

        /**
         * Constructor specifying the size of the internal byte array to create.
         *
         * @param size
         *            The requested byte array size.
         *
         * @throws IllegalArgumentException in case the input size is invalid.
         */
        public CustomArea(int size)
        {

        }

        /**
         * Constructor that fills the area with the byte array given as input.
         *
         * @param content
         *            The byte array that will represent the content of the
         *            new area. This array will be deep copied inside the class,
         *            any modification to the original array will not be
         *            reproduced inside the CustomArea object.
         *
         * @throws IllegalArgumentException in case the input array is invalid.
         */
        public CustomArea(byte[] content)
        {

        }
}
