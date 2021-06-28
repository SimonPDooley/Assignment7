package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {
	
	@Test
	void should_add_item_to_list() {
		
		CustomList<Object> sut = new CustomArrayList<>();
		
		sut.add(10);
		
		assertEquals(10, sut.get(0));
	}
	
	@Test
	void shoud_add_1000000_items_to_list() {
		
		CustomList<Object> sut = new CustomArrayList<>();
		

		for (int i=1; i<=1000000; i++) {
			sut.add(i);
		}
		for(int i=0; i<1000000; i++) {
			assertEquals(i+1, sut.get(i));
		}
		
		
		assertEquals(1000000, sut.getSize());
		
	}
	
	@Test
	void should_add_item_at_index_to_list() {
		
		CustomList<Object> sut = new CustomArrayList<>();
		
		sut.add(5, 9);
		
		assertEquals(9, sut.get(5));	

	}
	
	@Test 
	void should_move_items_to_right_after_adding(){
		
		CustomList<Object> sut = new CustomArrayList<>();
		//add 6 elements
		sut.add(1); sut.add(2); sut.add(3);
		sut.add(4); sut.add(5); sut.add(6);
		
		for(int i=0; i<6; i++) {
			assertEquals(i+1, sut.get(i));
		}
		//add element at 0 index
		sut.add(0,10);
		assertEquals(10, sut.get(0));
		//check that all elements are moved to the right by 1
		for(int i=1; i<7; i++) {
			assertEquals(i, sut.get(i));
		}

	}
	
	@Test 
	void should_get_amount_actual_elements_in_list(){
		
		CustomList<Object> sut = new CustomArrayList<>();
		
		//adding 3 elements
		sut.add(5, 9);
		sut.add(5, 9);
		sut.add(5, 9);

		//checking that there is 3 elements in the list
		assertEquals(3, sut.getSize());
		
	}
	
	@Test 
	void should_remove_element_from_list(){
		
		CustomList<Object> sut = new CustomArrayList<>();
		
		sut.add(0);
		sut.add(1);
		sut.add(2);

		assertEquals(1, sut.get(1));
		
		sut.remove(1);
		
		assertNotEquals(1, sut.get(1));
	}
	
	@Test 
	void should_move_items_to_left_after_removing(){
		CustomList<Object> sut = new CustomArrayList<>();
		//add 6 elements
		sut.add(1); sut.add(2); sut.add(3);
		sut.add(4); sut.add(5); sut.add(6);
		
		for(int i=0; i<6; i++) {
			assertEquals(i+1, sut.get(i));
		}
		//remove element at 0 index
		sut.remove(0);
		assertEquals(2, sut.get(0));
		//check that all elements are moved to the left by 1
		for(int i=1; i<5; i++) {
			assertEquals(i+2, sut.get(i));
		}
	}
}
