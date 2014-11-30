package businessadvisor.francia;

import com.example.businessadvisor.R;
//import com.example.businessadvisor.R.layout;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class FranciaNegocios  extends Activity {

	
	
	/** Called when the activity is first created. */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutnegociosfrancia);
    }
    
       
public void lanzarvestimentafrancia (View view){
    	
    	Intent i = new Intent (this, businessadvisor.francia.VestimentaFrancia.class);
    	startActivity(i);
    	
    }
    

public void lanzarpuntualidadfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.PuntualidadFrancia.class);
	startActivity(i);
	
}


public void lanzarcomunicacionfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.ComunicacionFrancia.class);
	startActivity(i);
	
}


public void lanzaralimentosfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.AlimentosFrancia.class);
	startActivity(i);
	
}

public void lanzaragendafrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.AgendaFrancia.class);
	startActivity(i);
	
}

public void lanzarinformacionfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.Francia.class);
	startActivity(i);
	
}




    
    
}