package F28DA_CW1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModificationsTest {

	@Test
	public void testReversal() throws SpellCheckException {

		WordsSet dict = new LLWordsSet();
		try {
			dict.insWord("cats");
			dict.insWord("like");
			dict.insWord("on");
			dict.insWord("of");
			dict.insWord("to");
			dict.insWord("play");
		} catch (SpellCheckException e) {
			fail("Error with linked list implementation");
		}
		Spelling speller = new SpellingImpl();
		WordsSet sugg = speller.suggestions("ctas", dict);
		WordsSet sugg1 = speller.suggestions("liek", dict);
		WordsSet sugg2 = speller.suggestions("lpay", dict);
		assertTrue(sugg.wordExists("cats"));
		assertTrue(sugg1.wordExists("like"));
		assertTrue(sugg2.wordExists("play"));
	}

	@Test
	public void testSubstitution() throws SpellCheckException {
		WordsSet dict = new LLWordsSet();
		try {
			dict.insWord("cats");
			dict.insWord("like");
			dict.insWord("on");
			dict.insWord("of");
			dict.insWord("to");
			dict.insWord("play");
		} catch (SpellCheckException e) {
			fail("Error with linked list implementation");
		}
		Spelling speller = new SpellingImpl();
		WordsSet sugg = speller.suggestions("lats", dict);
		WordsSet sugg1 = speller.suggestions("pike", dict);
		WordsSet sugg2 = speller.suggestions("llay", dict);
		assertTrue(sugg.wordExists("cats"));
		assertTrue(sugg1.wordExists("like"));
		assertTrue(sugg2.wordExists("play"));
	}
	
	@Test
	public void testInsertion() throws SpellCheckException {
		WordsSet dict = new LLWordsSet();
		try {
			dict.insWord("cats");
			dict.insWord("like");
			dict.insWord("on");
			dict.insWord("of");
			dict.insWord("to");
			dict.insWord("play");
		} catch (SpellCheckException e) {
			fail("Error with linked list implementation");
		}
		Spelling speller = new SpellingImpl();
		WordsSet sugg = speller.suggestions("cts", dict);
		WordsSet sugg1 = speller.suggestions("lke", dict);
		WordsSet sugg2 = speller.suggestions("lay", dict);
		assertTrue(sugg.wordExists("cats"));
		assertTrue(sugg1.wordExists("like"));
		assertTrue(sugg2.wordExists("play"));
	}
	

	// ...

}
