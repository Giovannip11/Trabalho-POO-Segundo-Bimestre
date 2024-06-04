
package armas;


public class bolaDeFogo implements Arma_IF {
    
    @Override
    public void usarArma(){
        InOut.MsgDeAviso("Usando:","Bola de fogo");
    }
}
