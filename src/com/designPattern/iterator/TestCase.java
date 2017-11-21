package com.designPattern.iterator;

import org.junit.Test;

public class TestCase {

	@Test
	public void test() {

		ICollection<String> collection = new MyCollection<String>();
		collection.add("A");
		collection.add("B");
		collection.add("C");
		collection.add("D");
		collection.add("F");
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
