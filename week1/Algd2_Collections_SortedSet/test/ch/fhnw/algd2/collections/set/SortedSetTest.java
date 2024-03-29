//package ch.fhnw.algd2.collections.set;
//
//import static org.junit.Assert.assertFalse;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
//import java.util.List;
//
//import org.junit.Test;
//
//import ch.fhnw.algd2.collections.MyAbstractCollection2;
//
//public class SortedSetTest extends AbstractSetTest {
//
//	@Override
//	protected MyAbstractCollection2<Integer> createIntegerCollection(int size) {
//		return new SortedSet<Integer>(size);
//	}
//
//	@Override
//	protected Integer[] getExpectedOrderFor(Integer[] values) {
//
//		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(values));
//		List<Integer> list = new LinkedList<Integer>(set);
//		Collections.sort(list);
//		Integer[] elements = new Integer[list.size()];
//		int index = 0;
//		for (Integer element : list) {
//			elements[index++] = element;
//		}
//		return elements;
//	}
//
//	@Test(expected=ClassCastException.class)
//	public void containsOtherObject() {
//		Integer[] numbers = new Integer[] { 1, 2, 3 };
//		addNumbersToBag(numbers);
//		assertFalse(bag.contains("Asdf"));
//	}
//
//}
