package businessadvisor.francia;

import com.example.businessadvisor.R;
//import com.example.businessadvisor.R.layout;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class FranciaEmergencias  extends Activity {

	
	
	/** Called when the activity is first created. */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutemergenciasfrancia);
    }
    
public void lanzarembajadafrancia (View view){
    	
    	Intent i = new Intent (this, businessadvisor.francia.EmbajadaFrancia.class);
    	startActivity(i);
    	
    }

public void lanzarconsuladofrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.ConsuladoFrancia.class);
	startActivity(i);
	
}

    
public void lanzarpoliciafrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.PoliciaFrancia.class);
	startActivity(i);
	
}

public void lanzarhospitalfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.HospitalesFrancia.class);
	startActivity(i);
	
}


    
    
    
}