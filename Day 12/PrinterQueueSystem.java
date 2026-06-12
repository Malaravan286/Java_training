import java.util.*;
public class PrinterQueueSystem { public static void main(String[] args) { Queue<String> printQueue = new LinkedList<>(); printQueue.offer("Resume.pdf"); printQueue.offer("Report.docx"); printQueue.offer("Invoice.xlsx"); while (!printQueue.isEmpty()) System.out.println("Printing " + printQueue.poll()); } }
