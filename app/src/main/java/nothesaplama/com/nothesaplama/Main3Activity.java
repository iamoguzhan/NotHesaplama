package nothesaplama.com.nothesaplama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static com.google.android.gms.ads.AdRequest.DEVICE_ID_EMULATOR;


public class Main3Activity extends AppCompatActivity {

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(DEVICE_ID_EMULATOR).build();
        mAdView.loadAd(adRequest);


        TextView tv = (TextView) findViewById(R.id.textView2);
        Button tekrarHesapla = (Button) findViewById(R.id.button2) ;

        Intent i = getIntent();
        String result = i.getStringExtra("Sonuç");
        tv.setText("Ortalamanız: " + result);

        tekrarHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Main3Activity.this, Main2Activity.class);         //Main2Activity e geçme
                startActivity(j);
            }
        });

    }



}
