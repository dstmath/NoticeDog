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

package io.bunnyblue.noticedog.app.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

import io.bunnyblue.noticedog.app.apps.App;
import io.bunnyblue.noticedog.app.apps.AppListener;
import io.bunnyblue.noticedog.app.apps.AppManager;
import io.bunnyblue.noticedog.app.inbox.InboxManager;
import io.bunnyblue.noticedog.app.inbox.RawMessage;
import io.bunnyblue.noticedog.app.nsprocess.NotificationService;
import io.bunnyblue.noticedog.app.oob.OOBManager;
import io.bunnyblue.noticedog.app.settings.Settings;
import io.bunnyblue.noticedog.app.settings.Settings.SettingChangeListener;

@Singleton
public class NotificationManager implements AppListener, SettingChangeListener {
    public static final String REGEX_FOR_URLS = "(?i)\\b((?:https?://|www\\d{0,3}[.]|[a-z0-9.\\-]+[.][a-z]{2,4}/)(?:[^\\s()<>]+|\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\))+(?:\\(([^\\s()<>]+|(\\([^\\s()<>]+\\)))*\\)|[^\\s`!()\\[\\]{};:'\".,<>???“”‘’]))";
    private static final long LONG_REMOVE_NOTIFICATION_DELAY = 3000;
    private static final long REMOVE_NOTIFICATION_DELAY = 800;
    private static final long SHORT_REMOVE_NOTIFICATION_DELAY = 500;
    private static final long SMS_REMOVE_NOTIFICATION_DELAY = 3000;
    private static final String TAG = "NotificationManager";

    @Inject
    AppManager appManager;
    @Inject
    Context context;
    boolean didNotificationServiceStart = false;
    @Inject
    InboxManager inboxManager;
    boolean keepNotificationsInDrawer;
    List<NotificationListener> listeners = new ArrayList();
    @Inject
    OOBManager oobManager;
    List<NotificationProcessor> processors;
    NotificationManagerReceiver receiver;
    @Inject
    Settings settings;

    @Inject
    private NotificationManager() {
    }

    @Inject
    private void start() {
        this.receiver = new NotificationManagerReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(NotificationService.INTENT_ACTION_EVENTS);
        this.context.registerReceiver(this.receiver, filter);
        this.keepNotificationsInDrawer = this.settings.getKeepNotificationsInDrawer();
        this.settings.registerSettingChangeListener(this);
        this.processors = this.appManager.getNotificationFilters();
        this.appManager.addListener(this);
        checkIfNotificationSerivceIsRunning();
    }

    public void stop() {
        this.context.unregisterReceiver(this.receiver);
    }

    public void addListener(NotificationListener listener) {
        this.listeners.add(listener);
    }

    public void removeListener(NotificationListener listener) {
        this.listeners.remove(listener);
    }

    public boolean didNotificationServiceStart() {
        return this.didNotificationServiceStart;
    }

    public void onAppLaunched(App app) {
    }

    public void onEnabledAppsChanged(List<App> list) {
        this.processors = this.appManager.getNotificationFilters();
    }

    public void onAppInstallsChanged() {
    }

    public void removeNotificationsForSMS(String smsPackage, String from, String address, String displayAddress, String body, long timestamp) {
        if (!this.keepNotificationsInDrawer) {
            final String str = smsPackage;
            final String str2 = from;
            final String str3 = address;
            final String str4 = displayAddress;
            final String str5 = body;
            final long j = timestamp;
            Handler handler = new Handler() {
                public void handleMessage(Message msg) {
                    Intent i = new Intent(NotificationService.INTENT_ACTION_CMDS);
                    i.putExtra("command", NotificationService.CMD_REMOVE_SMS);
                    i.putExtra(NotificationService.KEY_SMS_PACKAGE, str);
                    i.putExtra(NotificationService.KEY_SMS_FROM, str2);
                    i.putExtra(NotificationService.KEY_SMS_ADDRESS, str3);
                    i.putExtra(NotificationService.KEY_SMS_DISPLAY_ADDRESS, str4);
                    i.putExtra(NotificationService.KEY_SMS_BODY, str5);
                    i.putExtra(NotificationService.KEY_SMS_TIMESTAMP, j);
                    NotificationManager.this.context.sendBroadcast(i);
                }
            };
            handler.sendMessageDelayed(handler.obtainMessage(), 3000);
        }
    }

