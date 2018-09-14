package phong.com.baitap;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }
    public void init(){
        final EditText eda = findViewById(R.id.editText);
        final EditText edb = findViewById(R.id.editText2);
        final EditText edc = findViewById(R.id.editText3);
        final TextView textViewkq = findViewById(R.id.textView5);
        Button buttongiai = findViewById(R.id.button1);
        Button buttonxoa = findViewById(R.id.button2);

        buttongiai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eda.getText().toString().equals("") || edb.getText().toString().equals("") || edc.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "bạn nhập thiếu hệ số", Toast.LENGTH_SHORT).show();
                }
                else{
                    int a = Integer.parseInt(eda.getText().toString());
                    int b = Integer.parseInt(edb.getText().toString());
                    int c = Integer.parseInt(edc.getText().toString());
                    int w = b -c;
                    if(a== 0) {
                        if (w == 0)
                            textViewkq.setText("Phương trình có vô số nghiệm");
                        else
                            textViewkq.setText("phương trình vô nghiệm");
                    }else {
                        if(w!=0) textViewkq.setText("x = " + -w +"/" +a);
                        else textViewkq.setText("x = 0");  }
                }

            }
        });
        buttonxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eda.setText("");
                edb.setText("");
                edc.setText("");
                textViewkq.setText("");
            }
        });



    }

}
