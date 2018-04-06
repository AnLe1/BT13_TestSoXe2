package com.lecongan.bt13_testsoxe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private EditText edtSoxe;
    private TextView tvKq;
    private Button btnTest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSoxe = (EditText) findViewById(R.id.edt_soxe);
        tvKq = (TextView) findViewById(R.id.tv_kq);
        btnTest = (Button) findViewById(R.id.btn_test);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soxe = edtSoxe.getText().toString();
                String chuoi_mau = "5[0-9]-[A-Z][0-9]-[0-9]{3}\\.[0-9]{2}";

                Pattern pattern = Pattern.compile(chuoi_mau);
                Matcher matcher = pattern.matcher(soxe);
                if(matcher.matches()==true)
                    tvKq.setText("So xe TPHCM hop le");
                else
                    tvKq.setText("So xe khong hop le");
            }
        });
    }
}
