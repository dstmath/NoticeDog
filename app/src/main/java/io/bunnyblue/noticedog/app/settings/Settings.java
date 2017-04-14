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

package io.bunnyblue.noticedog.app.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.preference.PreferenceManager;
import android.util.TypedValue;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.bunnyblue.noticedog.app.R;
import io.bunnyblue.noticedog.app.swipe.SwipeTabViewController;

@Singleton
public class Settings {
    public static final String KEY_ENABLE_HEADSUP_NOTIFICATION = "enable_headsup_notification";
    public static final String KEY_ENABLE_LEFT_HANDED_MODE = "enable_left_handed_mode";
    public static final String KEY_ENABLE_LOCK_SCREEN = "enable_lock_screen";
    public static final String KEY_EXCLUDED_APPS = "excluded_apps";
    public static final String KEY_FIRST_INBOX_MESSAGE_ADDED = "first_inbox_entry_added";
    public static final String KEY_FIRST_REVIEW_REQUEST = "last_review_request";
    public static final String KEY_HAS_PULLED_DOWN_SHADE = "has_pulled_down_shade";
    public static final String KEY_HAS_SEEN_MIGRATION_SCREEN = "has_seen_migration_screen";
    public static final String KEY_LOCKSCREEN_WIDGET_Y = "lockscreen_widget_y";
    public static final String KEY_NOTIFICATIONS_IN_DRAWER = "notifications_in_drawer";
    public static final String KEY_OOB_COMPLETE = "oob_complete";
    public static final String KEY_OOB_NEEDS_SHADE_MIGRATION = "oob_needs_shade_migration";
    public static final String KEY_OOB_TUTORIAL_COMPLETE = "oob_tutorial_complete";
    public static final String KEY_QUICK_LAUNCH_APPS = "quick_launch_apps2";
    public static final String KEY_REVIEW_COMPLETE = "review_complete";
    public static final String KEY_REVIEW_REQUEST_COUNT = "review_request_count";
    public static final String KEY_TAB_DISPLAY_STATE = "tab_display_state";
    public static final String KEY_TAB_GRAVITY = "tab_gravity";
    public static final String KEY_TAB_VERTICAL_OFFSET = "tab_vertical_offset";
    private static final String KEY_ENABLE_SHADE_NOTIFICATION = "enable_shade_notification";
    private static final String KEY_ENABLE_TAB = "enable_tab";
    Map<SettingChangeListener, OnSharedPreferenceChangeListener> listenerMap;
    boolean volatileShowDebugSettings = false;
    @Inject
    private Context context;

    @Inject
    private Settings() {
    }

    @Inject
    private void start() {
        this.listenerMap = new HashMap();
        PreferenceManager.setDefaultValues(this.context, R.xml.settings, false);
        migrateSettings();
    }

    public void stop() {
    }

