import java.util.TreeMap;

public class TreeMapSet implements WordSet 
{
	private TreeMap mapeo = new TreeMap<String, Word>();
	public void add(Word wordObject)
	{
		mapeo.put(wordObject.getWord(), wordObject );
	}

	@Override
	public Word get(Word word) {
		// TODO Auto-generated method stub
		return (Word) mapeo.get(word.getWord());
	}

}

