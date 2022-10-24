package patterns.creational.builder.suleymanov;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriseWebSiteBuilder());
        WebSite webSite = director.buildWebSite();
        System.out.println(webSite);
    }
}
