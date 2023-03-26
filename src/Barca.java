public class Barca {
    public Barca(){
    }

    //Método auxiliar projetado para facilitar testes
    //Ocupa o lugar sem verificação
    protected void ocupaLugar(int fila, int assento){

    }

    /*
       * retorna
       *  0 – Identificador de assento inválido

       · 1 – Assento ocupado

       · 2 – Assento bloqueado devido a distribuição de peso

       · 3 – Ok, assento atribuído ao passageiro.
       * Exemplos: F02A12, F45A01, F33A18
        */

    public int ocupaLugar(String assentoInformado){
        if(verificaIdentificador(assentoInformado)==false) return 0;
        return -1;
    }

    public boolean verificaIdentificador(String assentoInformado){
        String[] assento = assentoInformado.split("", 0);
        if(assento.length!=6) return false;
        if(assento[0].equals("F")==false || assento[3].equals("A")==false) return false;
        try {
            int a = Integer.parseInt(assento[1] + assento[2]);
            if (a <= 0 || a > 20) return false;
            int f = Integer.parseInt(assento[4] + assento[5]);
            if (f <= 0 || f > 60) return false;
        } catch(Exception e){
            return false;
        }
        return true;
    }
}
