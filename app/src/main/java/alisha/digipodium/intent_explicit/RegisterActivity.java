package alisha.digipodium.intent_explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    private EditText editPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editPhone = findViewById(R.id.editPhone);
    }
    public void sendNumberToNextScreen(View v){
        String phone = editPhone.getText().toString();
        Intent in = new Intent(this,HomeActivity.class);
        in.putExtra("phone",phone);
        startActivity(in);
    }
}
