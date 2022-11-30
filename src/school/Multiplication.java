package school;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Multiplication {
    private final Set<Task> tasks = new HashSet<>();

    public Multiplication() {
        Random random = new Random();
        while (tasks.size() < 15) {
            tasks.add(new Task(random.nextInt(10) + 2, random.nextInt(10)+2 ));
        }
    }


    @Override
    public String toString() {
        return "Multiplication{" +
                "tasks=" + tasks +
                '}';
    }
}
