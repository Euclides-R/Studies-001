package com.example.checkbutton;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    CheckBox chkarroz;
    CheckBox chkleite;
    CheckBox chkcarne;
    CheckBox chkfeijao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkarroz = (CheckBox) findViewById(R.id.chkarroz);
        chkleite = (CheckBox) findViewById(R.id.chkleite);
        chkcarne = (CheckBox) findViewById(R.id.chkcarne);
        chkfeijao = (CheckBox) findViewById(R.id.chkfeijao);
        Button bttotal = (Button) findViewById(R.id.bttotal);
        bttotal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                double total = 0;
                if (chkarroz.isChecked())
                    total += 2.69;
                if (chkleite.isChecked())
                    total += 5.00;
                if (chkcarne.isChecked())
                    total += 9.7;
                if (chkfeijao.isChecked())
                    total += 2.30;
                // Button alert
                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Aviso‼");
                NumberFormat formatter;
                formatter = DecimalFormat.getCurrencyInstance(new Locale("pt", "BR"));
                formatter.setMinimumFractionDigits(2);
                dialogo.setMessage("Valor total da compra: " + formatter.format(total));
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();
            }
        });
    }
}