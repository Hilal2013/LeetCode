package easy.hilal;

public class Shape {
    public static void main(String[] args) {

        String symbol="*";
       for(int i=1; i<=10; i++){
           for(int j=1; j<=i; j++){
               System.out.print(symbol+"");
           }
           System.out.println();
       }
     //multiblication table
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.print(i*j+"\t\t");
            }
            System.out.println();
        }
        for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //print consecutive numbers a right angle triangle
       int k=1;

        for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
