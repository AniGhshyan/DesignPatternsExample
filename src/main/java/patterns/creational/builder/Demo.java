package patterns.creational.builder;

public class Demo {
    public static void main(String[] args) {

//        String hello = "hello";
//        System.out.println("<p>" + hello + "</p>");
//        String[] strings = {"hello", "world"};
//        StringBuilder sb = new StringBuilder();
//        sb.append("<ul>\n");
//        for (String string : strings) {
//            sb.append(String.format(" <li>%s</li>\n", string));
//        }
//        sb.append("</ul>");
//        System.out.println(sb);

        HtmlBuilder builder = new HtmlBuilder("ul");
        builder
                .addChild("li", "hello")
                .addChild("li", "world");
        System.out.println(builder);
        EmployeeBuilder pb = new EmployeeBuilder();
        Person poxos = pb
                .withName("Poxos")
                .worksAt("Developer")
                .build();
        System.out.println(poxos);
    }
}
