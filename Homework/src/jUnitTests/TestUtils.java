package jUnitTests;
/*
 * Copy from http://www.javaworld.com/article/2073056/swing-gui-programming/automate-gui-tests-for-swing-applications.html
 */

import java.awt.Component;
import java.awt.Container;


public class TestUtils {
	public static Component getChildNamed(Component children2, String name) {

		// Debug line
		// System.out.println("Class: " + parent.getClass() +
		// " Name: " + parent.getName());

		if (name.equals(children2.getName())) {
			return children2;
		}

		if (children2 instanceof Container) {
			Component[] children = ((Container) children2).getComponents();

			for (int i = 0; i < children.length; ++i) {
				Component child = getChildNamed(children[i], name);
				if (child != null) {
					return child;
				}
			}
		}

		return null;
	}

}
