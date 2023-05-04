//        Iniciar con el elemento intermedio del array como clave.
//        Si el valor de la clave es igual al elemento buscado entonces se devuelve el índice de la clave inicial.
//        Si el valor de la clave es menor que el elemento buscado en mitad del intervalo, acotar el intervalo a la mitad más baja.
//        Si no, acotar el intervalo a la mitad más alta.
//        Repetir los pasos anteriores hasta que el intervalo quede vacío.
//
//Array de datos: datos[] = {11, 23, 30, 50, 60, 80, 115, 130, 140, 170}, x = 115
//        Salida:  6
//        El elemento x se encuentra en la posición 6 del array.
//
//        Array de datos: datos[] = {10, 20, 37, 40, 62, 111, 120, 131, 190}, x = 133
//        Salida: -1
//        El elemento x no se encuentra en el array.
public class BusquedaBinaria {

    public static void main(String[] args) {
        int datos[] = {11, 23, 30, 50, 60, 80, 115, 130, 140, 170};
        //int datos[] = {10, 20, 37, 40, 62, 111, 120, 131, 190};
        System.out.println(datos);
        for (int i=0; i< datos.length; i++){
            System.out.print(datos[i]+" ");
        }
    }

    public int[] order(int[] datos){


        return datos;
    }

    public int find(int[] datos){

        return 3;
    }

}
