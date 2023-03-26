package project;

import java.security.Key;
import java.util.Comparator;

public class SearchTree <K,V> {
	private int count;
	private Node<K,V> root;
	private Comparator<K> KeyComparator;
	
	public SearchTree(Comparator<K> KeyComparator) {
		this.KeyComparator = KeyComparator;
		root = null;
		count = 0;
	}
	
	public V internalSearch(Node<K,V> toSearch, K id) {
		if (toSearch != null) {
			int resutl = KeyComparator.compare(toSearch.getKey(), id);
		}
		return null;
	}
}
