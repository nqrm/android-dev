package ru.mirea.kevorkovva.favoritebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ShareActivity extends AppCompatActivity {
    private EditText userInput;
    private TextView textViewBook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_share);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        userInput = findViewById(R.id.userInput);
        //Получение данных из MainActivity
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            textViewBook = findViewById(R.id.textViewBook);
            String book = extras.getString(MainActivity.KEY);
            textViewBook.setText(String.format("Любимая книга разработчика: %s", book));
        }
    }

    // Отправка введенных пользователем данных по нажатию на кнопку
    public void setInfoAboutBook(View view) {
        //Intent intent = getIntent();
        //String string = intent.getStringExtra(MainActivity.KEY);

        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, userInput.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}