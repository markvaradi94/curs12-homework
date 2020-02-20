package ro.fasttrackit.curs12.homework.exercise1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student mark = new Student("Mark", 8);
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put(mark.getName(), mark.getGrade());
        System.out.println(studentMap);
        Student renata = new Student("Renata", 10);
        Student eduard = new Student("Eduard", 7);
        Student robert = new Student("Robert", 9);
        Student clara = new Student("Clara", 8);
        Student gheorghe = new Student("Gheorghe", 6);
        studentMap.put(renata.getName(), renata.getGrade());
        studentMap.put(eduard.getName(), eduard.getGrade());
        studentMap.put(robert.getName(), robert.getGrade());
        studentMap.put(clara.getName(), clara.getGrade());
        studentMap.put(gheorghe.getName(), gheorghe.getGrade());
        System.out.println(getMapMaxGrade(studentMap));

    }

    public static String getMapMaxGrade(Map<String, Integer> studentMap) {
        String result = "";
        int maxGrade = Collections.max(studentMap.values());
        for (String key : studentMap.keySet()) {
            if (studentMap.get(key) == maxGrade) {
                result = key + " = " + studentMap.get(key).toString();
            }
        }
        return result;
    }
}
