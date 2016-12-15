package bits.timetable.timetableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class WSTimetable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wstimetable);

        Spinner dropdown1 = (Spinner)findViewById(R.id.spinner1);
        String[] items1 = new String[]{"Please Select", "WS 1", "WS 2", "WS 3","WS 4","WS 5","WS 6","WS 7","WS 8","WS 9","WS 10","WS 11","WS 12","WS 13","WS 14","WS 15","WS 16","WS 17","WS 18","WS 19","WS 20","WS 21","WS 22","WS 23","WS 24"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        dropdown1.setAdapter(adapter1);
        dropdown1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {

                    //                startActivity(new Intent(WSTimetable.this, Timetable.class));

                    case 1:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 2:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 3:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 4:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 5:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 6:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 7:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 8:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 9:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 10:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 11:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 12:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 13:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 14:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 15:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 16:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 17:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 18:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 19:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;

                    case 20:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 21:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 22:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 23:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;
                    case 24:
                        startActivity(new Intent(WSTimetable.this, Timetable.class));
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
