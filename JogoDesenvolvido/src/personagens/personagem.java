
package personagens;

import armas.Arma_IF;

public abstract class personagem {
      
    Arma_IF arma;
    
  
    
    public void desenhar(){
         
        InOut.MsgDeAviso("Desenho", "Desenhando");
        
    }
    
    public String falar(){
          InOut.MsgDeAviso("Frase","Frase genérica WoooW" );
     
          
        return null;
        
     
    }
    
    public void arma(){
        arma.usarArma();
    }

    public void setArma(Arma_IF arma) {
        this.arma = arma;
    }
    
    
    
    
}