    boolean processIncomingNotification(Notification n) {
        for (NotificationProcessor processor : this.processors) {
            try {
                if (processor.shouldHandleNotification(n)) {
                    NotificationProcessorResult result = processor.processNotification(n);
                    RawMessage message = null;
                    if (result != null) {
                        message = result.getMessage();
                    }
                    if (message != null) {
                        boolean handled = result.shouldRemoveNotification();
                        this.inboxManager.saveMesssage(message);
                        return handled;
                    }
                } else {
                    continue;
                }
            } catch (Exception e) {
                Log.d(TAG, "Caught exception: " + Log.getStackTraceString(e));
            }
        }
        return false;
    }

    public void onSettingChanged(Settings settings, String key) {
        if (key.equals(Settings.KEY_NOTIFICATIONS_IN_DRAWER)) {
            this.keepNotificationsInDrawer = settings.getKeepNotificationsInDrawer();
        }
    }

    void checkIfNotificationSerivceIsRunning() {
        Intent i = new Intent(NotificationService.INTENT_ACTION_CMDS);
        i.putExtra("command", NotificationService.CMD_CHECK_SERVICE_RUNNING);
        this.context.sendBroadcast(i);
    }

    void removeNotification(Notification notification) {
        final String packageName = notification.getPackageName();
        final String tag = notification.getTag();
        final int id = notification.getId();
        final String key = notification.getKey();
        long delay = REMOVE_NOTIFICATION_DELAY;
        if (VERSION.SDK_INT >= 21 && notification.getPriority() >= 1) {
            delay = SHORT_REMOVE_NOTIFICATION_DELAY;
        }
        Handler handler = new Handler() {
            public void handleMessage(Message msg) {
                Intent i = new Intent(NotificationService.INTENT_ACTION_CMDS);
                i.putExtra("command", NotificationService.CMD_REMOVE);
                i.putExtra(NotificationService.KEY_NOTIFICATION_PACKAGE, packageName);
                i.putExtra(NotificationService.KEY_NOTIFICATION_TAG, tag);
                i.putExtra(NotificationService.KEY_NOTIFICATION_ID, id);
                i.putExtra(NotificationService.KEY_NOTIFICATION_KEY, key);
                NotificationManager.this.context.sendBroadcast(i);
            }
        };
        handler.sendMessageDelayed(handler.obtainMessage(), delay);
    }

    void onNotificationPosted(Notification notification) {
        Log.d(TAG, "Notification posted: [" + notification.getPackageName() + "] " + notification.getContentTitle());
        notification.logNotification();
        if (this.oobManager.isOOBComplete()) {
            for (NotificationListener listener : this.listeners) {
                listener.onNotificationPosted(notification);
            }
            if (processIncomingNotification(notification) && !this.keepNotificationsInDrawer) {
                removeNotification(notification);
            }
        }
    }

    void onNotificationServiceRunning() {
        this.didNotificationServiceStart = true;
        for (NotificationListener listener : this.listeners) {
            listener.onNotificationServiceRunning();
        }
    }

    class NotificationManagerReceiver extends BroadcastReceiver {
        NotificationManagerReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            String type = intent.getStringExtra("event");
            if (type.equals(NotificationService.EVENT_POSTED)) {
                NotificationManager.this.onNotificationPosted((Notification) intent.getParcelableExtra(NotificationService.KEY_NOTIFICATION));
            } else if (type.equals(NotificationService.EVENT_SERVICE_RUNNING)) {
                NotificationManager.this.onNotificationServiceRunning();
            }
        }
    }
}
