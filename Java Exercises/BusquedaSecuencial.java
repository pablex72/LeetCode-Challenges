import javax.swing.*;

public class BusquedaSecuencial {

    public static void main(String[] args) {

        int[] arreglo = {4,1,5,2,3};
        int dato;
        boolean band = false; //indica si se encontro el valor

        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar"));

        //busqueda secuencial
        int i = 0;
        while (i<5 && band==false) {
            if(arreglo[i] == dato){
                band = true;
            }
            i++;
        }

        if(band == false){
            System.out.println("no found");
        }else{
            System.out.println("esta en " + (i-1));
        }
    }
}
