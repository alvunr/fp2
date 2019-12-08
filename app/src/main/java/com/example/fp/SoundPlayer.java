package com.example.fp;
import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
//import android.provider.MediaStore;


public class SoundPlayer {
    private static SoundPool soundPool;
    private static int rightSound;
    private static int wrongSound;

    public SoundPlayer(Context context) {
        soundPool = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        wrongSound = soundPool.load(context, R.raw.ycndi2, 1);
        rightSound = soundPool.load(context, R.raw.nw, 1);
    }

    public void playWrongSound() {
        soundPool.play(wrongSound, 1.0f, 1.0f, 1,0, 1.0f);
    }
    public void playRightSound() {
        soundPool.play(rightSound, 1.0f, 1.0f, 1,0, 1.0f);
    }
}
