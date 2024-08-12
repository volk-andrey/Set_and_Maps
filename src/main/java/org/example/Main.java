package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> nums = new ArrayList<>(List.of(113, 45, 67, 23, 89, 12, 34, 56, 78, 91, 22, 14, 99, 38, 72, 88, 53, 68, 27, 41, 5, 63, 32, 74, 29, 85, 4, 35, 60, 76, 8, 30, 15, 94, 57, 17, 39, 81, 83, 11, 2, 20, 78, 3, 70, 37, 67, 50, 46, 95, 40, 90, 49, 73, 19, 36, 66, 7, 93, 1, 33, 16, 42, 84, 58, 100, 28, 75, 59, 43, 44, 61, 77, 24, 18, 86, 64, 86, 13, 48, 25, 9, 80, 65, 92, 62, 54, 71, 10, 94, 30, 39, 8, 88, 14, 25, 69, 52, 97, 12, 24, 11, 62, 17, 34, 53, 35, 75, 90, 95, 68, 78, 21, 92, 19, 75, 42, 56, 32, 25, 20, 7, 46, 87, 73, 66, 15, 5, 91, 16, 74, 82, 88, 99, 61, 52, 72, 44, 31, 51, 10, 40, 58, 84, 3, 14, 71, 47, 36, 41, 98, 84, 11, 34, 83, 9, 59, 22, 1, 86, 18, 57, 39, 99, 25, 97, 2, 32, 80, 26, 65, 89, 94));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("Task 2");
        List<Integer> numsList = new ArrayList<>(List.of(13, 45, 67, 23, 89, 12, 34, 56, 78, 91, 22, 14, 99, 38, 72, 88, 53, 68, 27, 41, 5, 63, 32, 74, 29, 85, 4, 35, 60, 76, 8, 30, 15, 94, 57, 17, 39, 81, 83, 11, 2, 20, 78, 3, 70, 37, 67, 50, 46, 95, 40, 90, 49, 73, 19, 36, 66, 7, 93, 1, 33, 16, 42, 84, 58, 100, 28, 75, 59, 43, 44, 61, 77, 24, 18, 86, 64, 86, 13, 48, 25, 9, 80, 65, 92, 62, 54, 71, 10, 94, 30, 39, 8, 88, 14, 25, 69, 52, 97, 12, 24, 11, 62, 17, 34, 53, 35, 75, 90, 95, 68, 78, 21, 92, 19, 75, 42, 56, 32, 25, 20, 7, 46, 87, 73, 66, 15, 5, 91, 16, 74, 82, 88, 99, 61, 52, 72, 44, 31, 51, 10, 40, 58, 84, 3, 14, 71, 47, 36, 41, 98, 84, 11, 34, 83, 9, 59, 22, 1, 86, 18, 57, 39, 99, 25, 97, 2, 32, 80, 26, 65, 89, 94));
        Set<Integer> setList = new HashSet<>();
        for (Integer num : numsList) {
            if (num % 2 == 0){
                setList.add(num);
            }
        }
        List<Integer> evenNumbers= new ArrayList<>(setList);
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers.toString());

        System.out.println("Task 3");
        List<String> words = new ArrayList<>(List.of("яблоко", "груша", "банан", "апельсин", "виноград", "лимон", "клубника", "груша", "ананас", "персик", "малина", "банан", "арбуз", "вишня", "ежевика", "лимон", "манго", "папайя", "виноград", "черешня"));
        Set<String> setWords = new HashSet<>();
        for (String word : words) {
            setWords.add(word);
        }
        System.out.println(setWords.toString());

        System.out.println("Task 4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> hashMap = new HashMap<>();
        for (String string : strings) {
            if (!hashMap.containsKey(string)){
                hashMap.put(string, 1);
            } else {
                hashMap.put(string, hashMap.get(string) + 1);
            }
        }
        System.out.println(hashMap.values());
    }
}