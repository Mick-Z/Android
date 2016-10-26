package mickzeller.midtermreview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private EditText varA, varB, varC;
    private TextView firstX, secondX;
    private NumberFormat formatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstX = (TextView)findViewById(R.id.textView4);
        secondX = (TextView)findViewById(R.id.textView6);
        varA = (EditText) findViewById(R.id.editText);
        varB = (EditText) findViewById(R.id.editText2);
        varC = (EditText) findViewById(R.id.editText3);

    }

    public void calculate(View view)
    {

        double a,b,c,plus, minus;

        formatter = new DecimalFormat("#0.00");

        try {
            a = Double.parseDouble(String.valueOf(varA.getText()));
            b = Double.parseDouble(String.valueOf(varB.getText()));
            c = Double.parseDouble(String.valueOf(varC.getText()));

            plus = ( (-(b)) + Math.sqrt(( b * b) - (4 * a * c)) )  / (2 * a);
            minus = ( (-(b)) - Math.sqrt(( b * b) - (4 * a * c)) )  / (2 * a);

            firstX.setText(formatter.format(plus));
            secondX.setText(formatter.format(minus));
            varA.setText(" ");
            varB.setText(" ");
            varC.setText(" ");
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }



}
