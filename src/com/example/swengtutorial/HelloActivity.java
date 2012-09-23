package com.example.swengtutorial;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class HelloActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_hello, menu);
        return true;
    }

public void displayMessage(View view){
	Toast.makeText(this, "You Clicked Display", Toast.LENGTH_SHORT).show();
	
	EditText editText=(EditText)findViewById(R.id.edit_text);
	String userText=editText.getText().toString();
	
	Intent displayActivityIntent=new Intent(this,ShowMessageActivity.class);
	displayActivityIntent.putExtra(this.getClass().getName(),userText);
	
	startActivity(displayActivityIntent);
}

}
