import java.util.Locale;
public class LocalizationDemo {
   public static void main(String[] args) {
    /*Locale obj = new Locale("en", "US");
    System.out.println("Language we want to get here" + " " + obj.getLanguage());
    */
    /*Locale local = Locale.forLanguageTag("ja-JP-u-ca-japanese"); // Here Japanese Language is given.
    System.out.println("Our Language is  " + local.getLanguage());
    */

    Locale ln = new Locale.Builder().setLanguage("zh").setRegion("CN").build();
    Locale l1 = new Locale("fr");
    Locale l2 = new Locale("ja", "JP");
    Locale l3 = Locale.KOREA;
    Locale l4 = Locale.forLanguageTag("en-IN");
    //Locale obj = new Locale("en", "GB");
// String getVariant() Here We go the particular region.
    /*System.out.println(l3.getCountry());
    System.out.println(ln.getDisplayCountry());
    System.out.println(l1.getDisplayName());
    System.out.println(l4.getDisplayCountry());
     //Locale.getAvailableLocales() we can find out all the available locale. 
    /* /* */
    System.out.println(ln.getDisplayName());
   } 
}
