package com.example.sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements SoundPool.OnLoadCompleteListener {

    SoundPool mSoundPool;
    int mClapSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(2, AudioManager.STREAM_MUSIC,0);
        mSoundPool.setOnLoadCompleteListener(this);

        mClapSound = mSoundPool.load(this, R.raw.pop, 1);
    }

    public void onClick(View view) {
        mSoundPool.play(mClapSound, 1, 1, 0, 0, 1);
    }

    @Override
    public void onLoadComplete(SoundPool soundPool, int i, int i1) {

    }
}