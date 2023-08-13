package controller;

public class SomaController {

	public SomaController() {
		super();
		
	}
	public int somatoria(int numNatural) {
		if(numNatural<=0) {
			return 0;
		}
		else {
			return numNatural+somatoria(numNatural-1);
			
		}
	}
//	A relacao de chamada dos passos foi definida como: o maior n�mero natural soma com o pr�ximo n�mero em ordem decrescente at� a condi��o de parada ser verdadeira
//	A condicao de parada foi definida quando o pr�ximo n�mero natural a ser somado for igual ou menor que zero, retornando 0
}
