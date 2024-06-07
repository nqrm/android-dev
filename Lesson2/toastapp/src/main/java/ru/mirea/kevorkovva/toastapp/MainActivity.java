package ru.mirea.kevorkovva.toastapp;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText inputField;
    private Button btnToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        inputField = findViewById(R.id.inputField);
        btnToast = findViewById(R.id.btnToast);
    }

    // Показать уведомление Toast
    public void ShowToast(View view) {
        String text = inputField.getText().toString();
        String sample = String.format("СТУДЕНТ № 8 ГРУППА БИСО-01-19. Количество символов в поле - %d", text.length());
        Toast toast = Toast.makeText(getApplicationContext(),
                sample,
                Toast.LENGTH_SHORT);
        toast.show();
    }

}