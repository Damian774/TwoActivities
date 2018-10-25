package two.android.com.two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = MainActivity.EXTRA_MESSAGE;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = findViewById(R.id.EditText_reply_field);
    }

    public void LaunchSecondActivity(View view) {
        Log.d(LOG_TAG,"kliknieto przycisk");
        Intent intent = new Intent(this,SecondActivity.class);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }

    public void LaunchThirdActivity(View view) {
        Intent intent = new Intent(this,Activity_third.class);
        startActivity(intent);
    }
}
