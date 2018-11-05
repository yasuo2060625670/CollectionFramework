package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Comparator.ComparatorByLength;

public class CollectionsDemo_1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("asdf");
		list.add("ssd");
		list.add("xx");
		list.add("xx");
		list.add("xx");
		list.add("ascccdf");
		list.add("ghghr");
		Collections.sort(list);
		System.out.println(list);

//		mySort(list);
//		mySort_2(list,new ComparatorByLength());

//shuffleœ¥≈∆
		Collections.shuffle(list);
		System.out.println(list);

//replaceAll==set(indexOf(oldElement),newElements)
		Collections.replaceAll(list, "xx", "haha");
		System.out.println(list);

//binarySearch
		int index = Collections.binarySearch(list, "xx");
		System.out.println(index);

//max
		String str = Collections.max(list);
		System.out.println(str);
		String str2 = Collections.max(list, new ComparatorByLength());
		System.out.println(str2);

		System.out.println(list);

	}

	// ≈≈–Ú
	public static <T extends Comparable<? super T>> void mySort(List<T> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) > 0) {
//					T temp = list.get(j);
//					list.set(j, list.get(i));
//					list.set(i, temp);
					Collections.swap(list, i, j);
				}

			}
		}
	}
	// ÷∏∂®≈≈–Ú

	public static <T> void mySort_2(List<T> list, Comparator<? super T> comp) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (comp.compare(list.get(i), list.get(j)) > 0) {
					Collections.swap(list, i, j);
				}

			}
		}
	}

}
