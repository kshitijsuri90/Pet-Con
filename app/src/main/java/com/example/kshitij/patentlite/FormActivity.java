package com.example.kshitij.patentlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Objects;

public class FormActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button submit;
    private EditText Source;
    private EditText Destination;
    private int distance;
    private int score ;
    private int footprint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        score = Objects.requireNonNull(getIntent().getExtras()).getInt("score");
        footprint = getIntent().getExtras().getInt("footprint");
        final HashMap<String, Integer> map = new HashMap<>();
        map.put("SuratDelhi",1163);
        map.put("DelhiSurat",1163);
        map.put("MumbaiSurat",280);
        map.put("SuratMumbai",280);
        map.put("AhemdabadSurat",262);
        map.put("SuratAhemdabad",262);
        map.put("DelhiMumbai",1427);
        map.put("MumbaiDelhi",1427);
        map.put("DelhiAhemdabad",945);
        map.put("AhemdabadDelhi",945);
        map.put("MumbaiAhemdabad",531);
        map.put("AhemdabadMumbai",531);
        setTitle("Transport Activity");
        submit = findViewById(R.id.submit);
        Source = findViewById(R.id.source);
        Destination = findViewById(R.id.destination);
        radioGroup = findViewById(R.id.groupradio);
        radioGroup.clearCheck();
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String source = Source.getText().toString();
                String destination = Destination.getText().toString();
                StringBuilder builder = new StringBuilder(source+destination);
                distance = map.get(builder.toString());
                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(FormActivity.this,
                            "No answer has been selected",
                            Toast.LENGTH_SHORT)
                            .show();
                }
                else {
                    RadioButton radioButton = radioGroup.findViewById(selectedId);
                    String val = radioButton.getText().toString();
                    FootPrintAlgorithm algorithm = new FootPrintAlgorithm(distance,val);
                    int ans = algorithm.calculateFootPrint();
                    score = Math.max(0,Math.min(600,algorithm.setScore(score)));
                    Toast.makeText(FormActivity.this,"Carbon emission "+ ans +" and score is " + score,Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(FormActivity.this,NavigationActivity.class);
                    intent.putExtra("score",score);
                    intent.putExtra("footprint",ans+footprint);
                    startActivity(intent);
                }
            }
        });
    }
}
