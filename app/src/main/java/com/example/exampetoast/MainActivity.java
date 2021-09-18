package com.example.exampetoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CharSequence text = "Bienvenido!";
        int duration = Toast.LENGTH_SHORT;
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.activity_main,null);
//        View layout = inflater.inflate(R.layout.custom_toast,
//                (ViewGroup) findViewById(R.id.toast_layout_root));
        TextView textToast = (TextView) layout.findViewById(R.id.text_toast);
        textToast.setText(text);
.
        Toast toast = new Toast(MainActivity.this);
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();

    }
}