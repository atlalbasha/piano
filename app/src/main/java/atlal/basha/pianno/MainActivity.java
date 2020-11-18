package atlal.basha.pianno;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;

    private MediaPlayer mediaPlayer ;

    private int sound = R.raw.piano;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button1);
        button3 = findViewById(R.id.button2);
        button4 = findViewById(R.id.button3);
        button5 = findViewById(R.id.button4);
        button6 = findViewById(R.id.button5);
        button7 = findViewById(R.id.button6);




        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.piano);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });






    }

    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.release();
        mediaPlayer = null;
    }
}