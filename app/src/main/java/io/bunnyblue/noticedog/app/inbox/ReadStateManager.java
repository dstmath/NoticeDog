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

package io.bunnyblue.noticedog.app.inbox;

import android.content.Context;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.bunnyblue.noticedog.app.apps.App;
import io.bunnyblue.noticedog.app.apps.AppListener;
import io.bunnyblue.noticedog.app.apps.AppManager;
import io.bunnyblue.noticedog.app.core.ListenerHandler;
import io.bunnyblue.noticedog.app.core.ListenerSource;
import io.bunnyblue.noticedog.app.inbox.ui.InboxViewListener;
import io.bunnyblue.noticedog.app.inbox.ui.InboxViewManager;
import io.bunnyblue.noticedog.app.lockscreen.LockScreenListener;
import io.bunnyblue.noticedog.app.lockscreen.LockScreenManager;

@Singleton
public class ReadStateManager implements AppListener, InboxViewListener, LockScreenListener, InboxListener, ListenerSource<ReadStateListener> {
    private static final String TAG = "ReadStateManager";
    @Inject
    AppManager appManager;
    @Inject
    Context context;
    @Inject
    InboxManager inboxManager;
    @Inject
    InboxViewManager inboxViewManager;
    ListenerHandler<ReadStateListener> listenerHandler = new ListenerHandler();
    @Inject
    LockScreenManager lockScreenManager;
    Map<String, Integer> unreadCountByApp = new HashMap();

    @Inject
    private ReadStateManager() {
    }

    @Inject
    private void start() {
        this.appManager.addListener(this);
        this.inboxViewManager.addListener(this);
        this.lockScreenManager.addListener(this);
        this.inboxManager.addListener(this);
    }

    public void stop() {
        this.lockScreenManager.removeListener(this);
        this.inboxViewManager.removeListener(this);
        this.appManager.removeListener(this);
        this.inboxManager.removeListener(this);
        this.listenerHandler.clearAll();
    }

    public void onAppLaunched(App app) {
        this.inboxManager.markAppAsRead(app.getAppId());
        clearAppCount(app.getAppId());
    }

    public void onEnabledAppsChanged(List<App> list) {
    }

    public void onAppInstallsChanged() {
    }

    public void onInboxOpened(InboxViewManager manager) {
        clearAllAppCounts();
    }

    public void onInboxClosed(InboxViewManager manager) {
        if (!this.lockScreenManager.isPhoneLocked() && !this.lockScreenManager.isScreenOff()) {
            for (App app : this.appManager.getCurrentRunningApps()) {
                this.inboxManager.markAppAsRead(app.getAppId());
                clearAppCount(app.getAppId());
            }
        }
    }

    public void onLockScreenStarted(LockScreenManager manager) {
    }

    public void onLockScreenStopped(LockScreenManager manager) {
        if (!this.inboxViewManager.isInboxViewOpen()) {
            for (App app : this.appManager.getCurrentRunningApps()) {
                this.inboxManager.markAppAsRead(app.getAppId());
                clearAppCount(app.getAppId());
            }
        }
    }

    public void onPhoneCall(LockScreenManager manager) {
    }

    public void onPhoneCallEnded(LockScreenManager manager) {
    }

    public void onInboxUpdated() {
    }

    public void onInboxMessageAdded(Message message) {
        if (!this.inboxViewManager.isInboxViewOpen()) {
            incrementAppCount(message.appId);
        }
    }

    public void onInboxCleared() {
    }

    private void incrementAppCount(String appId) {
        if (!this.unreadCountByApp.containsKey(appId)) {
            this.unreadCountByApp.put(appId, Integer.valueOf(1));
        }
        this.unreadCountByApp.put(appId, Integer.valueOf(((Integer) this.unreadCountByApp.get(appId)).intValue() + 1));
        fireOnNewMessagesWaiting();
    }

    private void clearAppCount(String appId) {
        this.unreadCountByApp.remove(appId);
        if (this.unreadCountByApp.size() == 0) {
            fireOnClearMessagesWaiting();
        }
    }

    private void clearAllAppCounts() {
        this.unreadCountByApp.clear();
        fireOnClearMessagesWaiting();
    }

    public void addListener(Object handle, ReadStateListener listener) {
        this.listenerHandler.addListener(handle, listener);
    }

    public void addListener(ReadStateListener listener) {
        this.listenerHandler.addListener(listener);
    }

    public void removeListener(Object handle) {
        this.listenerHandler.removeListener(handle);
    }

    private void fireOnNewMessagesWaiting() {
        Iterator i$ = this.listenerHandler.iterator();
        while (i$.hasNext()) {
            ((ReadStateListener) i$.next()).onNewMessagesWaiting();
        }
    }

    private void fireOnClearMessagesWaiting() {
        this.unreadCountByApp.clear();
        Iterator i$ = this.listenerHandler.iterator();
        while (i$.hasNext()) {
            ((ReadStateListener) i$.next()).onClearMessagesWaiting();
        }
    }
}