    private void migrateSettings() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this.context);
        if (prefs.getString(KEY_TAB_DISPLAY_STATE, "none").equals("none")) {
            if (prefs.getBoolean(KEY_ENABLE_TAB, true)) {
                setTabDisplayState(SwipeTabViewController.TAB_DISPLAY_STATE_VISIBLE);
            } else {
                setTabDisplayState(SwipeTabViewController.TAB_DISPLAY_STATE_HIDDEN);
            }
        }
        if (prefs.contains(KEY_ENABLE_SHADE_NOTIFICATION)) {
            boolean value = prefs.getBoolean(KEY_ENABLE_SHADE_NOTIFICATION, true);
            Editor editor = prefs.edit();
            editor.remove(KEY_ENABLE_SHADE_NOTIFICATION);
            editor.commit();
            setEnableHeadsUpNotification(value);
        }
    }

    public boolean getOOBComplete() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_OOB_COMPLETE, false);
    }

    public void updateOOBComplete(boolean oobComplete) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_OOB_COMPLETE, oobComplete);
        editor.commit();
    }

    public boolean getOOBTutorialComplete() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_OOB_TUTORIAL_COMPLETE, false);
    }

    public void updateOOBTutorialComplete(boolean oobTutorialComplete) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_OOB_TUTORIAL_COMPLETE, oobTutorialComplete);
        editor.commit();
    }

    public boolean getOOBNeedsShadeMigration() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_OOB_NEEDS_SHADE_MIGRATION, true);
    }

    public void updateOOBNeedsShadeMigration(boolean oobNeedsShadeMigration) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_OOB_NEEDS_SHADE_MIGRATION, oobNeedsShadeMigration);
        editor.commit();
    }

    public Set<String> getExcludedApps() {
        Set<String> currentExcludedApps = PreferenceManager.getDefaultSharedPreferences(this.context).getStringSet(KEY_EXCLUDED_APPS, null);
        if (currentExcludedApps == null) {
            return new HashSet();
        }
        return new HashSet(currentExcludedApps);
    }

    public void updateExcludedApps(Set<String> excludedApps) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putStringSet(KEY_EXCLUDED_APPS, excludedApps);
        editor.commit();
    }

    public List<String> getQuickLaunchApps() {
        return (List) new Gson().fromJson(PreferenceManager.getDefaultSharedPreferences(this.context).getString(KEY_QUICK_LAUNCH_APPS, null), new TypeToken<List<String>>() {
        }.getType());
    }

    public void updateQuickLaunchApps(List<String> quickLaunchApps) {
        String serializedApps = new Gson().toJson((Object) quickLaunchApps);
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putString(KEY_QUICK_LAUNCH_APPS, serializedApps);
        editor.commit();
    }

    public boolean getKeepNotificationsInDrawer() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_NOTIFICATIONS_IN_DRAWER, false);
    }

    public void updateKeepNotificationsInDrawer(boolean keepNotificationsInDrawer) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_NOTIFICATIONS_IN_DRAWER, keepNotificationsInDrawer);
        editor.commit();
    }

    public boolean getEnableLockScreen() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_ENABLE_LOCK_SCREEN, true);
    }

    public void updateEnableLockScreen(boolean enableLockScreen) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_ENABLE_LOCK_SCREEN, enableLockScreen);
        editor.commit();
    }

    public int getTabVerticalOffset() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getInt(KEY_TAB_VERTICAL_OFFSET, (int) this.context.getResources().getDimension(R.dimen.tab_vertical_offset));
    }

    public void setTabVerticalOffset(int tabVerticalOffset) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putInt(KEY_TAB_VERTICAL_OFFSET, tabVerticalOffset);
        editor.commit();
    }

    public int getTabGravity() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getInt(KEY_TAB_GRAVITY, 5);
    }

    public void setTabGravity(int gravity) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putInt(KEY_TAB_GRAVITY, gravity);
        editor.commit();
    }

    public long getFirstReviewRequest() {
        long firstReviewRequestTimestamp = PreferenceManager.getDefaultSharedPreferences(this.context).getLong(KEY_FIRST_REVIEW_REQUEST, 0);
        if (firstReviewRequestTimestamp != 0) {
            return firstReviewRequestTimestamp;
        }
        firstReviewRequestTimestamp = System.currentTimeMillis();
        setFirstReviewRequest(firstReviewRequestTimestamp);
        return firstReviewRequestTimestamp;
    }

    public void setFirstReviewRequest(long firstReviewRequestTimestamp) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putLong(KEY_FIRST_REVIEW_REQUEST, firstReviewRequestTimestamp);
        editor.commit();
    }

    public int getReviewRequestedCount() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getInt(KEY_REVIEW_REQUEST_COUNT, 0);
    }

    public void setReviewRequestedCount(int reviewRequestCount) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putInt(KEY_REVIEW_REQUEST_COUNT, reviewRequestCount);
        editor.commit();
    }

    public boolean getReviewComplete() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_REVIEW_COMPLETE, false);
    }

    public void setReviewComplete(boolean reviewComplete) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_REVIEW_COMPLETE, reviewComplete);
        editor.commit();
    }

    public boolean getFirstInboxMessageAdded() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean("first_inbox_entry_added", false);
    }

    public void setFirstInboxMessageAdded(boolean firstInboxMessageAdded) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean("first_inbox_entry_added", firstInboxMessageAdded);
        editor.commit();
    }

    public boolean getEnableLeftHandedMode() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_ENABLE_LEFT_HANDED_MODE, false);
    }

    public void setEnableLeftHandedMode(boolean enableLeftHandedMode) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_ENABLE_LEFT_HANDED_MODE, enableLeftHandedMode);
        editor.commit();
    }

    public boolean getEnableHeadsUpNotification() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_ENABLE_HEADSUP_NOTIFICATION, true);
    }

    public void setEnableHeadsUpNotification(boolean enableHeadsUpNotification) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_ENABLE_HEADSUP_NOTIFICATION, enableHeadsUpNotification);
        editor.commit();
    }

    public String getTabDisplayState() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getString(KEY_TAB_DISPLAY_STATE, SwipeTabViewController.TAB_DISPLAY_STATE_VISIBLE);
    }

    public void setTabDisplayState(String tabDisplayState) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putString(KEY_TAB_DISPLAY_STATE, tabDisplayState);
        editor.commit();
    }

    public boolean getHasSeenMigrationScreen() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_HAS_SEEN_MIGRATION_SCREEN, false);
    }

    public void setHasSeenMigrationScreen(boolean hasSeenMigrationScreen) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_HAS_SEEN_MIGRATION_SCREEN, hasSeenMigrationScreen);
        editor.commit();
    }

    public boolean getHasPulledDownShade() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getBoolean(KEY_HAS_PULLED_DOWN_SHADE, false);
    }

    public void setHasPulledDownShade(boolean hasPulledDownShade) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putBoolean(KEY_HAS_PULLED_DOWN_SHADE, hasPulledDownShade);
        editor.commit();
    }

    public boolean volatileGetShowDebugSettings() {
        return this.volatileShowDebugSettings;
    }

    public void volatileUpdateShowDebugSettings(boolean showDebugSettings) {
        this.volatileShowDebugSettings = showDebugSettings;
    }

    public void registerSettingChangeListener(final SettingChangeListener listener) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this.context);
        OnSharedPreferenceChangeListener spListener = new OnSharedPreferenceChangeListener() {
            public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
                listener.onSettingChanged(Settings.this, key);
            }
        };
        prefs.registerOnSharedPreferenceChangeListener(spListener);
        this.listenerMap.put(listener, spListener);
    }

    public float getLockscreenWidgetY() {
        return PreferenceManager.getDefaultSharedPreferences(this.context).getFloat(KEY_LOCKSCREEN_WIDGET_Y, TypedValue.applyDimension(1, this.context.getResources().getDimension(R.dimen.lockscreen_widget_y_offset), this.context.getResources().getDisplayMetrics()));
    }

    public void updateLockscreenWidgetY(float y) {
        Editor editor = PreferenceManager.getDefaultSharedPreferences(this.context).edit();
        editor.putFloat(KEY_LOCKSCREEN_WIDGET_Y, y);
        editor.commit();
    }

    public void unregisterSettingChangeListener(SettingChangeListener listener) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this.context);
        OnSharedPreferenceChangeListener spListener = (OnSharedPreferenceChangeListener) this.listenerMap.get(listener);
        if (spListener != null) {
            prefs.unregisterOnSharedPreferenceChangeListener(spListener);
        }
        this.listenerMap.remove(listener);
    }

    public interface SettingChangeListener {
        void onSettingChanged(Settings settings, String str);
    }
}
