package homework.homework11;

public class Censor {
    public static String validate(String text) {
        String baseRegExp = "[Бб][Яя][Кк][Аа]";
        String censuredString = "{censured}";
        String startStringRegexp = "^" + baseRegExp;
        String middleStringRegexp = "[\\s]" + baseRegExp;

        return text.replaceAll(startStringRegexp, censuredString)
                   .replaceAll(middleStringRegexp, censuredString);
    }
}
