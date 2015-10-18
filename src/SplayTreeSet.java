/**
 * Hoja de Trabajo 9
 * 
 * @Boggdan Barrientos 14484
 * @Andre Rodas		   14395
 * @Rudy Garrido	   14366
 */

public class SplayTreeSet implements WordSet 
{
	private SplayTree<Word>  splayTree = new SplayTree<Word>();
	
	public void add(Word wordObject)
	{
			splayTree.add(wordObject);
	}

	@Override
	public Word get(Word word) {
		// TODO Auto-generated method stub
		return (Word) splayTree.get(word);
	}

}
