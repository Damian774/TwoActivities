package two.android.com.two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_third extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);



    }


    public void GetWeight(View view) {
        EditText editTextWeight = findViewById(R.id.editText_weight);
        String weightStr = editTextWeight.getText().toString();
        double weight = Double.parseDouble(weightStr);

        double weightOnMoon = weight/3.0;
        String weightOnMoonStr = Double.toString(weightOnMoon);
        TextView textViewWeightOnMoon = findViewById(R.id.textView_weightOnMoon);
        textViewWeightOnMoon.setText(weightOnMoonStr);
    }
}
