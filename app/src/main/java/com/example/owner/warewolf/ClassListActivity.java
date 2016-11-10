package com.example.owner.warewolf;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

public class ClassListActivity extends Activity {

    Button bt_next_button3;
    ListView lv_class_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_list);

        getIntent();

        bt_next_button3 = (Button)findViewById(R.id.NextButton3);
        lv_class_list= (ListView)findViewById(R.id.ClassList);

    }
}
