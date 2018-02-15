package curcon.promact.com.currencyconvertorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //----------------------------Indian to Rest----------------------------//
        final ImageButton fromIndian = findViewById(R.id.IndianToRestButton);
        fromIndian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText Indian = findViewById(R.id.IndianValue);
                EditText US = findViewById(R.id.USValue);
                EditText Swiss = findViewById(R.id.SwissValue);
                EditText Hungarian = findViewById(R.id.HungarianValue);
                EditText Japanese = findViewById(R.id.JapaneseValue);
                EditText Russian = findViewById(R.id.RussianValue);
                EditText Bahrain = findViewById(R.id.BahrainValue);
                EditText Malaysian = findViewById(R.id.MalaysianValue);

                try{
                    float IndianAmount= Float.parseFloat(Indian.getText().toString());

                    float ToUS = (float)(IndianAmount * 0.0155);
                    US.setText(Float.toString(ToUS));
                    float ToSwiss = (float)(IndianAmount * 0.0145);
                    Swiss.setText(Float.toString(ToSwiss));
                    float ToHungarian = (float)(IndianAmount * 3.9019);
                    Hungarian.setText(Float.toString(ToHungarian));
                    float ToJapanese = (float)(IndianAmount * 1.6932);
                    Japanese.setText(Float.toString(ToJapanese));
                    float ToRussian = (float)(IndianAmount * 0.8941);
                    Russian.setText(Float.toString(ToRussian));
                    float ToBahrain = (float)(IndianAmount * 0.0058);
                    Bahrain.setText(Float.toString(ToBahrain));
                    float ToMalaysian = (float)(IndianAmount * 0.0608);
                    Malaysian.setText(Float.toString(ToMalaysian));
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),"Type a valid amount",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.ClearAllFields){
            EditText Indian = findViewById(R.id.IndianValue);
            EditText US = findViewById(R.id.USValue);
            EditText Swiss = findViewById(R.id.SwissValue);
            EditText Hungarian = findViewById(R.id.HungarianValue);
            EditText Japanese = findViewById(R.id.JapaneseValue);
            EditText Russian = findViewById(R.id.RussianValue);
            EditText Bahrain = findViewById(R.id.BahrainValue);
            EditText Malaysian = findViewById(R.id.MalaysianValue);
            Indian.setText("");
            US.setText("");
            Swiss.setText("");
            Russian.setText("");
            Malaysian.setText("");
            Hungarian.setText("");
            Japanese.setText("");
            Bahrain.setText("");
        }
        return super.onOptionsItemSelected(item);
    }
}
