package garnachas.gibran.com.loginsismos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SingUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(SingUp.this,MainActivity.class));
        finish();
    }
}
