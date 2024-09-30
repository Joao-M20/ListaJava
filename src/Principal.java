public class Principal {

    Pessoa pessoa = new Pessoa("Jose", 20);
    Aluno aluno = new Aluno("Maria", 18, "29747511", "Enfermagem");
    Funcionario funcionario = new Funcionario("Bruna", 36, 5000, "Vendas");

    Autor rowling = new Autor("JK Rowling", "12345678900");
    Autor james = new Autor("E. L. James", "12345678911");
    Autor riordan = new Autor("Rick Riordan", "12345678922");

    Editora rocco = new Editora("Rocco", "Brasil", "12345678900");
    Editora panini = new Editora("Panini", "Brasil", "12345678911");
    Editora disney = new Editora("Disney", "Brasil", "12345678922");

    Livro harryPoter = new Livro("Harry Potter e a Pedra Filosofal", "20/02/2000", rowling, rocco);
    Livro cinquentaTons = new Livro("Cinquenta tons de Cinza", "20/04/2012", james, panini);
    Livro percyJackson = new Livro("Percy Jackson e o Ladrão de Raios", "20/06/2024", riordan, disney);



}
