package org.tensorflow.lite.examples.posenet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton CameraButton, GraphButton;
    TextView TutorialButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*button 할당*/
        CameraButton = (ImageButton) findViewById(R.id.CameraButton);
        GraphButton = (ImageButton) findViewById(R.id.GraphButton);
        TutorialButton = (TextView) findViewById(R.id.TutorialButton);

        CameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Camera2Activity.class);
                startActivity(intent);
            }
        });

        TutorialButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getBaseContext(), TutorialActivity.class);
                startActivity(intent);
            }
        });

    }



}
