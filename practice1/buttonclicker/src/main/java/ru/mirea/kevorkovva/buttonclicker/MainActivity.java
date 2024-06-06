package ru.mirea.kevorkovva.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.checkbox.MaterialCheckBox;

public class MainActivity extends AppCompatActivity {
    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox CheckBoxTap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textViewStudent = findViewById(R.id.tvOut);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        CheckBoxTap = findViewById(R.id.checkBoxTap);

        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку №8");
            }
        };
        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }

    public void onMyButtonClick(View view)
    {
        Toast.makeText(this, "Еще один способ!", Toast.LENGTH_LONG).show();
    }

    public void onCheckBoxClicked(View view)
    {
        if (CheckBoxTap.isChecked()) {
            textViewStudent.setText("Включено");
        }
        else {
            textViewStudent.setText("Выключено");
        }
    }

}