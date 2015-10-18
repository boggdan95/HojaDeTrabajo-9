

public class RedBlackTreeSet implements WordSet 
{
	private RedBlackBST<String, Word> redBlack = new RedBlackBST<String,Word>();
	public void add(Word wordObject)
	{
			redBlack.put(wordObject.getWord(),wordObject);
	}

	@Override
	public Word get(Word word) {
		// TODO Auto-generated method stub
		return (Word) redBlack.get(word.getWord());
	}

}
