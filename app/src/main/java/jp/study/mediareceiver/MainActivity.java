package jp.study.mediareceiver;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private AudioManager mAudioManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
        mAudioManager.registerMediaButtonEventReceiver(new ComponentName(getPackageName(), MediaButtonReceiver.class.getCanonicalName()));
    }

    @Override
    protected void onStop() {
        super.onStop();
        mAudioManager.unregisterMediaButtonEventReceiver(new ComponentName(getPackageName(), MediaButtonReceiver.class.getCanonicalName()));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
