package com.example.project_cal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText inputa,inputb,ketqua;
    Button btncong, btntru, btntich, btnthuong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        inputa = findViewById(R.id.inputa);
        inputb = findViewById(R.id.inputb);
        ketqua = findViewById(R.id.ketqua);
        btncong = findViewById(R.id.btnTong);
        btntru = findViewById(R.id.btnHieu);
        btntich = findViewById(R.id.btnTich);
        btnthuong = findViewById(R.id.btnThuong);
        btncong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0" + inputa.getText());
                int b = Integer.parseInt("0" + inputb.getText());
                ketqua.setText("a + b =" + (a+b));
            }
        });
        btntru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0" + inputa.getText());
                int b = Integer.parseInt("0" + inputb.getText());
                ketqua.setText("a - b =" + (a-b));
            }
        });
        btntich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0" + inputa.getText());
                int b = Integer.parseInt("0" + inputb.getText());
                ketqua.setText("a * b =" + (a*b));
            }
        });
        btnthuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt("0" + inputa.getText());
                int b = Integer.parseInt("0" + inputb.getText());
                if(b==0){
                    ketqua.setText("B phải khác 0");
                }
                else
                    ketqua .setText("a / b ="+ (a/b));
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}