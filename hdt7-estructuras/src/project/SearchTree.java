package project;

import java.util.Comparator;

public class SearchTree <K,V> {
	private int count;
	private Node<K,V> root;
	private Comparator<K> KeyComparator;
	
	public SearchTree(Comparator<K> KeyComparator) {
		this.KeyComparator = KeyComparator;
	}
}
