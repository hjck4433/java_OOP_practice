package 성적파일읽고정렬;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class ScoreMain {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("d:/tmp/score.txt");
            //FileInputStream fis = new FileInputStream("c:/tmp/score.txt"); //노트북
            Scanner sc = new Scanner(fis);
            TreeSet<Student> stList = new TreeSet<>();
            while(sc.hasNextLine()) {
                String[] scoreList = sc.nextLine().split(" ");
                stList.add(new Student(scoreList[0],
                        Integer.parseInt(scoreList[1])
                                + Integer.parseInt(scoreList[2])
                                + Integer.parseInt(scoreList[3])));
                fis.close();
            }
            for(Student e : stList) System.out.println(e.getName() + " " + e.getScore());
        }catch (IOException e) {
            System.out.println("파일이 없습니다.");
        }
    }
}
class Student implements Comparable<Student>{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getScore() == o.getScore()) {
            return this.getName().compareTo(o.getName());
        }
        return o.getScore() - this.getScore();
    }
}