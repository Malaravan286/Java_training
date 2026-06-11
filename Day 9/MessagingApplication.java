interface MessageService {
    void sendMessage(String receiver, String message);
}

class TextMessageService implements MessageService {
    public void sendMessage(String receiver, String message) {
        System.out.println("Text message to " + receiver + ": " + message);
    }
}

class VoiceMessageService implements MessageService {
    public void sendMessage(String receiver, String message) {
        System.out.println("Voice message to " + receiver + ": " + message);
    }
}

class VideoMessageService implements MessageService {
    public void sendMessage(String receiver, String message) {
        System.out.println("Video message to " + receiver + ": " + message);
    }
}

public class MessagingApplication {
    public static void main(String[] args) {
        MessageService[] services = {
            new TextMessageService(),
            new VoiceMessageService(),
            new VideoMessageService()
        };

        for (MessageService service : services) {
            service.sendMessage("Anu", "Meeting at 5 PM");
        }
    }
}
