package garnachas.gibran.com.loginsismos;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SingInFragment.OnFragmentInteractionListener,
        SingUpFragment.OnFragmentInteractionListener,ForgotPasswordFragment.OnFragmentInteractionListener{

    SingInFragment singInFragment;
    SingUpFragment singUpFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singInFragment = new SingInFragment();
        singUpFragment = new SingUpFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.contenedor,singInFragment).commit();

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_out_left,
                R.anim.slide_out_right, R.anim.slide_in_right);

        transaction.replace(R.id. contenedor, singInFragment );
        transaction.addToBackStack(null);
        transaction.show(singInFragment);
        transaction.commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
