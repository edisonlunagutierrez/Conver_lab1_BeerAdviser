package co.edu.unipiloto.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_beer_activity);
    }

    public void onClickFindBeer(View view){
        BeerExpert expert = new BeerExpert();
        TextView brands = (TextView) findViewById(R.id.textView);
        Spinner color = (Spinner) findViewById(R.id.spinner);

        String brand = (String) color.getSelectedItem();

        List<String> beers = expert.getBrands(brand);

        String outS = "";
        for(String a: beers){
            outS += a + "\n";
        }

        brands.setText(outS);
    }
}