
package armas;


public class Magia implements Arma_IF{
    
    @Override
    public void usarArma(){
            InOut.MsgDeAviso("Usando:", "Magia");
    }
    
}
