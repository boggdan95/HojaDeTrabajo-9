import java.util.HashMap;

public class HashtableSet implements WordSet 
{
	private HashMap mapeo = new HashMap<String, Word>();
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

