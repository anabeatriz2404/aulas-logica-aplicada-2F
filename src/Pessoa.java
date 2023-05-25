public class Pessoa extends Animal {

    // Atributos da classe
    String sobrenome;


    // Método da classe
     public void falar() {
         System.out.println("Falei");
     }
     public String falar(String volume){
         return "Falei " + volume;
     }

    // Sobrescrita do método
    public void comer() {
        System.out.println("Pessoa comeu");
    }


}
