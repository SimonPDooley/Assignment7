package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<Object> myCustomList = new CustomArrayList<>();
		//Alter this number for how many elements you want to add to array
		final int elementAmount = 23;
		
		int elementNumber = 1;
		for (int i = 0; i < elementAmount; i++) {
			myCustomList.add("element " + elementNumber);
			elementNumber++;
		}
		myCustomList.add(5, 7);
		myCustomList.add(5, 7);
		myCustomList.add(5, 7);
		myCustomList.add(18, 66);
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
		
		myCustomList.remove(18);
		
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println(myCustomList.get(i));
		}
	}
}
