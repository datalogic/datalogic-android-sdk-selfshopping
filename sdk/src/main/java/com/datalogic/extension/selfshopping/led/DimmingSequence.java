package com.datalogic.extension.selfshopping.led;

import java.util.List;

/**
 * Class representing a sequence characterized by <code>(time, brightness)</code> pairs.
 * The sequence is executed by a dimming LED that interpolates the brightness
 * between different time values of the sequence. In this way is possible to
 * have a smooth dimming effect.
 */
public class DimmingSequence
{
        /**
         * Maximum number of sequence points supported.
         */
        public static final int MAX_SIZE = 50;

        /**
         * Constructor of a dimming sequence, taking an array of points as
         * parameter.
         * The points will be deep copied in the sequence, any change to the
         * original set will not take effect in the sequence.
         * Additionally, the input sequence should not be null, contain any
         * point with the same time value or be larger than {@link #MAX_SIZE}.
         * In any of these cases, an {@link IllegalArgumentException} will be thrown.
         *
         * @param sequence
         *        An array of {@link DimmingSequencePoint} objects, each
         *        representing a <code>(time, brightness)</code> pair in the sequence.
         *
         * @throws IllegalArgumentException
         *         Exception thrown when the input sequence is invalid.
         */
        public DimmingSequence(DimmingSequencePoint[] sequence) throws IllegalArgumentException
        {

        }

        /**
         * Empty constructor of a dimming sequence.
         */
        public DimmingSequence()
        {

        }

        /**
         * Adds a new point in the sequence. The new point will be added only if
         * in the sequence there isn't another point with the same time value
         * and if the sequence does not exceed {@link #MAX_SIZE} after the addition.
         * If one of these cases is true an {@link IllegalArgumentException} will be thrown.
         *
         * @param point
         *        The point to add.
         *
         * @throws IllegalArgumentException
         *         If one of the above cases is true.
         */
        public void add(DimmingSequencePoint point) throws IllegalArgumentException
        {

        }

        /**
         * Removes a point in the sequence.
         *
         * @param point
         *        The point to remove. A check both on time and on brightness
         *        values is done.
         */
        public void remove(DimmingSequencePoint point)
        {

        }

        /**
         * Removes a point in the sequence, given the time parameter of the
         * point to remove.
         *
         * @param time
         *        The time value of the point to remove.
         */
        public void removeAt(int time)
        {

        }

        /**
         * Retrieves a point given its time value.
         *
         * @param time
         *        The time value of the point to find.
         *
         * @return
         *         The {@link DimmingSequencePoint} object if found, or null
         *         if not found.
         */
        public DimmingSequencePoint getAt(int time)
        {
                return null;
        }

        /**
         * Return an array of <code>(time, brightness)</code> pairs that represent the
         * sequence. All points will be a copy of the original, thus any update
         * to the resulting array will not take effect on the sequence.
         *
         * @return
         *         The array of {@link DimmingSequencePoint} objects.
         */
        public DimmingSequencePoint[] getSequenceArray()
        {
                return null;
        }

        /**
         * Return the sequence size.
         *
         * @return <code>int</code>
         *         The number of points in the sequence.
         */
        public int size()
        {
                return 0;
        }

        /**
         * Remove all the points of the sequence.
         */
        public void clear()
        {
                
        }
}
