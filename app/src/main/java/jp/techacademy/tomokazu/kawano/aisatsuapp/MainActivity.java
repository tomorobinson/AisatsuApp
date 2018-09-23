package jp.techacademy.tomokazu.kawano.aisatsuapp;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    
    TextView mtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimePickerDialog();
            }
        });

        mtextView = (TextView) findViewById(R.id.textView);
    }

    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                if (hourOfDay >= 2 && hourOfDay < 10) {
                        mtextView.setText("おはよう");
                } else if (hourOfDay >= 10 && hourOfDay < 18) {
                        mtextView.setText("こんにちは");
                } else if (hourOfDay >= 18 && hourOfDay <=23) {
                        mtextView.setText("こんばんは");
                } else if (hourOfDay >= 0 && hourOfDay < 2) {
                        mtextView.setText("こんばんは");
                }
            }
        },
                0, 0, true);
        timePickerDialog.show();
    }
}