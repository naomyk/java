package com.example.nameswap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.nameswap.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
            int age = 12;
            System.out.println(age);
        }
    }
}
