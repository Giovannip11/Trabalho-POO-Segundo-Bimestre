
package armas;


public class Fuzil implements Arma_IF {

    @Override
    public void usarArma(){
            InOut.MsgDeAviso("Usando:", "Fuzil");
    }
    
}
