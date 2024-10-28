package exercicios.pooHeranca;

public class GeradorPrimo extends NumerosPrimos{
    public int gerarNumeroPrimo(int numero) {
        int proximoNumero = numero + 1;
        while (!verificarPrimalidade(proximoNumero)) {
            proximoNumero++;
        }
        return proximoNumero;
    }
}
