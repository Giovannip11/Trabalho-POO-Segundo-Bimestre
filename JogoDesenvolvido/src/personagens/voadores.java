
package personagens;

import armas.Arma_IF;


public abstract class voadores{
    
    Arma_IF arma;
    
    public void voar(){
        
    }
    
     public void arma(){
        arma.usarArma();
    }

    public void setArma(Arma_IF arma) {
        this.arma = arma;
    }
     
}
