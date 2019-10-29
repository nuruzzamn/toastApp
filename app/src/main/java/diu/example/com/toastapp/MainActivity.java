package diu.example.com.toastapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // also supports Toast.LENGTH_LONG
       // Toast.makeText(getApplicationContext(), "toast message show", Toast.LENGTH_SHORT).show();

        Toast toast = Toast.makeText(getApplicationContext(), "toast message show", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }
}
