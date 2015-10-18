public class SplayTreeSet implements WordSet 
{
	private SplayTree  splayTree = new SplayTree();
	
	public void add(Word wordObject)
	{
			splayTree.insert(wordObject);
	}

	@Override
	public Word get(Word word) {
		// TODO Auto-generated method stub
		return (Word) splayTree.find(word);
	}

}
