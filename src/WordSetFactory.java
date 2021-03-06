/**
 * Hoja de Trabajo 9
 * 
 * @Boggdan Barrientos 14484
 * @Andre Rodas		   14395
 * @Rudy Garrido	   14366
 */

class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{	// aqui se regresara el set empleando sus implementaciones:
		// if tipo == 2 cree una instancia para un Wordset implementao con Red Black Tree
		// if tipo == 3 cree una instancia para un Wordset implementado con Splay Tree
		// if tipo == 4 cree una instancia para un Wordset implementado con Hash table
		// if tipo == 5 cree una instancia para un Wordset implementado con TreeMap
		switch(tipo){
			case 1:
				return new SimpleSet();
			case 2:
				return new RedBlackTreeSet();
			case 3:
				return new SplayTreeSet();
			case 4:
				return new HashtableSet();
			case 5:
				return new TreeMapSet();
			default:
				System.out.println("Error en el tipo");
			return null;
		}
	}
	
	
}