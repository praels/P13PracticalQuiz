package sg.edu.rp.c346.p13practicalquiz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.widget.Toast;

/**
 * Created by 16020552 on 14/8/2018.
 */

public class WallpaperReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        int selectionid = preferences.getInt("selectionid",R.id.radioButton1);
        if(selectionid == R.id.radioButton1){
            Toast toast1 = Toast.makeText(context,R.string.selection1,Toast.LENGTH_LONG);
            toast1.show();
        }
        else{
            Toast toast2 = Toast.makeText(context,R.string.selection2,Toast.LENGTH_LONG);
            toast2.show();
        }
    }
}