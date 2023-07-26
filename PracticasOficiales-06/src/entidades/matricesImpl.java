package entidades;




public class matricesImpl implements matricesI {

	@Override
	public void sumarMatrices(int[][] matriz) {
		int matrizUno[][] = new int[3][3];
        int matrizDos[][] = new int[3][3];
        int matrizResultante[][] = new int[3][3];

        //Llenado de la primer matriz
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno.length; j++) {
            	matrizUno[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de la segunda matriz
        for (int i = 0; i < matrizDos.length; i++) {
            for (int j = 0; j < matrizDos.length; j++) {
            	matrizDos[i][j] = (int) (Math.random() * 5);
            }
        }

        //Suma o resta de matrices
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizDos.length; j++) {
            	matrizResultante[i][j] = matrizUno[i][j] + matrizDos[i][j];
                //matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
            }
        }

        //imprimiendo las matrices
        for (int i = 0; i < matrizUno.length; i++) {

            for (int j = 0; j < matrizUno.length; j++) {
                System.out.print("[ " + matrizUno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }                        

            for (int j = 0; j < matrizDos.length; j++) {
                System.out.print("[ " + matrizDos[i][j] + " ]");
            }
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < matrizResultante.length; j++) {
                System.out.print("[ " + matrizResultante[i][j] + " ]");
            }

            System.out.println("");
        }
        System.out.println("-------------");	
	}
	
	

	@Override
	public void multiplicarMatrices(int[][] matriz) {
		int matrizUno[][] = new int[3][3];
        int matrizDos[][] = new int[3][3];
        int matrizResultante[][] = new int[3][3];

        //Llenado de la primer matriz
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno.length; j++) {
            	matrizUno[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de la segunda matriz
        for (int i = 0; i < matrizDos.length; i++) {
            for (int j = 0; j < matrizDos.length; j++) {
            	matrizDos[i][j] = (int) (Math.random() * 5);
            }
        }

        //Suma o resta de matrices
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizDos.length; j++) {
            	matrizResultante[i][j] = matrizUno[i][j] * matrizDos[i][j];
            }
        }

        //imprimiendo las matrices
        for (int i = 0; i < matrizUno.length; i++) {

            for (int j = 0; j < matrizUno.length; j++) {
                System.out.print("[ " + matrizUno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  *   ");
            } else {
                System.out.print("      ");
            }                        

            for (int j = 0; j < matrizDos.length; j++) {
                System.out.print("[ " + matrizDos[i][j] + " ]");
            }
            
            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            
            for (int j = 0; j < matrizResultante.length; j++) {
                System.out.print("[ " + matrizResultante[i][j] + " ]");
            }

            System.out.println("");
        }
        System.out.println("-------------");
	}



	@Override
	public void transpuestaMatrices(int[][] matriz) {
		int matrizUno[][] = new int[3][3];
		 int[][] transpuesta = new int[matrizUno[0].length][matrizUno.length];
		System.out.println("Matriz transpuesta");
		
        //Llenado de la primer matriz
        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno.length; j++) {
            	matrizUno[i][j] = (int) (Math.random() * 5);
                transpuesta [j][i] =   matrizUno[i][j];
            }
            
            
            for (int j = 0; j < matrizUno.length; j++) {
                System.out.print("[ " + transpuesta[j][i] + " ]");
            }
            System.out.println(" ");
        }
        System.out.println("-------------");
	}

	
	 
	
	 public  int calcularDeterminante(int[][] matriz) {
		 
	        if (!esMatrizCuadrada(matriz)) {
	            throw new IllegalArgumentException("La matriz no es cuadrada");
	        }

	        int n = matriz.length;

	        if (n == 1) {
	            return matriz[0][0];
	        }

	        int determinante = 0;

	        for (int j = 0; j < n; j++) {
	            determinante += matriz[0][j] * cofactor(matriz, 0, j);
	           
	        }
	        
	        System.out.println("el numero determinate es:"+determinante);
	        return determinante;
	        
	        
	    }
	    
	 private static int[][] submatriz(int[][] matriz, int fila, int columna) {
	        int n = matriz.length;
	        int[][] submatriz = new int[n - 1][n - 1];

	        int filaDestino = 0;
	        int columnaDestino;

	        for (int i = 0; i < n; i++) {
	            if (i != fila) {
	                columnaDestino = 0;
	                for (int j = 0; j < n; j++) {
	                    if (j != columna) {
	                        submatriz[filaDestino][columnaDestino] = matriz[i][j];
	                        columnaDestino++;
	                    }
	                }
	                filaDestino++;
	            }
	        }

	        return submatriz;
	    }

	    private  int cofactor(int[][] matriz, int fila, int columna) {
	        int signo = (fila + columna) % 2 == 0 ? 1 : -1;
	        int[][] submatriz = submatriz(matriz, fila, columna);
	        int subDeterminante = calcularDeterminante(submatriz);
	        return signo * subDeterminante;
	    }
	    
	    private static boolean esMatrizCuadrada(int[][] matriz) {
	        int filas = matriz.length;
	        int columnas = matriz[0].length;
	        return filas == columnas;
	    }




	@Override
	public void diagonalMatriz(int[][] matriz) {
		int matrizUno[][] = new int[3][3];
		System.out.println("Matriz diagonal");
		
       //Llenado de la primer matriz
       for (int i = 0; i < matrizUno.length; i++) {
           for (int j = 0; j < matrizUno.length; j++) {
        	   matrizUno[i][j] = (int) (Math.random() * 5);
        	   System.out.print("[ " + matrizUno[i][j] + " ]");
           }        
           
           System.out.println(" ");
       }for(int k = 0; k<4; k++){
    	   try {
           	System.out.println("La diagonales  principal es:" + matrizUno[k][k]);
           }
           catch (Exception e) {
           	System.out.println("FIN");
           }
       }
		
	}



	@Override
	public void simátricaMatriz(int[][] matriz) {
		int matrizUno[][] = new int[3][3];
		System.out.println("Matriz simétrica");
		for (int i = 0; i < matrizUno.length; i++) {
	           for (int j = 0; j < matrizUno.length; j++) {
	        	   matrizUno[i][j] = (int) (Math.random() * 5);
	        	   System.out.print("[ " + matrizUno[i][j] + " ]");
	           }
	           System.out.println(" ");
		}
		System.out.println("-------------");
	}



	
	
}

