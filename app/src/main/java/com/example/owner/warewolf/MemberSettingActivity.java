package com.example.owner.warewolf;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MemberSettingActivity extends Activity {

    EditText inputname;
    Button addbutton;
    Button nextbutton;
    ListView MemberList;
    SpannableStringBuilder sb;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_setting);

        getIntent();

        final Intent class_setting = new Intent(this, ClassSettingActivity.class);

        inputname = (EditText)findViewById(R.id.InputName);
        nextbutton = (Button)findViewById(R.id.NextButton);
        addbutton = (Button)findViewById(R.id.AddButton);
        MemberList = (ListView)findViewById(R.id.MemberList);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        MemberList.setAdapter(adapter);

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sb = (SpannableStringBuilder)inputname.getText();
                inputname.setText("");
                if(sb.toString().isEmpty() == false) {
                    adapter.add(sb.toString());
                    MemberList.setAdapter(adapter);
                }
            }
        });
        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(class_setting);
            }
        });
    }
}
