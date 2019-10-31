package HELPER;

import android.preference.PreferenceManager;
import android.support.constraint.solver.widgets.Helper;

public class SharedPreferences {

    static final String KEY_USER_TEREGISTER ="user", KEY_PASS_TEREGISTER ="pass";
    static final String KEY_USERNAME_SEDANG_LOGIN = "Username_logged_in";
    static final String KEY_STATUS_SEDANG_LOGIN = "Status_logged_in";

    private static SharedPreferences getSharedPreference(Context context){
        return (SharedPreferences) PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setKeyUserTeregister(Context context, String username);{
        SharedPreferences.
    }
}

    private static class Context extends android.content.Context {
    }

