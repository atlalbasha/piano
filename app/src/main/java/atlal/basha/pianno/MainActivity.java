package atlal.basha.pianno;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;

    private MediaPlayer mediaPlayer ;

    ArrayList<Integer> soundList = new ArrayList<>();
    private int sound1 = R.raw.piano1;
    private int sound2 = R.raw.piano2;
    private int sound3 = R.raw.piano3;
    private int sound4 = R.raw.piano4;
    private int sound5 = R.raw.piano5;
    private int sound6 = R.raw.piano6;
    private int sound7 = R.raw.piano7;


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

        soundList.add(sound1);
        soundList.add(sound2);
        soundList.add(sound3);
        soundList.add(sound4);
        soundList.add(sound5);
        soundList.add(sound6);
        soundList.add(sound7);

        //mediaPlayer = MediaPlayer.create(this, soundList.get(0));
        sound(0);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound(1);
                mediaPlayer.start();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound(2);
                mediaPlayer.start();

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound(3);
                mediaPlayer.start();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound(4);
                mediaPlayer.start();
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound(5);
                mediaPlayer.start();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound(6);
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

    public int sound (int number){
        mediaPlayer = MediaPlayer.create(this, soundList.get(number));
        return sound1;
    }
}