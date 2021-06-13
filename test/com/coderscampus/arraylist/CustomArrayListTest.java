package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_item_to_list() {
		
		CustomList<Object> customList = new CustomArrayList<>();
		
		customList.add(10);
		
		assertEquals(10, customList.get(0));
	}
	@Test
	void should_add_item_at_index_to_list() {
		
		CustomList<Object> customList = new CustomArrayList<>();
		
		customList.add(5, 9);
		
		assertEquals(9, customList.get(5));
	}
	
	@Test 
	void should_get_amount_actual_elements_in_list(){
		
		CustomList<Object> customList = new CustomArrayList<>();
		
		//adding 3 elements
		customList.add(5, 9);
		customList.add(5, 9);
		customList.add(5, 9);

		//checking that there is 3 elements in the list
		assertEquals(3, customList.getSize());
		
	}
	
	@Test 
	void should_remove_element_from_list(){
		
		CustomList<Object> customList = new CustomArrayList<>();
		
		customList.add(0);
		customList.add(1);
		customList.add(2);

		assertEquals(1, customList.get(1));
		
		customList.remove(1);
		
		assertNotEquals(1, customList.get(1));
	
	}
}
