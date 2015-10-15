import java.util.Hashtable;

public class HashtableSet implements Hashtable<Word, Word>, WordSet 
{
	
	public void add(Word wordObject)
	{
		put(wordObject, wordObject );
	}

}

