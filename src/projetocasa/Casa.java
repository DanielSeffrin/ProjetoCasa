package projetocasa;

import ObjetosDecoracaoLuxo.*;

public class Casa {

    public String CorCasa;
    public int TamanhoCasa;
    public AbajurVip AbajurVipQuarto;
    
    public Casa(){
        this.AbajurVipQuarto = new ObjetosDecoracaoLuxo.AbajurVip();
    }
}
