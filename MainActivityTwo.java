package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivityTwo extends AppCompatActivity {

    TextView textView1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

        Bundle b = getIntent().getExtras();
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        textView1.setText(b.getCharSequence("username"));
        textView2.setText(b.getCharSequence("password"));

    }
}