package faistoncine.org.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import faistoncine.org.service.SpamDetector;

public class SpamDetectorTest {

	@Test
	public final void testSpamDetector1() {
		String comment = "You fucker DIE now shitty moron";
		String expected =  "Forbidden Word !";
		
		String actual = SpamDetector.spamDetector(comment);
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testSpamDetector2() {
		String comment = "lol lol lol lol lol lol lol lol lol lol lol";
		String expected =  "Spam !";
		
		String actual = SpamDetector.spamDetector(comment);
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testSpamDetector3() {
		String comment = "lyyyyyyyyyyyyyyyyyyyyyyfgdddddddddddddddddddddddddddddddddddufdfghgfghl";
		String expected =  "Too long !";
		
		String actual = SpamDetector.spamDetector(comment);
		assertEquals(expected, actual);
	}

	/*@Test
	public final void testObject() {
		fail("Not yet implemented");
	}

	@Test
	public final void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	public final void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public final void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public final void testClone() {
		fail("Not yet implemented");
	}

	@Test
	public final void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public final void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	public final void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	public final void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	public final void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	public final void testWait() {
		fail("Not yet implemented");
	}

	@Test
	public final void testFinalize() {
		fail("Not yet implemented");
	}*/

}
