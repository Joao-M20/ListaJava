public class Cachorro implements Animal{

    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro esta correndo.");
    }
}
