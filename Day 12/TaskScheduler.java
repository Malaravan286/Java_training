import java.util.*;
public class TaskScheduler { public static void main(String[] args) { Queue<String> tasks = new LinkedList<>(); tasks.offer("Check email"); tasks.offer("Write code"); tasks.offer("Submit report"); while (!tasks.isEmpty()) System.out.println("Doing task: " + tasks.poll()); } }
