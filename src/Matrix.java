public class Matrix {

        int rows;
     int colums;
     double[][] elements;

    public Matrix(int rows, int colums, double[][] elements){
        this.rows=rows;
        this.colums = colums;
        this.elements=elements;
    }

    public double get(int i, int j){
        return elements[i-1][j-1];
    }


    public void set(int i, int j, double value){
       elements[i-1][j-1]=value;
    }

    public void mostrar(){
        for (int i=0; i<rows; i++){

            for (int j=0; j<colums; j++ ){
                System.out.print(elements[i][j] + " ");
            }
            System.out.println(" ");
        }
    }




}
