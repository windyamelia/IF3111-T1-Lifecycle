package com.windyamelia.androidintent.androidintent;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;


public class ResultActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle1 = getIntent().getExtras();
        TextView textView1 = (TextView) findViewById(R.id.textview);

        textView1.setText(bundle1.getString("key"));
    }

    @Override
    public void finish() {
        Intent intent = new Intent();

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        intent.putExtra("key2", editText2.getText().toString());

        setResult(RESULT_OK, intent);

        super.finish();
    }

}
