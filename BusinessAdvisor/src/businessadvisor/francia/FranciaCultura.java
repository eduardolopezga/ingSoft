package businessadvisor.francia;

import com.example.businessadvisor.R;
//import com.example.businessadvisor.R.layout;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class FranciaCultura  extends Activity {

	
	
	/** Called when the activity is first created. */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutculturafrancia);
    }
    
       
public void lanzarreligionfrancia (View view){
    	
    	Intent i = new Intent (this, businessadvisor.francia.ReligionFrancia.class);
    	startActivity(i);
    	
    }

public void lanzarlenguafrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.LenguaFrancia.class);
	startActivity(i);
	
}

    
public void lanzarcostumbresfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.CostumbreFrancia.class);
	startActivity(i);
	
}

public void lanzardiasfestivosfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.DiasFestivosFrancia.class);
	startActivity(i);
	
}




    
    
}