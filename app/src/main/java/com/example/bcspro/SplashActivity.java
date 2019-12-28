package com.example.bcspro;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    TextView iv,iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        iv=findViewById(R.id.bcs);

        iv1=findViewById(R.id.bcs1);




        Animation mine= AnimationUtils.loadAnimation(this,R.anim.animation);
        Animation min= AnimationUtils.loadAnimation(this,R.anim.ani);

        iv.startAnimation(mine);
        iv1.startAnimation(min);
        ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationY", -300f);
        ObjectAnimator ani = ObjectAnimator.ofFloat(iv1, "translationY", -300f);

        animation.setDuration(1000);
        animation.start();

        ani.setDuration(1000);
        ani.start();


        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(SplashActivity.this,FormPageActivity.class);


                startActivity(intent);
                finish();
            }
        },3500);

    }
}