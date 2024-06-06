package ru.mirea.kevorkovva.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        editText.setText("onCreate called");
        Log.d(TAG, "onCreate called");
        // Инициализация компонентов
    }

    @Override
    protected void onStart() {
        super.onStart();
        editText.setText("onStart called");
        Log.d(TAG, "onStart called");
        // Логика, выполняемая при видимости активности
    }

    @Override
    protected void onResume() {
        super.onResume();
        editText.setText("onResume called");
        Log.d(TAG, "onResume called");
        // Логика, выполняемая при активной работе с пользователем
    }

    @Override
    protected void onPause() {
        super.onPause();
        editText.setText("onPause called");
        Log.d(TAG, "onPause called");
        // Сохранение данных и остановка ресурсов, требующих активного взаимодействия
    }

    @Override
    protected void onStop() {
        super.onStop();
        editText.setText("onStop called");
        Log.d(TAG, "onStop called");
        // Освобождение ресурсов, которые не нужны, когда активность не видима
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        editText.setText("onDestroy called");
        Log.d(TAG, "onDestroy called");
        // Очистка ресурсов
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        editText.setText("onRestart called");
        Log.d(TAG, "onRestart called");
        // Логика, выполняемая перед повторным запуском активности
    }
}