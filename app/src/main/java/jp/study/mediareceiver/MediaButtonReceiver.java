package jp.study.mediareceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.widget.Toast;

/**
 * Created by kenz on 2015/09/03.
 */
public class MediaButtonReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getExtras().get(Intent.EXTRA_KEY_EVENT);
        Toast.makeText(context, keyEvent.toString(),Toast.LENGTH_SHORT).show();

    }

}
