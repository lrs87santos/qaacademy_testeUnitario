package teste_unitario;

import org.junit.Assert;
import org.junit.Test;

public class Test_Ex03 {

    @Test
    public void Nome1(){
        Assert.assertEquals("Leonardo",Ex03.ArmazenarNomes());
    }   

    @Test
    public void Nome2(){
        Assert.assertEquals("Luiz",Ex03.ArmazenarNomes());

    }

    @Test
    public void Nome3(){
        Assert.assertEquals("Jose",Ex03.ArmazenarNomes());

    }
}
