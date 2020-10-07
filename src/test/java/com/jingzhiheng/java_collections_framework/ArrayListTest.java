package com.jingzhiheng.java_collections_framework;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayListTest {

    @Test
    void should_return_the_number_of_elements_in_an_array_list() {
        final ArrayList<Integer> integers = new ArrayList<>(10);
        assertEquals(0, integers.size());

        integers.add(28);
        assertEquals(1, integers.size());

        integers.add(1, 88);
        assertEquals(2, integers.size());
    }

    @Test
    void should_append_the_specified_element_to_the_end_of_an_array_list() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Volvo");

        assertEquals(3, cars.size());
        assertEquals("BMW", cars.get(0));
        assertEquals("Ford", cars.toArray()[1]);
        assertEquals("Volvo", cars.get(2));
    }
}
