package com.nikasov.mynote.utils;

import android.util.Log;

public class LogMe {

    private static final String TAG = "Nikasov";

    public static void print(String message){
        Log.d(TAG, message);
    }
}
