package sem1.example.com;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

import sem1.example.com.R;

public class ResultActivity extends ActionBarActivity {
    double costPerTicket = 250.00;
    int numberOfTickets;
    double totalCost;
    String userName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        DecimalFormat currency = new DecimalFormat("Php ###,###.##");
        final TextView result = (TextView) findViewById(R.id.thankYou);

        Intent intent3 = getIntent();
        String user = intent3.getStringExtra(LogInActivity.EXTRA_MESSAGE);
        Intent intent4 = getIntent();
        String count = intent4.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView result1 = new TextView(this);
        result1.setText(user + " have reserved " + count + " tickets." + "The amount is " + currency.format(totalCost) + "." + " Thank you!");
        setContentView(result1);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
