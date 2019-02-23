package com.datalogic.extension.selfshopping.cradle.joyatouch;

/**
 * Class representing a generic area of data, consisting in an array of
 * bytes and its size.
 */
public class GenericArea
{
        /**
         * Constructor for an empty area.
         */
        public GenericArea()
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
        public GenericArea(int size)
        {

        }

        /**
         * Constructor that fills the area with the byte array given as input.
         *
         * @param content
         *            The byte array that will represent the content of the
         *            new area. This array will be deep copied inside the class,
         *            any modification to the original array will not be
         *            reproduced inside the GenericArea object.
         *
         * @throws IllegalArgumentException in case the input array is invalid.
         */
        public GenericArea(byte[] content)
        {

        }

        /**
         * Gets the content of this area.
         *
         * @return <code>byte[]</code> the byte array representing the area
         * content.
         */
        public byte[] getContent()
        {
                return null;
        }

        /**
         * Gets the area size.
         *
         * @return <code>int</code> the internal byte array length.
         */
        public int getSize()
        {
                return 0;
        }

        /**
         * Sets the content of this area.
         *
         * @param content
         *            The new byte array that will be deep copied inside the
         *            area, substituting the old one (if present).
         *
         * @throws IllegalArgumentException in case the input array is invalid.
         */
        public void setContent(byte[] content)
        {
                return;
        }
}
