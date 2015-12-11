package jUnitTests;
/*
 * Copy from http://www.javaworld.com/article/2073056/swing-gui-programming/automate-gui-tests-for-swing-applications.html
 */
import static org.junit.Assert.*;

import java.awt.Component;

import javax.swing.JTextField;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoneyInputScreenTest {
	Test test;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testUserInput() {String testString = "2";

	assertNotNull(test);

	JTextField input = (JTextField) TestUtils.getChildNamed(
			(Component) test, "input");
	assertNotNull(input);

	input.setText(testString);
	input.postActionEvent();

	assertEquals(testString + "?", input.getText());
}

}