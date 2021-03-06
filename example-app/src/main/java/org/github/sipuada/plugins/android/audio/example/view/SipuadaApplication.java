package org.github.sipuada.plugins.android.audio.example.view;

import android.content.Intent;

import com.joanzapata.iconify.Iconify;
import com.joanzapata.iconify.fonts.MaterialModule;

import org.github.sipuada.plugins.android.audio.example.presenter.SipuadaService;

public class SipuadaApplication extends com.activeandroid.app.Application {

    public static final String TAG = SipuadaApplication.class.toString();
    public static final String KEY_PREFIX = "com.github.sipuada.plugins.android.audio.example";
    public static final String KEY_CALL_ID = String.format("%s.%s",
            SipuadaApplication.KEY_PREFIX, "callId");
    public static final String KEY_CALL_ACTION = String.format("%s.%s",
            SipuadaApplication.KEY_PREFIX, "callAction");
    public static final String KEY_CALLS_INFO = String.format("%s.%s",
            SipuadaApplication.KEY_PREFIX, "callsInfo");
    public static final String KEY_USERNAME = String.format("%s.%s",
            SipuadaApplication.KEY_PREFIX, "username");
    public static final String KEY_PRIMARY_HOST = String.format("%s.%s",
            SipuadaApplication.KEY_PREFIX, "primaryHost");
    public static final String KEY_PASSWORD = String.format("%s.%s",
            SipuadaApplication.KEY_PREFIX, "password");
    public static final String KEY_REMOTE_USERNAME = String.format("%s.%s",
            SipuadaApplication.KEY_PREFIX, "remoteUsername");
    public static final String KEY_REMOTE_HOST = String.format("%s.%s",
            SipuadaApplication.KEY_PREFIX, "remoteHost");
    public static final String KEY_USER_CREDENTIALS = String.format("%s.%s",
            SipuadaApplication.KEY_PREFIX, "userCredentials");

    @Override
    public void onCreate() {
        super.onCreate();
        Iconify.with(new MaterialModule());
        Intent intent = new Intent(this, SipuadaService.class);
        startService(intent);
    }

}
