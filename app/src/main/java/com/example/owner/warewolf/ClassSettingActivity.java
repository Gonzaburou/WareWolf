package com.example.owner.warewolf;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class ClassSettingActivity extends Activity {

    TextView tv_members_number,
            tv_villager_number,
            tv_fortune_teller_number,
            tv_necromancer_number,
            tv_knight_number,
            tv_sharer_number,
            tv_ware_wolf_number,
            tv_madman_number,
            tv_mystery_fox_number;
    SeekBar sb_villager_number,
            sb_fortune_teller_number,
            sb_necromancer_number,
            sb_knight_number,
            sb_sharer_number,
            sb_ware_wolf_number,
            sb_madman_number,
            sb_mystery_fox_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_setting);

        getIntent();

        tv_members_number = (TextView)findViewById(R.id.MembersNumber);
        tv_villager_number = (TextView)findViewById(R.id.VillagerNumber);
        tv_fortune_teller_number = (TextView)findViewById(R.id.FortuneTellerNumber);
        tv_necromancer_number = (TextView)findViewById(R.id.NecromancerNumber);
        tv_knight_number = (TextView)findViewById(R.id.KnightNumber);
        tv_sharer_number = (TextView)findViewById(R.id.SharerNumber);
        tv_ware_wolf_number = (TextView)findViewById(R.id.WareWolfNumber);
        tv_madman_number = (TextView)findViewById(R.id.MadmanNumber);
        tv_mystery_fox_number = (TextView)findViewById(R.id.MysteryFoxNumber);

        sb_villager_number = (SeekBar)findViewById(R.id.VillagerSeekBar);
        sb_fortune_teller_number = (SeekBar)findViewById(R.id.FortuneTellerSeekBar);
        sb_necromancer_number = (SeekBar)findViewById(R.id.NecromancerSeekBar);
        sb_knight_number = (SeekBar)findViewById(R.id.KnightSeekBar);
        sb_sharer_number = (SeekBar)findViewById(R.id.SharerSeekBar);
        sb_ware_wolf_number = (SeekBar)findViewById(R.id.WareWolfSeekBar);
        sb_madman_number = (SeekBar)findViewById(R.id.MadmanSeekBar);
        sb_mystery_fox_number = (SeekBar)findViewById(R.id.MysteryFoxSeekBar);

    }
}
