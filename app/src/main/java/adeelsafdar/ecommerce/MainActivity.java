package adeelsafdar.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mJoinNowButton, mLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mJoinNowButton = (Button) findViewById(R.id.main_join_now_btn);
        mLoginButton = (Button) findViewById(R.id.main_login_btn);


    }
}
