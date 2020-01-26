/**
 * 
 */
package edu.vt;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Dan Liu
 *
 */
public class SortTextTest {
	
	SortText sortText;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sortText=new SortText();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link edu.vt.SortText#filterString(java.lang.String)}.
	 */
	@Test
	public void testFilterString() {
		
		String text="";
		assertEquals("", sortText.filterString(text));
		
		text="3 Blind mice &!";
		
		assertEquals("Blindmice", sortText.filterString(text));
	}

	/**
	 * Test method for {@link edu.vt.SortText#sortStringCaseInsensitive(java.lang.String)}.
	 */
	@Test
	public void testSortStringCaseInsensitive() {
		
		String text="";
		
		assertEquals("", sortText.sortStringCaseInsensitive(text));
		
		text="3 Blind mice !";
		
		assertEquals("Bcdeiilmn", sortText.sortStringCaseInsensitive(text));
	
	}

}
