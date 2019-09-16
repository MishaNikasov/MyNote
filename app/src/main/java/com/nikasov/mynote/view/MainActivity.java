package com.nikasov.mynote.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nikasov.mynote.R;
import com.nikasov.mynote.view.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpFragment();
    }

    private void setUpFragment() {
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, new MainFragment(), "new").commit();
    }
}
