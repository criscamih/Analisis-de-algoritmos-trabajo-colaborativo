class cutRodOptimizado
{ 
    /* Retorna el mejor trozo de varilla obtenido con longitud n y precio[] */
    static int cutRod(int precio[],int n) 
    { 
        int val[] = new int[n+1]; // genera los trozos enteros de la varilla dada una longitud n
        val[0] = 0; // arreglo auxiliar 
  
        for (int i = 1; i<=n; i++) 
        { 
            int max_val = Integer.MIN_VALUE; // devuelve el valor mínimo de un tipo entero
            for (int j = 0; j < i; j++) 
                max_val = Math.max(max_val,    //  devuelve el valor máximo dadas dos comparaciones
                                   precio[j] + val[i-j-1]); 
            val[i] = max_val; // asigna el valor abtenido al arreglo auxiliar
        } 
  
        return val[n]; 
    } 

    public static void main(String args[]) 
    { 
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20}; 
        int size = arr.length; 
        System.out.println("El valor máximo obtenido es:  " + 
                            cutRod(arr, size)); 
    } 
} 
