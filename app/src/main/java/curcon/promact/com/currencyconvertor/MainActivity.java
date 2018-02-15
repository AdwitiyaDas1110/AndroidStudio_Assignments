package curcon.promact.com.currencyconvertor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import org.json.JSONArray;

import java.text.DecimalFormat;

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

        //-----------------------------Swiss to rest---------------------------//
        final ImageButton fromSwiss = findViewById(R.id.SwissToRestButton);
        fromSwiss.setOnClickListener(new View.OnClickListener() {
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
                    float SwissAmount= Float.parseFloat(Swiss.getText().toString());

                    float ToUS = (float)(SwissAmount * 1.0706);
                    US.setText(Float.toString(ToUS));
                    float ToIndian = (float)(SwissAmount * 68.7123);
                    Indian.setText(Float.toString(ToIndian));
                    float ToHungarian = (float)(SwissAmount * 267.7758);
                    Hungarian.setText(Float.toString(ToHungarian));
                    float ToJapanese = (float)(SwissAmount * 116.6162);
                    Japanese.setText(Float.toString(ToJapanese));
                    float ToRussian = (float)(SwissAmount * 61.2213);
                    Russian.setText(Float.toString(ToRussian));
                    float ToBahrain = (float)(SwissAmount * 0.4025);
                    Bahrain.setText(Float.toString(ToBahrain));
                    float ToMalaysian = (float)(SwissAmount * 4.1875);
                    Malaysian.setText(Float.toString(ToMalaysian));
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),"Type a valid amount",Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });


        //--------------------------------US to rest----------------------------//
        final ImageButton fromUS = findViewById(R.id.USToRestButton);
        fromUS.setOnClickListener(new View.OnClickListener() {
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
                    float USAmount= Float.parseFloat(US.getText().toString());

                    float ToSwiss = (float)(USAmount * 0.9339);
                    Swiss.setText(Float.toString(ToSwiss));
                    float ToIndian = (float)(USAmount * 64.2903);
                    Indian.setText(Float.toString(ToIndian));
                    float ToHungarian = (float)(USAmount * 250.8708);
                    Hungarian.setText(Float.toString(ToHungarian));
                    float ToJapanese = (float)(USAmount * 108.9071);
                    Japanese.setText(Float.toString(ToJapanese));
                    float ToRussian = (float)(USAmount * 57.4481);
                    Russian.setText(Float.toString(ToRussian));
                    float ToBahrain = (float)(USAmount * 0.376);
                    Bahrain.setText(Float.toString(ToBahrain));
                    float ToMalaysian = (float)(USAmount * 3.9126);
                    Malaysian.setText(Float.toString(ToMalaysian));

                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),"Type a valid amount",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


        //----------------------------Bahrain to rest---------------------------//
        final ImageButton fromBahrain = findViewById(R.id.BahrainToRestButton);
        fromBahrain.setOnClickListener(new View.OnClickListener() {
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
                    float BahrainAmount= Float.parseFloat(Bahrain.getText().toString());

                    float ToUS = (float)(BahrainAmount * 2.6595);
                    US.setText(Float.toString(ToUS));
                    float ToIndian = (float)(BahrainAmount * 170.895);
                    Indian.setText(Float.toString(ToIndian));
                    float ToHungarian = (float)(BahrainAmount * 666.9613);
                    Hungarian.setText(Float.toString(ToHungarian));
                    float ToJapanese = (float)(BahrainAmount * 289.5963);
                    Japanese.setText(Float.toString(ToJapanese));
                    float ToRussian = (float)(BahrainAmount * 152.6186);
                    Russian.setText(Float.toString(ToRussian));
                    float ToSwiss = (float)(BahrainAmount * 2.4839);
                    Swiss.setText(Float.toString(ToSwiss));
                    float ToMalaysian = (float)(BahrainAmount * 10.4095);
                    Malaysian.setText(Float.toString(ToMalaysian));
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),"Type a valid amount",Toast.LENGTH_SHORT);
                    toast.show();
                }


            }
        });

        //----------------------------Russian to rest--------------------------//
        final ImageButton fromRussian = findViewById(R.id.RussianToRestButton);
        fromRussian.setOnClickListener(new View.OnClickListener() {
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
                    float RussianAmount= Float.parseFloat(Russian.getText().toString());

                    float ToUS = (float)(RussianAmount * 0.01742);
                    US.setText(Float.toString(ToUS));
                    float ToIndian = (float)(RussianAmount * 1.1197);
                    Indian.setText(Float.toString(ToIndian));
                    float ToHungarian = (float)(RussianAmount * 4.3702);
                    Hungarian.setText(Float.toString(ToHungarian));
                    float ToJapanese = (float)(RussianAmount * 1.8977);
                    Japanese.setText(Float.toString(ToJapanese));
                    float ToSwiss = (float)(RussianAmount * 0.0163);
                    Swiss.setText(Float.toString(ToSwiss));
                    float ToBahrain = (float)(RussianAmount * 0.0065);
                    Bahrain.setText(Float.toString(ToBahrain));
                    float ToMalaysian = (float)(RussianAmount * 0.0682);
                    Malaysian.setText(Float.toString(ToMalaysian));

                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),"Type a valid amount",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


        //------------------------------Japanese to rest--------------------------//
        final ImageButton fromJapanese = findViewById(R.id.JapaneseToRestButton);
        fromJapanese.setOnClickListener(new View.OnClickListener() {
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
                    float JapaneseAmount= Float.parseFloat(Japanese.getText().toString());

                    float ToUS = (float)(JapaneseAmount * 0.0091);
                    US.setText(Float.toString(ToUS));
                    float ToIndian = (float)(JapaneseAmount * 0.587);
                    Indian.setText(Float.toString(ToIndian));
                    float ToHungarian = (float)(JapaneseAmount * 2.2851);
                    Hungarian.setText(Float.toString(ToHungarian));
                    float ToSwiss = (float)(JapaneseAmount * 0.0085);
                    Swiss.setText(Float.toString(ToSwiss));
                    float ToRussian = (float)(JapaneseAmount * 0.5221);
                    Russian.setText(Float.toString(ToRussian));
                    float ToBahrain = (float)(JapaneseAmount * 0.0034);
                    Bahrain.setText(Float.toString(ToBahrain));
                    float ToMalaysian = (float)(JapaneseAmount * 0.0358);
                    Malaysian.setText(Float.toString(ToMalaysian));
                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),"Type a valid amount",Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });


        //----------------------------Malaysian to rest--------------------------------//
        final ImageButton fromMalaysian = findViewById(R.id.MalaysianToRestButton);
        fromMalaysian.setOnClickListener(new View.OnClickListener() {
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
                    float MalaysianAmount= Float.parseFloat(Malaysian.getText().toString());

                    float ToUS = (float)(MalaysianAmount * 0.2555);
                    US.setText(Float.toString(ToUS));
                    float ToIndian = (float)(MalaysianAmount * 16.4344);
                    Indian.setText(Float.toString(ToIndian));
                    float ToHungarian = (float)(MalaysianAmount * 64.1226);
                    Hungarian.setText(Float.toString(ToHungarian));
                    float ToJapanese = (float)(MalaysianAmount * 27.8328);
                    Japanese.setText(Float.toString(ToJapanese));
                    float ToRussian = (float)(MalaysianAmount * 14.6633);
                    Russian.setText(Float.toString(ToRussian));
                    float ToBahrain = (float)(MalaysianAmount * 0.0961);
                    Bahrain.setText(Float.toString(ToBahrain));
                    float ToSwiss = (float)(MalaysianAmount * 0.2388);
                    Swiss.setText(Float.toString(ToSwiss));

                }
                catch (Exception e){
                    Toast toast = Toast.makeText(getApplicationContext(),"Type a valid amount",Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });



        //-----------------------------------Hungarian to rest----------------------------//
        final ImageButton fromHungarian = findViewById(R.id.HungarianToRestButton);
        fromHungarian.setOnClickListener(new View.OnClickListener() {
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
                    float HungarianAmount= Float.parseFloat(Hungarian.getText().toString());

                    float ToUS = (float)(HungarianAmount * 0.0032);
                    US.setText(Float.toString(ToUS));
                    float ToIndian = (float)(HungarianAmount * 0.2561);
                    Indian.setText(Float.toString(ToIndian));
                    float ToSwiss = (float)(HungarianAmount * 0.0037);
                    Swiss.setText(Float.toString(ToSwiss));
                    float ToJapanese = (float)(HungarianAmount * 0.4344);
                    Japanese.setText(Float.toString(ToJapanese));
                    float ToRussian = (float)(HungarianAmount * 0.2288);
                    Russian.setText(Float.toString(ToRussian));
                    float ToBahrain = (float)(HungarianAmount * 0.0014);
                    Bahrain.setText(Float.toString(ToBahrain));
                    float ToMalaysian = (float)(HungarianAmount * 0.0156);
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
