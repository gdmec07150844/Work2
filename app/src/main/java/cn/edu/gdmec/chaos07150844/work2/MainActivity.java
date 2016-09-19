package cn.edu.gdmec.chaos07150844.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Work2","启动了");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Work2","停止了");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Work2","销毁了");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Work2","重来了");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Work2","暂停了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Work2","恢复了");
    }
}
