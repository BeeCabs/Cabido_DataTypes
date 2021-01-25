package mcm.edu.ph.cabido_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayText);

        String firstName = "Bea Francesca";
        char middleInitial = 'M';
        String lastname = "Cabido";
        int myAge = 18;
        float myDreamTVLGrade = 89.9f;
        double myMoney = 5000.00;



        //String.valueOf(myMoney);
        display.setText("My name is "+firstName+ " "
        +String.valueOf(middleInitial)+ " "
        +lastname+ "\nand my age is "
        +myAge+ ".\nI want my grade in TVL3 to be "
        +String.valueOf(myDreamTVLGrade));



        boolean amIMarried = false;







    }
}