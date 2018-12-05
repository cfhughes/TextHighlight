package edu.cnm.deepdive.texthighlight;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewCursorWatcher textViewCursorWatcher = findViewById(R.id.text_watcher);

        textViewCursorWatcher.setText("private static class Solution {\n" +
                "        double[] quotient, remainder;\n" +
                " \n" +
                "        Solution(double[] q, double[] r) {\n" +
                "            this.quotient = q;\n" +
                "            this.remainder = r;\n" +
                "        }\n" +
                "    }");

        //
        textViewCursorWatcher.setSelection(80,114);
    }
}
