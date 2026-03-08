package LSP;

// CLASSE INCORRETA - AveIncorreta.java
class AveIncorreta {
    public void voar() {
        System.out.println("Voando...");
    }
}

class PinguimIncorreto extends AveIncorreta {
    @Override
    public void voar() {
        throw new UnsupportedOperationException("Pinguim não voa!");
    }
}

//O que fere o LSP: A subclasse não pode substituir a superclasse adequadamente.