package bits.timetable.timetableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final RadioButton rbeg = (RadioButton) findViewById(R.id.rbeg);
       final RadioButton rbws = (RadioButton) findViewById(R.id.rbws);
        TextView txt = (TextView) findViewById(R.id.textView);
        Button bttn = (Button) findViewById(R.id.button);

        View.OnClickListener getans = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if ( rbeg.isChecked() == true )
               {
                    //go to eg page

               }

                else if (rbws.isChecked() == true)
                {
                    //go to ws page

                }

                else
                {
                    Toast.makeText(MainActivity.this,
                            "Please select your Course!", Toast.LENGTH_LONG).show();
                }


            }
        };

        bttn.setOnClickListener(getans);

    }



}
