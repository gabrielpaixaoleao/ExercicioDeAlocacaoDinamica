package alocacaodinamica;


public class Pedido {
    private Produto[] produto;
    
    Pedido(){
        this.produto = new Produto[3];
    }
    
    public void adicionarProduto(Produto p){
        int aux = 0;
        if(this.produto[this.produto.length - 1] != null){
            Produto[] produto2 = new Produto[this.produto.length * 2];
            for(int j = 0; j < this.produto.length; j++){
                produto2[j] = this.produto[j];
                aux = j + 1;
            }
            produto2[aux] = p;
            this.produto = produto2;
        }
        else{
            for(int i =0; i < this.produto.length; i++){
                if(this.produto[i] == null){
                    this.produto[i] = p;
                    i = this.produto.length;
                }
            }
        }
    }
    
}
