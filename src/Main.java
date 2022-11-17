import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {

        LinkedList<Integer> lista = new LinkedList<Integer>();
        LinkedList<Integer> Pares = new LinkedList<>();
        var Impares = new LinkedList<Integer>();

        //Tamaño de la lista
        int n = (int) (Math.random() * (10 - 1)) + 1;

        System.out.println("Tamaño "+ (n+2));
        System.out.println("----------------------------------");


        for (int i = 0;i<=n ;i++ )
        {
            //Ingresamos nuemeros alzar
            int nn = (int) (Math.random() * (25 - 1)) + 1;
            lista.add(nn);


        }
        System.out.println("Elementos de la lista");
        System.out.print(lista);
        System.out.println("");
        System.out.println("----------------------------------");
        //recorremos lista para encontrar duplicados

        for (int i = 0;i<=lista.size()-1 ;i++ ){

            for (int j = 0;j<=lista.size()-1 ;j++ )
                if (i != j) if (lista.get(i) == lista.get(j))
                    lista.remove(j);

        }
        System.out.println("Elementos de la lista no duplicados");
        System.out.print(lista);
        System.out.println("");

        //Cambiamos el ultimo dato
        int datoUlt = lista.getLast();
        lista.addFirst(datoUlt);
        lista.removeLast();
        System.out.print(lista);
        System.out.println();

        System.out.println("----------------------------------");


        //Buscar Pares e Impares

        for (int i = 0;i<=n ;i++ )
        {
            //es par
            if(lista.get(i) % 2 == 0){
                Pares.add(lista.get(i));
            }else{
                Impares.add(lista.get(i));
            }

        }
        System.out.println("Elementos de la lista Pares");
        System.out.print(Pares);
        System.out.println("");
        System.out.println("----------------------------------");

        System.out.println("Elementos de la lista Impares");
        System.out.print(Impares);
        System.out.println("");
        System.out.println("----------------------------------");
        System.out.println("Elementos de atras hacia adelante");


        for (int i = lista.size()-1 ;i >= 0 ;i-- )
        {
            //Ingresamos nuemeros alzar
            System.out.print(lista.get(i) +" ");


        }
    }
}