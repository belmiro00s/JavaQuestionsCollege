public class Exercicios {
    public static void main(String[] args) {
       int x = 4;
       do{
        x--;
       }while(x>5);
       System.out.println(x);
}
}



 class InstrumentoMusical {
         private String nome;
         private String som;
         
         public InstrumentoMusical(String nome) {
             this.nome = nome;
             som = "Não possui ou está quebrado.";
         }
         
        public InstrumentoMusical(String nome, String som) {
            this.nome = nome;
            this.som = som;
        }
        
        public InstrumentoMusical(InstrumentoMusical outroInstrumento) {
         nome = outroInstrumento.nome;
            som = outroInstrumento.som;
        }
       
       public InstrumentoMusical() {
        }

    }