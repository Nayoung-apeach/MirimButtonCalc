package kr.hs.emirim.s2019w04.mirimbuttoncalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] btnId = {R.id.btn_0,R.id.btn_1,R.id.btn_2,R.id.btn_3,R.id.btn_4,
            R.id.btn_5,R.id.btn_6,R.id.btn_7,R.id.btn_8,R.id.btn_9};
    Button[] btnN = new Button[btnId.length];
    String num1, num2;
    EditText edit1, edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        for (int i=0; i<btnN.length; i++){
            btnN[i] = findViewById(btnId[i]);
            btnN[i].setOnClickListener(btnNListener);
        }
    }
    View.OnClickListener btnNListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            if(edit1.isFocused() == true){
                num1 = edit1.getText().toString() + btn.getText().toString();
                edit1.setText(num1);
            }else if(edit2.isFocused() == true){
                num2 = edit2.getText().toString() + btn.getText().toString();
                edit2.setText(num2);
            }else{
                Toast.makeText(getApplicationContext(), "EditText를 선택해주세요.", Toast.LENGTH_SHORT).show();;
            }
        }
    };
}