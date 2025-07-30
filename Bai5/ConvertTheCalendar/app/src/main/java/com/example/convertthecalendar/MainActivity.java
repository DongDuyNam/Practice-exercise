package com.example.convertthecalendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.convertthecalendar.R;

public class MainActivity extends Activity {

    EditText editnamduonglich;
    TextView textView5;
    Button btnDoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editnamduonglich = findViewById(R.id.editnamduonglich);
        textView5 = findViewById(R.id.textView5);
        btnDoi = findViewById(R.id.button1);

        btnDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                String namDuongLichStr = editnamduonglich.getText().toString();

                if (namDuongLichStr.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập năm dương lịch.", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    int namDuongLich = Integer.parseInt(namDuongLichStr);
                    String can = "";
                    String chi = "";
                    switch (namDuongLich % 10) {
                        case 0:
                            can = "Canh";
                            break;
                        case 1:
                            can = "Tân";
                            break;
                        case 2:
                            can = "Nhâm";
                            break;
                        case 3:
                            can = "Quý";
                            break;
                        case 4:
                            can = "Giáp";
                            break;
                        case 5:
                            can = "Ất";
                            break;
                        case 6:
                            can = "Bính";
                            break;
                        case 7:
                            can = "Đinh";
                            break;
                        case 8:
                            can = "Mậu";
                            break;
                        case 9:
                            can = "Kỷ";
                            break;
                    }

                    // Tính Chi dựa vào Năm dương lịch % 12
                    switch (namDuongLich % 12) {
                        case 0:
                            chi = "Thân";
                            break;
                        case 1:
                            chi = "Dậu";
                            break;
                        case 2:
                            chi = "Tuất";
                            break;
                        case 3:
                            chi = "Hợi";
                            break;
                        case 4:
                            chi = "Tý";
                            break;
                        case 5:
                            chi = "Sửu";
                            break;
                        case 6:
                            chi = "Dần";
                            break;
                        case 7:
                            chi = "Mẹo";
                            break;
                        case 8:
                            chi = "Thìn";
                            break;
                        case 9:
                            chi = "Tỵ";
                            break;
                        case 10:
                            chi = "Ngọ";
                            break;
                        case 11:
                            chi = "Mùi";
                            break;
                    }
                    String namAmLich = can + " " + chi;

                    textView5.setText(namAmLich);

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Năm không hợp lệ. Vui lòng nhập số.", Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });
    }
}