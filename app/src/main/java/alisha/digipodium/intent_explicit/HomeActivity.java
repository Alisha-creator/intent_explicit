package alisha.digipodium.intent_explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {
    private TextView txtphn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        txtphn =findViewById(R.id.txtPhn);
        updateUI();
    }
    public void updateUI(){
        if(getIntent().getExtras()!=null){
            String phone = getIntent().getStringExtra("phone");
            txtphn.setText(phone);
        }
    }
}
