package nabhack.tapsnap.activity;

import nabhack.tapsnap.R;
import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ItemClick;
import com.googlecode.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_deal_of_the_day)
public class DealOfTheDayActivity extends Activity {

	@ViewById
	ListView listView;

	
	@AfterViews
    void setupView() {
		WebView dealOfTheDayView = new WebView(this);
		dealOfTheDayView.loadUrl("http://apcmag.com/images/2011/Top3TabletSamsungGalaxyTabAd.jpg");
		listView.addHeaderView(dealOfTheDayView);
		
		String[] DEALS = { "Doc Johnson American Bombshell B-10 Warhead", "Doc Johnson The Great American Challenge", "Belladonna's Magic Hand", "Gum Drops Ace of Spades", "TitanMen Intimidator", "Master Series Dark Nadir" };
		listView.setAdapter(new ArrayAdapter<String>(this, R.layout.deal_list_item, R.id.title, DEALS));  		
    }

	@ItemClick(R.id.listView)
	void listViewClicked(int position) {
		Intent intent = new Intent(this, DealDetailsActivity_.class);
		startActivity(intent);
	}
}
