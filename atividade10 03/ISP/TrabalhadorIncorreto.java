package ISP;

// CLASSE INCORRETA - TrabalhadorIncorreto.java
interface TrabalhadorIncorreto {
    void trabalhar();
    void comer();
    void dormir();
}

class RoboIncorreto implements TrabalhadorIncorreto {
    @Override
    public void trabalhar() {
        System.out.println("Robô trabalhando...");
    }
    
    @Override
    public void comer() {
        // Robô não come, mas é forçado a implementar
        throw new UnsupportedOperationException("Robô não come!");
    }
    
    @Override
    public void dormir() {
        // Robô não dorme, mas é forçado a implementar
        throw new UnsupportedOperationException("Robô não dorme!");
    }
}

//O que fere o ISP: Interface muito grande, forçando implementações desnecessárias.