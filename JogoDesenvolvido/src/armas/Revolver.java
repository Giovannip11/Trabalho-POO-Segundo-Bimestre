
package armas;


public class Revolver implements Arma_IF {
    @Override
    public void usarArma(){
            InOut.MsgDeAviso("Usando:", "Revolver");
    }
}
