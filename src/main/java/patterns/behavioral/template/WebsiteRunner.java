package patterns.behavioral.template;

public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcome = new Welcome();
        WebsiteTemplate newsPage = new NewsPage();

        welcome.showPage();
        System.out.println("\n==================================================\n");
        newsPage.showPage();
    }
}
