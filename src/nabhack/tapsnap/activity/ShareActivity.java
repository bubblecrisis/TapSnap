package nabhack.tapsnap.activity;

import com.googlecode.androidannotations.annotations.EActivity;

import nabhack.tapsnap.R;
import nabhack.tapsnap.R.layout;
import nabhack.tapsnap.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

@EActivity(R.layout.activity_share)
public class ShareActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_share);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.share, menu);
		return true;
	}

}
