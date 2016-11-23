package mickzeller.javaexamples;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import mickzeller.javaexamples.database.DBHelper;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    SQLiteDatabase database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteOpenHelper dbHelper = new DBHelper(this);
        database = dbHelper.getWritableDatabase();

        Toast.makeText(this, "Database Acquired", Toast.LENGTH_SHORT).show();


    }
}
