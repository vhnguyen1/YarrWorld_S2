package edu.orangecoastcollege.vnguyen629cs273.yarrworld;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context = this;

    // Define the button as an instance variable (member variable)
    Button speakButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Restoring user settings from a previous session
        super.onCreate(savedInstanceState);

        // Inflating (!) opening the layout called "activity_main" (activity_main.xml)
        setContentView(R.layout.activity_main);

        // Hook up the speakButton to the one in our view:
        speakButton = (Button) findViewById(R.id.speakButton);
    }

    public void shimberText(View view) {
        Toast.makeText(context, R.string.toast_text, Toast.LENGTH_LONG).show();
    }
}
