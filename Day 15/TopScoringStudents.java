import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class ScoreStudent {
    private String name;
    private int score;

    ScoreStudent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return name + " - " + score;
    }
}

public class TopScoringStudents {
    public static void main(String[] args) {
        List<ScoreStudent> students = Arrays.asList(
                new ScoreStudent("Anu", 88),
                new ScoreStudent("Bala", 95),
                new ScoreStudent("Charu", 91),
                new ScoreStudent("David", 76),
                new ScoreStudent("Esha", 99)
        );

        List<ScoreStudent> topStudents = students.stream()
                .sorted(Comparator.comparingInt(ScoreStudent::getScore).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 scoring students:");
        topStudents.forEach(System.out::println);
    }
}
