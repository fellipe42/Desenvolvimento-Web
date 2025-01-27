public class ProjetoLivro {
    public static void main(String[] args){

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("50 tons de cinza", "Cristian Gray", 445, p[1]);
        l[1] = new Livro("The Lord of The Rings", "J.R.R. Tolkien", 657, p[0]);
        l[2] = new Livro("É assim que acaba", "Colinho Rubens", 20, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        System.out.println(l[0].detalhes());
    
    }
}

