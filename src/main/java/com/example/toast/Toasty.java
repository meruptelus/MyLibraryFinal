package com.example.toast;

import android.content.Context;
import android.widget.Toast;

public class Toasty {

    public static void simpleToast(Context context, String msg) {
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
