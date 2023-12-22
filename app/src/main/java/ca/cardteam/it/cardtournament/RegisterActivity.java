package ca.cardteam.it.cardtournament;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import ca.teambot.it.cave.examination.cardproject.R;

public class RegisterActivity extends AppCompatActivity
{

    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(view ->
        {
            Intent mainIntent = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(mainIntent);
            finish();
        });
    }
}