public class App {
    public static void main(String[] args) {
        Busquedas metodosBusquedas = new Busquedas();
        
        int[] arregloCienMil = new int[100000];

        for (int i=0; i<100000; i++) {
            arregloCienMil[i] = i;
        }
        
        

        int vb = 504;

        ////////////////////////////////////////////////////////////////////

        

        System.out.println();

        System.out.println("BUSQUEDA SECUENCIAL");
        System.out.println();

        long startTimeSecuencial = System.nanoTime();
        int posicion = metodosBusquedas.busquedaSecuencial(arregloCienMil, vb);
        long endTimeSecuencial = System.nanoTime();

        if(posicion == -1){
            System.out.println("Valor no encontrado");
        }else {
            System.out.println("El numero " + vb + " se encuentra en la posicion " + posicion);

        }

        /////////////////////////////////////////////////////////////////////////////////

        System.out.println();
        System.out.println("BUSQUEDA BINARIA    ");
        System.out.println();

        long startTimeBinario = System.nanoTime();
        int posicionxd = metodosBusquedas.busquedaBinaria(arregloCienMil, vb);
        long endTimeBinario = System.nanoTime();

        if(posicion == -1){
            System.out.println("Valor no encontrado");
        }else {
            System.out.println("El numero " + vb + " se encuentra en la posicion " + posicionxd);

        }
        System.out.println();


        System.out.println("DURACION DE BUSQUEDA SECUENCIAL en nanosegundos: " + (endTimeSecuencial - startTimeSecuencial));
        System.out.println();
        System.out.println("DURACION DE BUSQUEDA BINARIO en nanosegundos: " + (endTimeBinario - startTimeBinario));

        

    
    }

    
    
}