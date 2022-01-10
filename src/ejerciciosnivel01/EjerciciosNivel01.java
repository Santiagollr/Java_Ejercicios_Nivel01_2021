package ejerciciosnivel01;

import java.util.Arrays;

/**
 *
 * @author Santiago
 */
public class EjerciciosNivel01 {
    
    public int[] maximos(int[] lista){
        int[] arrayMaximos = {0,0};
        for (int i=0; i<lista.length; i++){
            if (lista[i] > arrayMaximos[0]){
                arrayMaximos[1] = arrayMaximos[0];
                arrayMaximos[0] = lista[i]; 
            }
            else if (lista[i] > arrayMaximos[1]) {
                arrayMaximos[1] = lista[i];
            }
        }
        
        return arrayMaximos;
    }
    //segundo ejercicio : PALÍNDROMO
    //para hacer este ejercicio necesito hacer primero
    //una funcion que "limpie" el string para quitarle
    //los acentos y los espacios en blanco
    
    private String limpiaFrase (String frase){
        frase = frase.toLowerCase(); //paso la frase a minusculas
        frase = frase.replace('á', 'a');
        frase = frase.replace('é', 'e');
        frase = frase.replace('í', 'i');
        frase = frase.replace('ó', 'o');
        frase = frase.replace('ú', 'u');
        //quito tambien los espacios en blanco
        frase = frase.replace(" ", "");
        
        return frase;
    }
    
    public boolean esPalindromo (String frase){
        frase = limpiaFrase(frase); //quita los acentos y espacios en blanco
        
        int indiceIzquierdo = 0;
        int indiceDerecho = frase.length()-1;
        
        while (frase.charAt(indiceIzquierdo) == frase.charAt(indiceDerecho) && indiceIzquierdo <= indiceDerecho){
            indiceIzquierdo++;
            indiceDerecho--;
        }
        if (indiceIzquierdo > indiceDerecho){
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        int[] numeros = {99,37,7,54,13};
        int[] numeros2 = {-1,100,8,84,103,100005,77};
        
        EjerciciosNivel01 e = new EjerciciosNivel01();
        System.out.print(Arrays.toString(e.maximos(numeros)));
        System.out.print(Arrays.toString(e.maximos(numeros2)));

        System.out.println(e.esPalindromo("Acaso hubo buhos acá"));
    }
    
}
