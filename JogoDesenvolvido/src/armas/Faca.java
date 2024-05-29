
package armas;


public class Faca implements Arma_IF {
    
    @Override
    public void usarArma(){
    InOut.MsgDeAviso("Usando:", "Faca");
}
}
