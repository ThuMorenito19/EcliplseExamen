
public class ExamenVictor {
	/**
	 * 
	 * @param args
	 * Creo la clase main
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Creo el arrayPersonas y llamo al método contarVocales
		 */
		String [] arrayPersonas= {"ANA","LUIS","ANTONIO","MANUEL"};
		contarVocales(arrayPersonas);
	}
	/**
	 * 
	 * @param arrayPersonas
	 * Creo el método contarVocales para determinar la cantidad de vocales que hay de cada
	 */
	public static void contarVocales(String [] arrayPersonas) {
		int contadora=0;
		int contadore=0;
		int contadori=0;
		int contadoro=0;
		int contadoru=0;
		for(int i=0;i<arrayPersonas.length;i++) {
			if(arrayPersonas[i].valueOf(i).equals(arrayPersonas[i].charAt(i))) {
				contadora=contadora+1;
			}
			if(arrayPersonas[i].valueOf(i).equals(arrayPersonas[i].charAt(i))) {
				contadora=contadore+1;
			}
			if(arrayPersonas[i].valueOf(i).equals(arrayPersonas[i].charAt(i))) {
				contadora=contadori+1;
			}
			if(arrayPersonas[i].valueOf(i).equals(arrayPersonas[i].charAt(i))) {
				contadora=contadoro+1;
			}
			if(arrayPersonas[i].valueOf(i).equals(arrayPersonas[i].charAt(i))) {
				contadora=contadoru+1;
			}
		}
		System.out.println("Numero de vocales a: "+contadora);
		System.out.println("Numero de vocales e: "+contadore);
		System.out.println("Numero de vocales i: "+contadori);
		System.out.println("Numero de vocales o: "+contadoro);
		System.out.println("Numero de vocales u: "+contadoru);
	}
}
