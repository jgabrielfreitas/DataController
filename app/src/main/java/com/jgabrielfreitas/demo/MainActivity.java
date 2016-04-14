package com.jgabrielfreitas.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import com.jgabrielfreitas.datacontroller.DataController;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TEXT_EXAMPLE_KEY = "text_example";

    @Bind(R.id.writeSomethingEditText)
    EditText writeSomethingEditText;
    DataController dataController;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        dataController = new DataController(this);
    }

    protected void onResume() {
        super.onResume();

        String writtenUsingDataController = dataController.readStringData(TEXT_EXAMPLE_KEY);

        if (writtenUsingDataController != null)
            writeSomethingEditText.setText(writtenUsingDataController);
    }

    @OnClick(R.id.saveInSharedButton)
    public void saveText() {

        String textInEditText = writeSomethingEditText.getText().toString();

        if (!TextUtils.isEmpty(textInEditText)) {
            dataController.writeData(TEXT_EXAMPLE_KEY, textInEditText);
            showToast("Text saved!");
        } else
            showToast("Nothing to save :(");
    }

    @OnClick(R.id.dropSharedButton)
    public void dropSharedPreferences() {
        dataController.dropAllDatas();
        showToast("Preferences clean!");
    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
