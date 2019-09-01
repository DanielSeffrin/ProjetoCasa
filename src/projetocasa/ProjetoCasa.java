package projetocasa;

public class ProjetoCasa {

    public static void main(String[] args) {
        Casa CasaDaniel = new Casa();
        CasaDaniel.CorCasa = "Vermelha";
        CasaDaniel.TamanhoCasa = 80;
        //
        Quarto QuartoDaniel = new Quarto();
        QuartoDaniel.TelevisaoQuarto = new Televisao();
        QuartoDaniel.TelevisaoQuarto.Polegadas = 32;
        QuartoDaniel.TelevisaoQuarto.Marca = "Samsung";
        QuartoDaniel.TelevisaoQuarto.Modelo = "LED";
        //
        QuartoDaniel.TapeteQuarto = new Tapete();
        QuartoDaniel.TapeteQuarto.Cor = "Marrom";
        QuartoDaniel.TapeteQuarto.Marca = "São Carlos";
        QuartoDaniel.TapeteQuarto.Tamanho = 100;
        //
        QuartoDaniel.AbajurQuarto = new Abajur();
        QuartoDaniel.AbajurQuarto.Marca = "Plea";
        QuartoDaniel.AbajurQuarto.Tamanho = 36;
        //
        Cozinha CozinhaDaniel = new Cozinha();
        CozinhaDaniel.GeladeiraCozinha = new Geladeira();
        CozinhaDaniel.GeladeiraCozinha.Capacidade = 500;
        CozinhaDaniel.GeladeiraCozinha.Marca = "Brastemp";
        //
        CozinhaDaniel.TapeteCozinha = new Tapete();
        CozinhaDaniel.TapeteCozinha.Cor = "Verde";
        CozinhaDaniel.TapeteCozinha.Marca = "São Carlos";
        CozinhaDaniel.TapeteCozinha.Tamanho = 30;
        //
        CozinhaDaniel.MicroondasCozinha = new Microondas();
        CozinhaDaniel.MicroondasCozinha.Marca = "Electrolux";
        CozinhaDaniel.MicroondasCozinha.Cor = "Branco";
        CozinhaDaniel.MicroondasCozinha.Capacidade = 35;
        CozinhaDaniel.MicroondasCozinha.Potencia = 1000;
        //
        Sala SalaDaniel = new Sala();
        SalaDaniel.SofaSala = new Sofa();
        SalaDaniel.SofaSala.Marca = "Sofani";
        SalaDaniel.SofaSala.NumeroDeLugares = 3;
        //
        SalaDaniel.TelevisaoSala = new Televisao();
        SalaDaniel.TelevisaoSala.Marca = "LG";
        SalaDaniel.TelevisaoSala.Modelo = "LED";
        SalaDaniel.TelevisaoSala.Polegadas = 60;
        //
        SalaDaniel.TapeteSala = new Tapete();
        SalaDaniel.TapeteSala.Cor = "Marrom";
        SalaDaniel.TapeteSala.Marca = "São Carlos";
        SalaDaniel.TapeteSala.Tamanho = 80;
        //   
        System.out.println("Casa Daniel");
        System.out.println("Cor: " + CasaDaniel.CorCasa);
        System.out.println("Tamanho: " + CasaDaniel.TamanhoCasa + " M2");
        System.out.println("");
        //
        System.out.println("Quarto");
        System.out.println("Tamanho da TV: " + QuartoDaniel.TelevisaoQuarto.Polegadas + " polegadas");
        System.out.println("Marca da TV: " + QuartoDaniel.TelevisaoQuarto.Marca);
        System.out.println("Modelo da TV: " + QuartoDaniel.TelevisaoQuarto.Modelo);
        System.out.println("");
        //
        System.out.println("Cor do Tapete: " + QuartoDaniel.TapeteQuarto.Cor);
        System.out.println("Marca do Tapete: " + QuartoDaniel.TapeteQuarto.Marca);
        System.out.println("Tamanho do Tapete: " + QuartoDaniel.TapeteQuarto.Tamanho + " cm");
        System.out.println("");
        //
        System.out.println("Marca do Abajur: " + QuartoDaniel.AbajurQuarto.Marca);
        System.out.println("Tamanho do Abajur: " + QuartoDaniel.AbajurQuarto.Tamanho + " cm");
        System.out.println("");
        //
        System.out.println("Cozinha");
        System.out.println("Capacidade da Geladeira: " + CozinhaDaniel.GeladeiraCozinha.Capacidade + " litros");
        System.out.println("Marca da Geladeira: " + CozinhaDaniel.GeladeiraCozinha.Marca);
        System.out.println("");
        //
        System.out.println("Cor do Tapete: " + CozinhaDaniel.TapeteCozinha.Cor);
        System.out.println("Marca do Tapete: " + CozinhaDaniel.TapeteCozinha.Marca);
        System.out.println("Tamanho do Tapete: " + CozinhaDaniel.TapeteCozinha.Tamanho + " cm");
        System.out.println("");
        //
        System.out.println("Marca do Microondas: " + CozinhaDaniel.MicroondasCozinha.Marca);
        System.out.println("Cor do Microondas: " + CozinhaDaniel.MicroondasCozinha.Cor);
        System.out.println("Capacidade do Microondas: " + CozinhaDaniel.MicroondasCozinha.Capacidade + " litros");
        System.out.println("Potência do Microondas: " + CozinhaDaniel.MicroondasCozinha.Potencia + " wats");
        System.out.println("");
        //
        System.out.println("Sala");
        System.out.println("Marca do Sofá: " + SalaDaniel.SofaSala.Marca);
        System.out.println("Número de Lugares do Sofá: " + SalaDaniel.SofaSala.NumeroDeLugares);
        System.out.println("");
        //
        System.out.println("Marca da TV: " + SalaDaniel.TelevisaoSala.Marca);
        System.out.println("Modelo da TV: " + SalaDaniel.TelevisaoSala.Modelo);
        System.out.println("Tamanho da TV: " + SalaDaniel.TelevisaoSala.Polegadas + " polegadas");
        System.out.println("");
        //
        System.out.println("Cor do Tapete: " + SalaDaniel.TapeteSala.Cor);
        System.out.println("Marca do Tapete: " + SalaDaniel.TapeteSala.Marca);
        System.out.println("Tamanho do Tapete: " + SalaDaniel.TapeteSala.Tamanho + " cm");
    }
}
