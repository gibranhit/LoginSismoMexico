package garnachas.gibran.com.loginsismos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(ForgotPassword.this,MainActivity.class));
        finish();
    }
}
