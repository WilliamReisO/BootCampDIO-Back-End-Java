package javabasicoaula.src.Escopo;

public class conta {
    
    //varia el da classe conta 
    double saldo=10.0;
    private char[] novoSaldo;

    public void sacar (Double valor){
        // variavel local de método
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        //disponível em toda classe 

        System.out.println(saldo);

        //somente o método sacar conhece essa variavel 

        System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
        // variavel local de método

        double valorParcela = 50.0;
        double valorMontante = 0.0; // começando a variavel 
        for(int x=1;x<=5;x++){
            // variavel que se reinicia a cada execução.
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        return valorMontante;
        
    }
}
