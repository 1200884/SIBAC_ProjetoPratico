package org.engcia.cf.model;

public interface Uncertainty {
    // Atualiza o estado do objeto conforme necessário
    public void update();
    
    // Obtém o fator de certeza (CF) do objeto
    public double getCf();
    
    // Define o fator de certeza (CF) do objeto
    public void setCf(double cf);
}
