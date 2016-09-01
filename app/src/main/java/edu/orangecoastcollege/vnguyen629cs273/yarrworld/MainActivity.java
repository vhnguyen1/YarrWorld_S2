package edu.orangecoastcollege.vnguyen629cs273.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

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
}
