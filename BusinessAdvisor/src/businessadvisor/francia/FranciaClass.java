package businessadvisor.francia;

import com.example.businessadvisor.R;
//import com.example.businessadvisor.R.layout;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class FranciaClass  extends Activity {

	
	
	/** Called when the activity is first created. */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutinformacion);
    }
    
       
public void lanzardocumentosfrancia (View view){
    	
    	Intent i = new Intent (this, businessadvisor.francia.DocumentosFrancia.class);
    	startActivity(i);
    	
    }

public void lanzarsugerenciasfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.SugerenciasFrancia.class);
	startActivity(i);
	
}

    
public void lanzarlugaresdeinteresfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.LugaresdeInteresFrancia.class);
	startActivity(i);
	
}

public void lanzarclimafrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.ClimaFrancia.class);
	startActivity(i);
	
}

public void lanzaraereopuertofrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.AereopuertoFrancia.class);
	startActivity(i);
	
}


    
    
}