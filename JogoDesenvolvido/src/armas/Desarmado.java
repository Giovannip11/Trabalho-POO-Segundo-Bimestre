package armas;


public class Desarmado implements Arma_IF {
    
    @Override
    public void usarArma(){
        InOut.MsgDeAviso("Usando:", "Desarmado");
    }
    
}
