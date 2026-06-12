import java.util.Scanner;

public class MediaPlayerApplication {
    interface Playable {
        void play(String value);
    }

    static class AudioPlayer implements Playable {
        public void play(String value) {
            System.out.println("Playing audio file " + value);
        }
    }

    static class VideoPlayer implements Playable {
        public void play(String value) {
            System.out.println("Playing video file " + value);
        }
    }

    static class StreamingPlayer implements Playable {
        public void play(String value) {
            System.out.println("Streaming media file " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fileName: ");
        String fileName = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        Playable[] services = {new AudioPlayer(), new VideoPlayer(), new StreamingPlayer()};
        services[0].play(fileName);
        services[1].play(fileName);
        services[2].play(fileName);
        scanner.close();
    }
}
