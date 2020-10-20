package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityThree extends AppCompatActivity {

    EditText passlama, passbaru;
    Button buttonpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);

        passlama =findViewById(R.id.passlama);
        passbaru = findViewById(R.id.passbaru);
        buttonpass = findViewById(R.id.buttonpass);

        buttonpass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivityThree.this, "Password Berhasil Diubah!", Toast.LENGTH_LONG).show();
            }
        });
    }
}