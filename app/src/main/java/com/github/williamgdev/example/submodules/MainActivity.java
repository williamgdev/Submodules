package com.github.williamgdev.example.submodules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.williamgdev.example.submodules.restapi.RestAPI;
import com.github.williamgdev.example.submodules.restapi.RestAPIListener;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Submodules ->";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestAPI.getValue(new RestAPIListener<Integer>() {
            @Override
            public void onResult(Integer result) {

                Log.d(TAG, "onCreate: RestCall value = " + result);
            }
        });
    }
}
