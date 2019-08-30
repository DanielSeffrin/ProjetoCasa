package projetocasa;

public class ProjetoCasa {

    public static void main(String[] args) {
        Casa CasaDaniel = new Casa();
        CasaDaniel.Cor = "Vermelho";
        CasaDaniel.TelevisaoQuarto = new Televisao();
        CasaDaniel.TelevisaoQuarto.Polegadas = 32;
        CasaDaniel.TelevisaoQuarto.Marca = "Samsung";
        //
        Casa CasaPedro = new Casa();
        CasaPedro.Cor = "Verde";
        CasaPedro.GeladeiraCozinha = new Geladeira();
        CasaPedro.GeladeiraCozinha.Capacidade = "500 Litros";
        CasaPedro.GeladeiraCozinha.Marca = "Brastemp";
        //
        System.out.println("Cor Casa Daniel: " + CasaDaniel.Cor);
        System.out.println("Cor Casa Pedro: " + CasaPedro.Cor);

        CasaPedro.SofaSala = new Sofa();
        CasaPedro.SofaSala.Marca = "Herval";

        System.out.println("Marca Sofa Sala Pedro " + CasaPedro.SofaSala.Marca);

        CasaDaniel.SofaVaranda = CasaPedro.SofaSala;

        CasaDaniel.SofaSala = CasaPedro.SofaSala;
        CasaPedro = CasaDaniel;
        System.out.println("Cor Casa Pedro: " + CasaPedro.Cor);

        CasaPedro.Cor = "Preto";

        System.out.println("Cor Casa Daniel: " + CasaDaniel.Cor);
        System.out.println("Tamanho TV Quarto Daniel: " + CasaDaniel.TelevisaoQuarto.Polegadas);
        System.out.println("Marca TV Quarto Daniel: " + CasaDaniel.TelevisaoQuarto.Marca);
        
        System.out.println("Capacidade Geladeira: " + CasaPedro.GeladeiraCozinha.Capacidade);
        System.out.println("Marca Geladeira: " + CasaPedro.GeladeiraCozinha.Marca);
    }
}
