package com.denystrush.trafficlight;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private TextView mTextInfoView;
    private RelativeLayout mRelativeLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        mTextInfoView = (TextView)findViewById(R.id.colortext);

        final Button redButton = (Button)findViewById(R.id.buttonRed);
        final Button yellowButton = (Button)findViewById(R.id.buttonYellow);
        final Button greenButton = (Button)findViewById(R.id.buttonGreen);
        redButton.setOnClickListener(this);
        yellowButton.setOnClickListener(this);
        greenButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
/*            case R.id.buttonRed:  mTextInfoView.setText(R.string.redbutton);
            mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
                break;

            case R.id.buttonYellow: mTextInfoView.setText(R.string.yellowbutton);
            mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
                break;

            case R.id.buttonGreen: mTextInfoView.setText(R.string.greenbutton);
            mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
                break;*/
            case R.id.buttonRed:  Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonYellow: mTextInfoView.setText(R.string.yellowbutton);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
                break;

            case R.id.buttonGreen: mTextInfoView.setText(R.string.greenbutton);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
                break;
        }
    }
}
