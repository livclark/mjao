package se.mah.k3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class livessemess extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button send = (Button) findViewById(R.id.button1);
        send.setOnClickListener(this);
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		EditText text1 = (EditText) findViewById(R.id.editText1);
		String message = text1.getText().toString();
		
		Toast t= Toast.makeText(this, message, Toast.LENGTH_LONG);
		t.show();
		
		EditText text2 = (EditText) findViewById(R.id.editText2);
		String tag = text2.getText().toString();
		
	}
}