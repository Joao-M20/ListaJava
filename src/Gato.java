public class Gato implements Animal{


    @Override
    public void fazerSom() {
        System.out.println("O gato faz: Miau!");
    }

    @Override
    public void mover() {
        System.out.println("O gato esta andando.");
    }
}
