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

package io.bunnyblue.noticedog.app.lockscreen;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import io.bunnyblue.noticedog.app.apps.App;
import io.bunnyblue.noticedog.app.inbox.InboxManager;
import io.bunnyblue.noticedog.app.inbox.Message;
import io.bunnyblue.noticedog.app.lockscreen.ui.LockScreenWidget;
import io.bunnyblue.noticedog.app.lockscreen.ui.LockScreenWidget.LockscreenWidgetListener;
import io.bunnyblue.noticedog.app.settings.Settings;

@Singleton
public class LockScreenManager implements Settings.SettingChangeListener {
    private static final int IS_LOCKED_CHECK_DELAY = 2000;
    private static final String TAG = "LockScreenManager";
    private static final int UNLOCK_CHECK_TIMER_INTERVAL = 1000;
    @Inject
    Context context;
    @Inject
    InboxManager inboxManager;
    boolean isOnPhoneCall;
    boolean isPhoneLocked;
    List<LockScreenListener> listeners;
    LockScreenWidget lockscreenWidget;
    int messageIdSinceLastScreenOff;
    LockScreenReceiver receiver;

    @Inject
    Settings settings;
    Timer unlockCheckTimer;

    @Inject
    private LockScreenManager() {
    }

    @Inject
    private void start() {
        this.listeners = new ArrayList();
        this.isPhoneLocked = false;
        this.isOnPhoneCall = false;
        IntentFilter filter = new IntentFilter("android.intent.action.SCREEN_ON");
        filter.addAction("android.intent.action.SCREEN_OFF");
        filter.addAction("android.intent.action.USER_PRESENT");
        this.receiver = new LockScreenReceiver();
        this.context.registerReceiver(this.receiver, filter);
        ((TelephonyManager) this.context.getSystemService(Context.TELEPHONY_SERVICE)).listen(new LockScreenPhoneStateListener(), 32);
        this.lockscreenWidget = null;
        this.messageIdSinceLastScreenOff = this.inboxManager.getLatestMessageId();

        this.settings.registerSettingChangeListener(this);
        performIsLockedCheck();
    }

    public void stop() {
        this.settings.unregisterSettingChangeListener(this);

        this.context.unregisterReceiver(this.receiver);
    }

    public void addListener(LockScreenListener listener) {
        this.listeners.add(listener);
    }

    public void removeListener(LockScreenListener listener) {
        this.listeners.remove(listener);
    }

    public void onSettingChanged(Settings settings, String key) {
        if (key.equals(Settings.KEY_ENABLE_LOCK_SCREEN) && !isLockScreenNotificationEnabled()) {
            hideWidget();
        }
    }

    public boolean isPhoneLocked() {
        return this.isPhoneLocked;
    }

    public boolean isScreenOff() {
        return !((PowerManager) this.context.getSystemService(Context.POWER_SERVICE)).isScreenOn();
    }

    public boolean isOnPhoneCall() {
        TelephonyManager telephonyManager = (TelephonyManager) this.context.getSystemService(Context.TELEPHONY_SERVICE);
        Log.d(TAG, "isOnPhoneCall: call state = " + telephonyManager.getCallState());
        return telephonyManager.getCallState() != 0;
    }

    public void unlockAndLaunchApp(App app) {
        if (isKeyguardUp() && isKeyguardSecure() && this.lockscreenWidget != null) {
            this.lockscreenWidget.showUnlockToContinue();
        }
        KeyguardDismissActivity.launchApp(this.context, app);
    }

    public void unlockAndLaunchApp(Message message) {
        if (isKeyguardUp() && isKeyguardSecure() && this.lockscreenWidget != null) {
            this.lockscreenWidget.showUnlockToContinue();
        }
        KeyguardDismissActivity.launchAppForMessage(this.context, message);
    }

    public void unlockAndLaunchInbox() {
        if (isKeyguardUp() && isKeyguardSecure() && this.lockscreenWidget != null) {
            this.lockscreenWidget.showUnlockToContinue();
        }
        KeyguardDismissActivity.launchInbox(this.context);
    }

    public boolean isLockScreenNotificationEnabled() {
        return this.settings.getEnableLockScreen();
    }

    void showWidget() {
        hideWidget();
        if (isLockScreenNotificationEnabled() && !isOnPhoneCall()) {
            this.lockscreenWidget = new LockScreenWidget();
            this.lockscreenWidget.start(this.messageIdSinceLastScreenOff, new LockscreenWidgetListener() {
                public void onWidgetCleared() {
                    LockScreenManager.this.messageIdSinceLastScreenOff = LockScreenManager.this.inboxManager.getLatestMessageId();
                    if (LockScreenManager.this.lockscreenWidget != null) {
                        LockScreenManager.this.lockscreenWidget.setShowSinceLastMessageId(LockScreenManager.this.messageIdSinceLastScreenOff);
                    }
                }
            });
        }
    }

