package com.example.testingtesting123

import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }

    //Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        val originalSize = collection.size()
        collection.addItem(Item("item1"))
        val newSize = collection.size()
        assert(newSize == originalSize + 1 && collection.get(newSize - 1).name == "item1") {"Item not added"}

    }

    // Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        val originalSize = collection.size()

        collection.addItem(Item("item1"))
        collection.addItem(Item("item1"))

        assert(collection.size() == originalSize) {"Duplicate items added"}


    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size();

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}