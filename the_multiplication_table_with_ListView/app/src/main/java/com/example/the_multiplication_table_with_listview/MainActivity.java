package com.example.the_multiplication_table_with_listview;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    SeekBar sb;
    TextView selectedValueTextView;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sb = findViewById(R.id.seekBar);
        selectedValueTextView = findViewById(R.id.selectedValueTextView);
        listView = findViewById(R.id.listView);

        updateTable();

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateTable();
                selectedValueTextView.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void updateTable() {
        int multiplicand = sb.getProgress();

        ArrayList<String> tableList = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            tableList.add(multiplicand + " * " + i + " = " + (multiplicand * i));
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tableList);
        listView.setAdapter(adapter);
    }
}
