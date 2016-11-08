package com.example.owner.warewolf;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView tv_ware_wolf;
    Button bt_game_start;
    Button bt_settings;
    Button bt_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_ware_wolf = (TextView)findViewById(R.id.WareWolfTitle);
        tv_ware_wolf.setTextColor(Color.RED);

        final Intent it_member_settings = new Intent(this, MemberSettingActivity.class);

        bt_game_start = (Button)findViewById(R.id.gamestartbutton);
        bt_game_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(it_member_settings);
            }
        });
    }
}
