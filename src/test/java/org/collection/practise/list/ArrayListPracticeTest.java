package org.collection.practise.list;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ArrayListPracticeTest {

    @Test
    public void getElementWhenGetNull() {
        ArrayListPractice arl = new ArrayListPractice();
        List<String> list = new ArrayList<>();
        String result = arl.getElement(list);
        String expected = "";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void getElementWhenGetFirstElement() {
        ArrayListPractice arl = new ArrayListPractice();
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        String result = arl.getElement(list);
        String expected = "first";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void addNewElementWhenAdd() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ArrayListPractice.addNewElement(list, "fourth");
        assertThat(result).isTrue();
    }
    @Test
    public void addNewElementTrue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ArrayListPractice.addNewElementWithNoDuplicate(list, 1, "fourth");
        assertThat(result).isTrue();
    }

    @Test
    public void addNewElementFalse() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ArrayListPractice.addNewElementWithNoDuplicate(list, 1, "second");
        assertThat(result).isFalse();
    }

    @Test
    public void checkListTrue() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ArrayListPractice.checkList(list, "second");
        assertThat(result).isTrue();
    }

    @Test
    public void checkListFalse() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("second");
        list.add("fourth");
        boolean result = ArrayListPractice.checkList(list, "second");
        assertThat(result).isFalse();
    }

    @Test
    public void checkListNoContainsElement() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        boolean result = ArrayListPractice.checkList(list, "fourth");
        assertThat(result).isFalse();
    }

    @Test
    public void changePosition() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        int index = 3;
        List<String> result = ArrayListPractice.changePosition(list, index);
        assertThat(result.size()).isEqualTo(8);
        assertThat(result.get(index)).isEqualTo("nine");
    }

    @Test
    public void changePositionNone() {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        int index = 20;
        List<String> result = ArrayListPractice.changePosition(list, index);
        assertThat(result.size()).isEqualTo(8);
        assertThat(result.contains("nine")).isFalse();
    }

    @Test
    public void containsElement() {
        List<String> left = new ArrayList<>();
        left.add("first");
        left.add("second");
        left.add("third");
        List<String> right = new ArrayList<>();
        right.add("fourth");
        right.add("second");
        right.add("fifth");
        String check = "second";
        int result = ArrayListPractice.containsElement(left, right, check);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void containsElementInFirstList() {
        List<String> left = new ArrayList<>();
        left.add("first");
        left.add("second");
        left.add("third");
        List<String> right = new ArrayList<>();
        right.add("fourth");
        right.add("fifth");
        String check = "second";
        int result = ArrayListPractice.containsElement(left, right, check);
        assertThat(result).isEqualTo(1);
    }
}