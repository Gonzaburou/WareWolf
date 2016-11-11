package com.example.owner.warewolf;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import static android.R.attr.key;
import static android.R.attr.value;

public class MemberSettingActivity extends Activity {

    EditText et_input_name;
    Button bt_add;
    Button bt_next;
    ListView lv_member_list;
    SpannableStringBuilder sb_input_name;
    ArrayAdapter<String> aa_input_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_setting);

        getIntent();

        final Intent it_class_setting = new Intent(this, ClassSettingActivity.class);

        et_input_name = (EditText)findViewById(R.id.InputName);
        bt_next = (Button)findViewById(R.id.NextButton);
        bt_add = (Button)findViewById(R.id.AddButton);
        lv_member_list = (ListView)findViewById(R.id.MemberList);

        aa_input_name = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lv_member_list.setAdapter(aa_input_name);

        bt_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb_input_name = (SpannableStringBuilder)et_input_name.getText();
                et_input_name.setText("");
                if(sb_input_name.toString().isEmpty() == false){
                    aa_input_name.add(sb_input_name.toString());
                    lv_member_list.setAdapter(aa_input_name);

                    SharedPreferences pref = getSharedPreferences("pref",MODE_PRIVATE);
                    SharedPreferences.Editor e = pref.edit();
                    e.putString("key", sb_input_name.toString());
                    e.commit();
                }
            }
        });
        bt_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(it_class_setting);
            }
        });
    }
}
