package alisha.digipodium.intent_explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnContinue = findViewById(R.id.btnContinue);
    }
    public void goToNextScreen(View v){
//        String Continue = btnContinue.getText().toString();
        Intent i = new Intent(this,RegisterActivity.class);
        startActivity(i);
    }


}
