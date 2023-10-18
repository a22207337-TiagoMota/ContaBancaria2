package pt.ulusofona.deisi.lp2.contaBancaria;

public class ContaBancaria {

    int saldo;

    ContaBancaria(int saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }
    }

    void deposita(int valor){
        if (valor >= 0){
            this.saldo += valor;
        }
    }
    boolean levanta(int valor){
        if(this.saldo-valor < 0){
            return false;
        } else {
            this.saldo -= valor;
            return true;
        }
    }
    String getSaldoComoString() {
        return  "" + this.saldo;
    }


}
