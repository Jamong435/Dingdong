package com.example.dingdong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Sound
    SoundPool soundPool;	//작성
    int soundID;		//작성


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sound
        soundPool = new SoundPool(5,AudioManager.STREAM_MUSIC,0);	//작성
        soundID = soundPool.load(this,R.raw.wood,1);	//작성, (mp3 파일 이름이 click_sound이다.)

        //버튼 클릭시 효과음 실행
        Button button = (Button)findViewById(R.id.ButtonID)	;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(soundID,1f,1f,0,0,1f);	//작성
            }
        });
    }
}