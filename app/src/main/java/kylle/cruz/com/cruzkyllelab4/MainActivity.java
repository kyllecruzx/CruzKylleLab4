package kylle.cruz.com.cruzkyllelab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import kylle.cruz.com.cruzkyllelab4.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITG","OnCreate has executed....");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITG","OnStart has executed....");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITG","OnResume has executed....");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITG","OnRestart has executed....");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITG","OnStop has executed....");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITG","OnDestroy has executed....");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITG","OnPause has executed....");

    }

    public void nextButtonClick(View view){
        Snackbar.make(view, "Next button has been clicked...", Snackbar.LENGTH_SHORT).show();
    }

    public void backButtonClick(View view){
        Toast.makeText(this,"Back button has been clicked...",Toast.LENGTH_SHORT).show();

    }

}