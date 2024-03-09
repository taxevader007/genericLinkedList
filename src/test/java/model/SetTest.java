package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Set set;

    @Test
    public void testAdd() {
        Set<Integer> set = new Set<>();
        set.add(1);
        set.add(2);
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertEquals(2, set.size());
    }

    @Test
    public void testRemove() {
        Set<Integer> set = new Set<>();
        set.add(1);
        set.add(2);
        set.remove(1);
        assertFalse(set.contains(1));
        assertTrue(set.contains(2));
        assertEquals(1, set.size());
    }

    @Test
    public void testUnion() {
        Set<Integer> set1 = new Set<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new Set<>();
        set2.add(2);
        set2.add(3);
        Set<Integer> unionSet = set1.union(set2);
        assertTrue(unionSet.contains(1));
        assertTrue(unionSet.contains(2));
        assertTrue(unionSet.contains(3));
        assertEquals(3, unionSet.size());
        assertFalse(unionSet.contains(4));
    }

    @Test
    public void testIntersection() {
        Set<Integer> set1 = new Set<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new Set<>();
        set2.add(2);
        set2.add(3);
        Set<Integer> intersectionSet = set1.intersection(set2);
        assertFalse(intersectionSet.contains(1));
        assertTrue(intersectionSet.contains(2));
        assertFalse(intersectionSet.contains(3));
        assertEquals(1, intersectionSet.size());
    }

    @Test
    public void testDifference(){
        Set<Integer> set1 = new Set<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new Set<>();
        set2.add(2);
        set2.add(3);
        Set<Integer> differenceSet = set1.difference(set2);
        assertTrue(differenceSet.contains(1));
        assertFalse(differenceSet.contains(2));
        assertFalse(differenceSet.contains(3));
        assertEquals(1, differenceSet.size());

    }

    @Test
    public void testcomposicion(){
        Set<Integer> set1 = new Set<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new Set<>();
        set2.add(2);
        set2.add(3);
        Set<Integer> unionSet = set1.union(set2);
        Set<Integer> intersectionSet = set1.intersection(set2);
        Set<Integer> differenceSet = set1.difference(set2);
        assertTrue(unionSet.contains(1));
        assertTrue(unionSet.contains(2));
        assertTrue(unionSet.contains(3));
        assertFalse(intersectionSet.contains(1));
        assertTrue(intersectionSet.contains(2));
        assertFalse(intersectionSet.contains(3));
        assertTrue(differenceSet.contains(1));
        assertFalse(differenceSet.contains(2));
        assertFalse(differenceSet.contains(3));
        assertEquals(3, unionSet.size());

    }
    //TODO review is empty
    @Test
    public void testIsEmpty() {
        Set<Integer> set = new Set<>();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
        assertEquals(1, set.size());
    }

    @Test
    public void testmostSize(){
        Set<Integer> set = new Set<>();
        set.add(1);
        set.add(2);
        Set<Integer> set2 = new Set <>();
        set2.add(3);
        assertEquals(2, set.size());

        assertTrue(set.mostSize(set, set2) == set.size());

        assertFalse(set.mostSize(set, set2) == set2.size());

    }


    @Test
    public void testlessSize(){
        Set<Integer> set = new Set<>();
        set.add(1);
        set.add(2);
        Set<Integer> set2 = new Set <>();
        set2.add(3);
        assertEquals(2, set.size());

        assertTrue(set.lessSize(set, set2) == set2.size());

        assertFalse(set.lessSize(set,set2)== set.size() );

        assertEquals(1, set2.size());
    }



}