    void hideWidget() {
        if (this.lockscreenWidget != null) {
            this.lockscreenWidget.stop();
            this.lockscreenWidget = null;
        }
    }

    void onScreenOff() {
        this.messageIdSinceLastScreenOff = this.inboxManager.getLatestMessageId();
        stopUnlockCheck();
        if (this.lockscreenWidget != null) {
            this.lockscreenWidget.hideUnlockToContinue();
        }
        performIsLockedCheck();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                LockScreenManager.this.performIsLockedCheck();
            }
        }, 2000);
    }

    void onScreenOn() {
        performIsLockedCheck();
        if (isPhoneLocked()) {
            startUnlockCheck();
        }
    }

    void performIsLockedCheck() {
        if (isKeyguardUp() && !isPhoneLocked()) {
            onPhoneLocked();
        }
    }

    void onUserPresent() {
        if (isPhoneLocked()) {
            onPhoneUnlocked();
        }
        stopUnlockCheck();
    }

    void onPhoneLocked() {
        boolean wasPhoneLocked = this.isPhoneLocked;
        this.isPhoneLocked = true;
        if (!isScreenOff()) {
            startUnlockCheck();
        }
        showWidget();
        if (!wasPhoneLocked) {
            for (LockScreenListener listener : this.listeners) {
                listener.onLockScreenStarted(this);
            }
        }
    }

    void onPhoneUnlocked() {
        boolean wasPhoneLocked = this.isPhoneLocked;
        this.isPhoneLocked = false;
        hideWidget();
        if (wasPhoneLocked) {
            for (LockScreenListener listener : this.listeners) {
                listener.onLockScreenStopped(this);
            }
        }
    }

    void onPhoneCall() {
        if (!this.isOnPhoneCall) {
            if (isPhoneLocked()) {
                hideWidget();
            }
            this.isOnPhoneCall = true;
            for (LockScreenListener listener : this.listeners) {
                listener.onPhoneCall(this);
            }
        }
    }

    void onPhoneCallEnded() {
        if (this.isOnPhoneCall) {
            for (LockScreenListener listener : this.listeners) {
                listener.onPhoneCallEnded(this);
            }
            this.isOnPhoneCall = false;
            if (isPhoneLocked()) {
                showWidget();
            }
        }
    }

    void startUnlockCheck() {
        if (this.unlockCheckTimer == null && isPhoneLocked() && !isScreenOff()) {
            this.unlockCheckTimer = new Timer();
            final Handler unlockCheckHandler = new Handler() {
                public void handleMessage(android.os.Message msg) {
                    if (!LockScreenManager.this.isKeyguardUp()) {
                        LockScreenManager.this.stopUnlockCheck();
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                LockScreenManager.this.onPhoneUnlocked();
                            }
                        });
                    }
                }
            };
            this.unlockCheckTimer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    unlockCheckHandler.obtainMessage().sendToTarget();
                }
            }, 1000, 1000);
        }
    }

    void stopUnlockCheck() {
        if (this.unlockCheckTimer != null) {
            this.unlockCheckTimer.cancel();
            this.unlockCheckTimer = null;
        }
    }

    public boolean isKeyguardUp() {
        KeyguardManager km = (KeyguardManager) this.context.getSystemService(Context.KEYGUARD_SERVICE);
        return km.inKeyguardRestrictedInputMode() || km.isKeyguardLocked();
    }

    public boolean isKeyguardSecure() {
        return ((KeyguardManager) this.context.getSystemService(Context.KEYGUARD_SERVICE)).isKeyguardSecure();
    }

    class LockScreenPhoneStateListener extends PhoneStateListener {
        LockScreenPhoneStateListener() {
        }

        public void onCallStateChanged(int state, String incomingNumber) {
            super.onCallStateChanged(state, incomingNumber);
            switch (state) {
                case 0:
                    Log.d(LockScreenManager.TAG, "LockState Phone idle");
                    LockScreenManager.this.onPhoneCallEnded();
                    return;
                default:
                    Log.d(LockScreenManager.TAG, "LockState Phone not idle");
                    LockScreenManager.this.onPhoneCall();
                    return;
            }
        }
    }

    public class LockScreenReceiver extends BroadcastReceiver {
        private static final String TAG = "LockScreenReceiver";

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
                LockScreenManager.this.onScreenOff();
            } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                LockScreenManager.this.onScreenOn();
            } else if (intent.getAction().equals("android.intent.action.USER_PRESENT")) {
                LockScreenManager.this.onUserPresent();
            }
        }
    }
}
