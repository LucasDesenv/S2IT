package br.com.s2it;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import br.com.s2it.number.NumberLogic;
/**
     Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes
    
    regras:
    
    - O primeiro número de C é o primeiro número de A;
    
    - O segundo número de C é o primeiro número de B;
    
    - O terceiro número de C é o segundo número de A;
    
    - O quarto número de C é o segundo número de B;
    
    Assim sucessivamente...
    
    - Caso os números de A ou B sejam de tamanhos diferentes, completar C com o restante
    
    dos números do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.
    
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
     * - Caso os nÃºmeros de A ou B sejam de tamanhos diferentes, completar C com o restante
     *   dos nÃºmeros do inteiro maior. Ex: A = 10256, B = 512, C deve ser 15012256.  
     * 
     * Ã‰ impossÃ­vel, pois nesse exemplo acima o C estÃ¡ sendo preenchido com o A e o B, mas no enunciado fala que
     * deve ser preenchido com o inteiro MAIOR, que logo seria: 
     * C = C(1501) + A(256)
     * e nÃ£o C = C(1501) + B(2) + A(256)
     * 
     * Desculpa caso eu tenha entendido errado.
     */
    @Test
    public void noWayItWillReturn15012256() {
        Integer desvendarNumero = NumberLogic.findTheMysteriousNumber(10256, 512);
        Assertions.assertThat(desvendarNumero).isEqualTo(15012256);
    }
}
