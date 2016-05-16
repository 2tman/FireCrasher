package com.osama.firecrasher;

import android.app.Activity;

/**
 * Created by Osama Raddad.
 */
public abstract class CrashListener {
    public abstract void onCrash(Throwable throwable, Activity activity);

    public void recover(Activity activity) {
        FireCrasher.recover(activity);
    }


}
