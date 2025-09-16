public class Vector {
     int dim;
     double elementos[];
    public Vector (int dim, double elementos[]){
        this.dim=dim;
        this.elementos=elementos;
    }

    public double getValor(int i){
        return elementos[i-1];
    }

    public void setValor(int i, double valor){
        elementos[i-1]=valor;
    }

    public void mostrarVector(){

        for (int i=0; i<dim; i++){
            System.out.print(elementos[i] + " ");
        }
    }



}
