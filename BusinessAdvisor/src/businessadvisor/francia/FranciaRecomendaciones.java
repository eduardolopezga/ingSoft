package businessadvisor.francia;

import com.example.businessadvisor.R;
//import com.example.businessadvisor.R.layout;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.content.Intent;

public class FranciaRecomendaciones  extends Activity {

	
	
	/** Called when the activity is first created. */
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutsugerenciasfrancia);
    }
    
       
public void lanzarquehacerfrancia (View view){
    	
    	Intent i = new Intent (this, businessadvisor.francia.QueHacerFrancia.class);
    	startActivity(i);
    	
    }

public void lanzarquenohacerfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.QuenoHacerFrancia.class);
	startActivity(i);
	
}

    
public void lanzarsaludosfrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.SaludosFrancia.class);
	startActivity(i);
	
}

public void lanzarvocabulariofrancia (View view){
	
	Intent i = new Intent (this, businessadvisor.francia.VocabularioFrancia.class);
	startActivity(i);
	
}


    
    
}