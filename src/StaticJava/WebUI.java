package StaticJava;

public class WebUI {
    public static void opendURL(String url){
        System.out.println(url);
    }

    public static void clickElement(String elementName){
        System.out.println("Click Element: " + elementName);
    }

    public static void setText(String text) {
        System.out.println("Set text: " +text);
    }

    public static String getElementText(String elementName) {
        return "text";
    }

    public static void main(String[] args) {
        opendURL("https://stg.247tech.xyz/");
        setText("abc@gmail.com");
        setText("123456");
        clickElement("Login button");
    }

}
