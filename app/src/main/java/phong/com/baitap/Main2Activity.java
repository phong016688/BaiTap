package phong.com.baitap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         Intent intent = getIntent();
         TextView textView = findViewById(R.id.textviewabc);
         String a = intent.getStringExtra(Intent.EXTRA_COMPONENT_NAME);
         textView.setText(a);

    }
}
