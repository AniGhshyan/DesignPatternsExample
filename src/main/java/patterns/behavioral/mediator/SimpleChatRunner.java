package patterns.behavioral.mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat=new SimpleTextChat();
        User admin=new Admin(chat,"Admin");
        User user1=new SimpleUser(chat,"user1");
        User user2=new SimpleUser(chat,"user2");


        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("Hello, my name is user1");
        admin.sendMessage("Hello, i am admin");
    }
}
