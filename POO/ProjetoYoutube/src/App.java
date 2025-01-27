public class App {
    public static void main(String[] args) throws Exception {
        Video v[] = new Video[3];
        v[0] = new Video("Teste de video 1");
        v[1] = new Video("Projeto final POO");
        v[2] = new Video("How to program");

        System.out.println(v[0].toString());

        Gafanhoto g [] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Bianca", 27, "F", "BiaSena");
        g[1] = new Gafanhoto("Fellipe", 28,"M","Fellipe");

        
        Visualizacao vis[] = new Visualizacao[5]; 
        vis[0] = new Visualizacao(g[0], v[2]);
        System.out.println(vis.toString());
        vis[1] = new Visualizacao(g[0], v[1]);
        System.out.println(vis[1].toString());

    }
}
