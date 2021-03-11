package itacademy.kg.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //объявитб эту кнопку
        //отследить его нажатие


        Button convertorButton2 = findViewById(R.id.convertorButton);
        EditText number = (EditText) findViewById(R.id.editTextNumber);

        convertorButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = 0;
                String convert;

                convert = number.getText().toString();
                int num2 = Integer.parseInt(convert);
                TextView textView = findViewById(R.id.answerText2);
                TextView changeCurrency = findViewById(R.id.chooseCurrency);

                if (changeCurrency.getText().toString().equals("USD")) {
                    num = num2 * 80;
                }
                if (changeCurrency.getText().toString().equals("RUB")) {
                    num = num2 * 1.14;
                }
                if (changeCurrency.getText().toString().equals("EU")) {
                    num = num2 * 101.05;
                }
                String totalAnswer = String.valueOf(num);

                textView.setText(totalAnswer + "сом");

            }
        });


//        Button getName = (Button) findViewById(R.id.changePhoto);
//        ImageView image = (ImageView) findViewById(R.id.imageView);
//        getName.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                boolean answer =true;
//                while(answer){
//                        image.setImageResource(R.drawable.pepper);
//                    image.setImageResource(R.drawable.ice_cream);
//
//                    }
//
//            }

//    });

    }

}