package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int itemsPosition = 0;

	int arraySize = items.length;

	@Override
	public boolean add(T item) {
		// If array is not full, add to this array
		if (items[arraySize - 1] == null) {
			items[itemsPosition] = item;
			itemsPosition++;
			return true;
			// If array is full create new array double in size
		} else {
			Object[] items2 = new Object[arraySize * 2];

			if (items[items.length - 1] != null) {
				arraySize = items2.length;
			}
			// Copy elements of old array to new array
			for (int i = 0; i < items.length; i++) {
				items2[i] = items[i];
			}
			items = items2;
			items2[itemsPosition] = item;
			itemsPosition++;
			return true;
		}
	}

	@Override
	public int getSize() {
		int listSize = 0;
		for(int i = 0; i<items.length; i++) {
			if(items[i] != null) {
				listSize++;
			}
		}
		return listSize;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		T currentObject = (T) items[index];
		return currentObject;
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		//Starting at the end of the list, move all items to the right after the index of the inserted element
		if (items.length > index) {
			for (int i = items.length-1; i > index; i--) {
				items[i] = items[i-1];
		}
		System.out.println(item + " at index " + index + " was added");
		items[index] = item;
		
		return true;
		}else {
			System.out.println("Index Out of bounds");
			return false;
		}
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		Object itemRemoved = items[index];
		//Starting at the index after where element is to be removed, move all elements to the left
		if (items.length >= index) {
			for (int i = index; i < items.length-1; i++) {
				items[i] = items[i+1];
		}
		System.out.println(itemRemoved +" at index " + index + " was removed");
		
		}else {
			System.out.println("Index Out of bounds");
		}
		return (T) itemRemoved;
	}

}
