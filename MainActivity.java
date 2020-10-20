package id.ac.id.telkomuniversity.tass.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button buttonlogin, buttonforget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonlogin = findViewById(R.id.buttonlogin);
        buttonforget = findViewById(R.id.buttonforget);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

    }
        public void login(View view){
            Intent intent= new Intent(MainActivity.this, MainActivityTwo.class);
            Bundle b = new Bundle();

            b.putString("username",username.getText().toString());
            b.putString("password",password.getText().toString());

            intent.putExtras(b);
            startActivity(intent);
        }
        public void lupaPassword(View view){
            Intent intent = new Intent(MainActivity.this, MainActivityThree.class);
            Bundle b = new Bundle();

            b.putString("username",username.getText().toString());
            b.putString("password",password.getText().toString());

            intent.putExtras(b);
            startActivity(intent);
    }
}