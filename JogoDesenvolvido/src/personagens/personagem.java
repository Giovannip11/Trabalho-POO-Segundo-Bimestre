
package personagens;

import armas.Arma_IF;
import armas.Magia;

public abstract class personagem {
    Arma_IF arma;

    public void desenhar() {
        InOut.MsgDeAviso("Desenho", "Desenhando");
    }

    public boolean correr() {
        if (this instanceof DragaoAlado) {
            InOut.MsgDeAviso("Ação", "Dragao Alado não pode correr!");
            return false;
        } else {
            InOut.MsgDeAviso("Ação", "Tentando correr...");
            return Math.random() < 0.5;
        }
    }

    public String falar() {
        InOut.MsgDeAviso("Frase", "Frase genérica WoooW");
        return null;
    }

    public void arma() {
        arma.usarArma();
    }

    public void setArma(Arma_IF arma) {
        if (arma instanceof Magia && !(this instanceof Mago)) {
            InOut.MsgDeAviso("Erro", "Apenas um Mago pode usar Magia!");
        } else {
            this.arma = arma;
        }
    }
}

    
    
    

