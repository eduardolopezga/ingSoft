package businessadvisor.francia;

import com.example.businessadvisor.R;
//import com.example.businessadvisor.R.layout;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class Francia  extends Activity {

	
	
	/** Called when the activity is first created. */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutfrancia);
    }
    
    
    public void lanzarInformacion (View view){
    	
    	Intent i = new Intent (this, businessadvisor.francia.FranciaClass.class);
    	startActivity(i);
    	
    }
   
    
public void lanzarantesfrancia (View view){
    	
    	Intent i = new Intent (this, businessadvisor.francia.FranciaAntesdePartir.class);
    	startActivity(i);
    	
    }

public void lanzarculturafrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.FranciaCultura.class);
	startActivity(i);
	
}


public void lanzarnegociosfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.FranciaNegocios.class);
	startActivity(i);
	
}
    
public void lanzarrecomendacionesfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.FranciaRecomendaciones.class);
	startActivity(i);
	
}

public void lanzaremergeciasfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.FranciaEmergencias.class);
	startActivity(i);
	
}
    
}