/*
 * Copyright (c) NoticeDog 2017.
 * GNU LESSER GENERAL PUBLIC LICENSE
 *     Version 3, 29 June 2007
 *
 * Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed.
 *
 *
 * This version of the GNU Lesser General Public License incorporates
 * the terms and conditions of version 3 of the GNU General Public
 * License, supplemented by the additional permissions listed below.
 *
 * 0. Additional Definitions.
 *
 * As used herein, "this License" refers to version 3 of the GNU Lesser
 * General Public License, and the "GNU GPL" refers to version 3 of the GNU
 * General Public License.
 *
 * "The Library" refers to a covered work governed by this License,
 * other than an Application or a Combined Work as defined below.
 *
 * An "Application" is any work that makes use of an interface provided
 * by the Library, but which is not otherwise based on the Library.
 * Defining a subclass of a class defined by the Library is deemed a mode
 * of using an interface provided by the Library.
 *
 * A "Combined Work" is a work produced by combining or linking an
 * Application with the Library.  The particular version of the Library
 * with which the Combined Work was made is also called the "Linked
 * Version".
 *
 * The "Minimal Corresponding Source" for a Combined Work means the
 * Corresponding Source for the Combined Work, excluding any source code
 * for portions of the Combined Work that, considered in isolation, are
 * based on the Application, and not on the Linked Version.
 *
 * The "Corresponding Application Code" for a Combined Work means the
 * object code and/or source code for the Application, including any data
 * and utility programs needed for reproducing the Combined Work from the
 * Application, but excluding the System Libraries of the Combined Work.
 *
 * 1. Exception to Section 3 of the GNU GPL.
 *
 * You may convey a covered work under sections 3 and 4 of this License
 * without being bound by section 3 of the GNU GPL.
 *
 * 2. Conveying Modified Versions.
 *
 * If you modify a copy of the Library, and, in your modifications, a
 * facility refers to a function or data to be supplied by an Application
 * that uses the facility (other than as an argument passed when the
 * facility is invoked), then you may convey a copy of the modified
 * version:
 *
 * a) under this License, provided that you make a good faith effort to
 * ensure that, in the event an Application does not supply the
 * function or data, the facility still operates, and performs
 * whatever part of its purpose remains meaningful, or
 *
 * b) under the GNU GPL, with none of the additional permissions of
 * this License applicable to that copy.
 *
 * 3. Object Code Incorporating Material from Library Header Files.
 *
 * The object code form of an Application may incorporate material from
 * a header file that is part of the Library.  You may convey such object
 * code under terms of your choice, provided that, if the incorporated
 * material is not limited to numerical parameters, data structure
 * layouts and accessors, or small macros, inline functions and templates
 * (ten or fewer lines in length), you do both of the following:
 *
 * a) Give prominent notice with each copy of the object code that the
 * Library is used in it and that the Library and its use are
 * covered by this License.
 *
 * b) Accompany the object code with a copy of the GNU GPL and this license
 * document.
 *
 * 4. Combined Works.
 *
 * You may convey a Combined Work under terms of your choice that,
 * taken together, effectively do not restrict modification of the
 * portions of the Library contained in the Combined Work and reverse
 * engineering for debugging such modifications, if you also do each of
 * the following:
 *
 * a) Give prominent notice with each copy of the Combined Work that
 * the Library is used in it and that the Library and its use are
 * covered by this License.
 *
 * b) Accompany the Combined Work with a copy of the GNU GPL and this license
 * document.
 *
 * c) For a Combined Work that displays copyright notices during
 * execution, include the copyright notice for the Library among
 * these notices, as well as a reference directing the user to the
 * copies of the GNU GPL and this license document.
 *
 * d) Do one of the following:
 *
 * 0) Convey the Minimal Corresponding Source under the terms of this
 * License, and the Corresponding Application Code in a form
 * suitable for, and under terms that permit, the user to
 * recombine or relink the Application with a modified version of
 * the Linked Version to produce a modified Combined Work, in the
 * manner specified by section 6 of the GNU GPL for conveying
 * Corresponding Source.
 *
 * 1) Use a suitable shared library mechanism for linking with the
 * Library.  A suitable mechanism is one that (a) uses at run time
 * a copy of the Library already present on the user's computer
 * system, and (b) will operate properly with a modified version
 * of the Library that is interface-compatible with the Linked
 * Version.
 *
 * e) Provide Installation Information, but only if you would otherwise
 * be required to provide such information under section 6 of the
 * GNU GPL, and only to the extent that such information is
 * necessary to install and execute a modified version of the
 * Combined Work produced by recombining or relinking the
 * Application with a modified version of the Linked Version. (If
 * you use option 4d0, the Installation Information must accompany
 * the Minimal Corresponding Source and Corresponding Application
 * Code. If you use option 4d1, you must provide the Installation
 * Information in the manner specified by section 6 of the GNU GPL
 * for conveying Corresponding Source.)
 *
 * 5. Combined Libraries.
 *
 * You may place library facilities that are a work based on the
 * Library side by side in a single library together with other library
 * facilities that are not Applications and are not covered by this
 * License, and convey such a combined library under terms of your
 * choice, if you do both of the following:
 *
 * a) Accompany the combined library with a copy of the same work based
 * on the Library, uncombined with any other library facilities,
 * conveyed under the terms of this License.
 *
 * b) Give prominent notice with the combined library that part of it
 * is a work based on the Library, and explaining where to find the
 * accompanying uncombined form of the same work.
 *
 * 6. Revised Versions of the GNU Lesser General Public License.
 *
 * The Free Software Foundation may publish revised and/or new versions
 * of the GNU Lesser General Public License from time to time. Such new
 * versions will be similar in spirit to the present version, but may
 * differ in detail to address new problems or concerns.
 *
 * Each version is given a distinguishing version number. If the
 * Library as you received it specifies that a certain numbered version
 * of the GNU Lesser General Public License "or any later version"
 * applies to it, you have the option of following the terms and
 * conditions either of that published version or of any later version
 * published by the Free Software Foundation. If the Library as you
 * received it does not specify a version number of the GNU Lesser
 * General Public License, you may choose any version of the GNU Lesser
 * General Public License ever published by the Free Software Foundation.
 *
 * If the Library as you received it specifies that a proxy can decide
 * whether future versions of the GNU Lesser General Public License shall
 * apply, that proxy's public statement of acceptance of any version is
 * permanent authorization for you to choose that version for the
 * Library.
 */

