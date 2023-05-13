package teste_unitario;

import org.junit.Assert;
import org.junit.Test;

public class Test_Ex01 {
    @Test
    public void validaPalavra(){
        Assert.assertEquals("Bom dia",Ex01.retornaPalavra());

    }

    @Test
    public void validaPalavraIncorreta(){
        Assert.assertEquals("Não",Ex01.retornaPalavra());

    }
    
    
}
