package ca.cardteam.it.cardtournament;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

import ca.teambot.it.cave.examination.cardproject.R;

public class LoginActivity extends AppCompatActivity
{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = findViewById(R.id.Signup);
        button.setOnClickListener(view ->
        {
            Intent mainIntent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(mainIntent);
            finish();
        });
    }
}