package io.mobeta.android.dslv;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A subclass of {@link android.widget.CursorAdapter} that provides
 * reordering of the elements in the Cursor based on completed
 * drag-sort operations. The reordering is a simple mapping of
 * list positions into Cursor positions (the Cursor is unchanged).
 * To persist changes made by drag-sorts, one can retrieve the
 * mapping with the {@link #getCursorPositions()} method, which
 * returns the reordered list of Cursor positions.
 * <p>
 * An instance of this class is passed
 * to {@link DragSortListView#setAdapter(ListAdapter)} and, since
 * this class implements the {@link DragSortListView.DragSortListener}
 * interface, it is automatically set as the DragSortListener for
 * the DragSortListView instance.
 */
public abstract class DragSortCursorAdapter extends CursorAdapter implements DragSortListView.DragSortListener {

    public static final int REMOVED = -1;

    /**
     * Key is ListView position, value is Cursor position
     */
    private SparseIntArray mListMapping = new SparseIntArray();

    private ArrayList<Integer> mRemovedCursorPositions = new ArrayList<Integer>();

    public DragSortCursorAdapter(Context context, Cursor c) {
        super(context, c);
    }

    public DragSortCursorAdapter(Context context, Cursor c, boolean autoRequery) {
        super(context, c, autoRequery);
    }

    public DragSortCursorAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
    }

    /**
     * Swaps Cursor and clears list-Cursor mapping.
     *
     * @see android.widget.CursorAdapter#swapCursor(Cursor)
     */
    @Override
    public Cursor swapCursor(Cursor newCursor) {
        Cursor old = super.swapCursor(newCursor);
        resetMappings();
        return old;
    }

    /**
     * Changes Cursor and clears list-Cursor mapping.
     *
     * @see android.widget.CursorAdapter#changeCursor(Cursor)
     */
    @Override
    public void changeCursor(Cursor cursor) {
        super.changeCursor(cursor);
        resetMappings();
    }

    /**
     * Resets list-cursor mapping.
     */
    public void reset() {
        resetMappings();
        notifyDataSetChanged();
    }

    private void resetMappings() {
        mListMapping.clear();
        mRemovedCursorPositions.clear();
    }

    @Override
    public Object getItem(int position) {
        return super.getItem(mListMapping.get(position, position));
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(mListMapping.get(position, position));
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return super.getDropDownView(mListMapping.get(position, position), convertView, parent);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return super.getView(mListMapping.get(position, position), convertView, parent);
    }

    /**
     * On drop, this updates the mapping between Cursor positions
     * and ListView positions. The Cursor is unchanged. Retrieve
     * the current mapping with {@link getCursorPositions()}.
     *
     * @see DragSortListView.DropListener#drop(int, int)
     */
    @Override
    public void drop(int from, int to) {
        if (from != to) {
            int cursorFrom = mListMapping.get(from, from);

            if (from > to) {
                for (int i = from; i > to; --i) {
                    mListMapping.put(i, mListMapping.get(i - 1, i - 1));
                }
            } else {
                for (int i = from; i < to; ++i) {
                    mListMapping.put(i, mListMapping.get(i + 1, i + 1));
                }
            }
            mListMapping.put(to, cursorFrom);

            cleanMapping();
            notifyDataSetChanged();
        }
    }

    /**
     * On remove, this updates the mapping between Cursor positions
     * and ListView positions. The Cursor is unchanged. Retrieve
     * the current mapping with {@link getCursorPositions()}.
     *
     * @see DragSortListView.RemoveListener#remove(int)
     */
    @Override
    public void remove(int which) {
        int cursorPos = mListMapping.get(which, which);
        if (!mRemovedCursorPositions.contains(cursorPos)) {
            mRemovedCursorPositions.add(cursorPos);
        }

        int newCount = getCount();
        for (int i = which; i < newCount; ++i) {
            mListMapping.put(i, mListMapping.get(i + 1, i + 1));
        }

        mListMapping.delete(newCount);

        cleanMapping();
        notifyDataSetChanged();
    }

    /**
     * Does nothing. Just completes DragSortListener interface.
     */
    @Override
    public void drag(int from, int to) {
        // do nothing
    }

    /**
     * Remove unnecessary mappings from sparse array.
     */
    private void cleanMapping() {
        ArrayList<Integer> toRemove = new ArrayList<Integer>();

        int size = mListMapping.size();
        for (int i = 0; i < size; ++i) {
            if (mListMapping.keyAt(i) == mListMapping.valueAt(i)) {
                toRemove.add(mListMapping.keyAt(i));
            }
        }

        size = toRemove.size();
        for (int i = 0; i < size; ++i) {
            mListMapping.delete(toRemove.get(i));
        }
    }

    @Override
    public int getCount() {
        return super.getCount() - mRemovedCursorPositions.size();
    }

    /**
     * Get the Cursor position mapped to by the provided list position
     * (given all previously handled drag-sort
     * operations).
     *
     * @param position List position
     * @return The mapped-to Cursor position
     */
    public int getCursorPosition(int position) {
        return mListMapping.get(position, position);
    }

    /**
     * Get the current order of Cursor positions presented by the
     * list.
     */
    public ArrayList<Integer> getCursorPositions() {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < getCount(); ++i) {
            result.add(mListMapping.get(i, i));
        }

        return result;
    }

    /**
     * Get the list position mapped to by the provided Cursor position.
     * If the provided Cursor position has been removed by a drag-sort,
     * this returns {@link #REMOVED}.
     *
     * @param cursorPosition A Cursor position
     * @return The mapped-to list position or REMOVED
     */
    public int getListPosition(int cursorPosition) {
        if (mRemovedCursorPositions.contains(cursorPosition)) {
            return REMOVED;
        }

        int index = mListMapping.indexOfValue(cursorPosition);
        if (index < 0) {
            return cursorPosition;
        } else {
            return mListMapping.keyAt(index);
        }
    }


}
