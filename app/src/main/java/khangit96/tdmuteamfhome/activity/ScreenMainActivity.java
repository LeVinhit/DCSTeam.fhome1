package khangit96.tdmuteamfhome.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import khangit96.tdmuteamfhome.R;
import khangit96.tdmuteamfhome.ui.activities.ChatActivity;
import khangit96.tdmuteamfhome.ui.activities.LoginActivity;
import khangit96.tdmuteamfhome.ui.activities.SplashActivity;

public class ScreenMainActivity extends AppCompatActivity {

    Button btnSearchHouse, btnSocialInsurance, btnLegalAdvice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_main);

        btnSearchHouse = (Button) findViewById(R.id.btnSearchHouse);
        btnSocialInsurance = (Button) findViewById(R.id.btnSocialInsurance);
        btnLegalAdvice = (Button) findViewById(R.id.btnLegalAdvice);

        btnSearchHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenMainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnSocialInsurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenMainActivity.this, SocialInsuranceActivity.class);
                startActivity(intent);
            }
        });

        btnLegalAdvice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenMainActivity.this, SplashActivity.class);
                startActivity(intent);
            }
        });
    }
}
