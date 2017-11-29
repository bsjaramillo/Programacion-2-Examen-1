/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ec.edu.espe.modelo.Calculo;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 * @author BJ
 */
public class CalculoTest {
    
    public CalculoTest() {
    }
    public void promedio1(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 14.0;
        prom2=(float)13.0;
        prom3=(float) 15.0;
        float expectResult;
        expectResult=(float)14;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);
        
    }
        public void promedio2(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 13.0;
        prom2=(float)13.0;
        prom3=(float) 15.0;
        float expectResult;
        expectResult=(float)13.66;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);
        
    }
        public void promedio3(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 11.0;
        prom2=(float)14.0;
        prom3=(float) 15.0;
        float expectResult;
        expectResult=(float)13.33;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);  
    }
        public void promedio4(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 12.0;
        prom2=(float)12.0;
        prom3=(float) 12.0;
        float expectResult;
        expectResult=(float)12;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);  
    }
        public void promedio5(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 12.0;
        prom2=(float)13.0;
        prom3=(float) 14.0;
        float expectResult;
        expectResult=(float)13;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);  
    }
        public void promedio6(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 15.0;
        prom2=(float)15.0;
        prom3=(float) 9.0;
        float expectResult;
        expectResult=(float)13;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);  
    }
        public void promedio7(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 20.0;
        prom2=(float)20.0;
        prom3=(float) 1.99;
        float expectResult;
        expectResult=(float)13.99;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);  
    }
        public void promedio8(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 20.0;
        prom2=(float)20.0;
        prom3=(float) 2;
        float expectResult;
        expectResult=(float)14;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);  
    }
        public void promedio9(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 20.0;
        prom2=(float)20.0;
        prom3=(float) 3;
        float expectResult;
        expectResult=(float)14.33;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);  
    }        
        public void promedio10(){
        float prom1;
        float prom2;
        float prom3;
        prom1=(float) 20.0;
        prom2=(float)20.0;
        prom3=(float) 0;
        float expectResult;
        expectResult=(float)13.33;
        Calculo calculo=new Calculo();
        float actualResult;
        actualResult=(float)(Calculo.promedio(prom1+prom2+prom3));
        assertEquals(expectResult,actualResult);  
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
