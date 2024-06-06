package ru.mirea.kevorkovva.multiactivity;

import android.content.Intent;
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
    private EditText editText;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextText);
        button = findViewById(R.id.button);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = editText.getText().toString();
        //intent.putExtra("key", "MIREA - Кеворков Владислав Арсенович");
        intent.putExtra("key", message);
        startActivity(intent);
    }
}