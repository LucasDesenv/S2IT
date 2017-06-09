package br.com.s2it;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.com.s2it.number.NumberLogic;
/**
     Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes
    
    regras:
    
    - O primeiro n�mero de C � o primeiro n�mero de A;
    
    - O segundo n�mero de C � o primeiro n�mero de B;
    
    - O terceiro n�mero de C � o segundo n�mero de A;
    
    - O quarto n�mero de C � o segundo n�mero de B;
    
    Assim sucessivamente...
    
    - Caso os n�meros de A ou B sejam de tamanhos diferentes, completar C com o restante
    
    dos n�meros do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
    
    - Caso C seja maior que 1.000.000, retornar -1
 * @author lucas.souza
 *
 */
public class NumberLogicTest {

    @Test
    public void mustReturnNegativeWhenOverOneMillion() {
        Integer desvendarNumero = NumberLogic.findTheMysteriousNumber(10256, 512);
        Assertions.assertThat(desvendarNumero).isEqualTo(-1);
    }

    @Test
    public void mustReturnTheMysteriousNumber() {
        Integer desvendarNumero = NumberLogic.findTheMysteriousNumber(43, 79);
        Assertions.assertThat(desvendarNumero).isEqualTo(4739);
    }

    @Test
    public void mustReturnMysteriousNumberWhenHavingDiffLengthWhenNumberBIsTheHighest() {
        Integer desvendarNumero = NumberLogic.findTheMysteriousNumber(43, 793);
        Assertions.assertThat(desvendarNumero).isEqualTo(47393);
    }

    @Test
    public void mustReturnMysteriousNumberWhenHavingDiffLengthWhenNumberAIsTheHighest() {
        Integer desvendarNumero = NumberLogic.findTheMysteriousNumber(1043, 793);
        Assertions.assertThat(desvendarNumero).isEqualTo(170943);
    }
    
    /**
     * Esse teste vai falhar propositalmente.
     * 
     * - Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante
     *   dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.  
     * 
     * É impossível, pois nesse exemplo acima o C está sendo preenchido com o A e o B, mas no enunciado fala que
     * deve ser preenchido com o inteiro MAIOR, que logo seria: 
     * C = C(1501) + A(256)
     * e não C = C(1501) + B(2) + A(256)
     * 
     * Desculpa caso eu tenha entendido errado.
     */
    @Test
    public void noWayItWillReturn15012256() {
        Integer desvendarNumero = NumberLogic.findTheMysteriousNumber(10256, 512);
        Assertions.assertThat(desvendarNumero).isEqualTo(15012256);
    }
}
