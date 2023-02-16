import java.util.Random;
public class ServerNameGenerator {
    //Exercise #2: Server Name Generator
    public static String [] adjectives = {"fumbling","standing","unbecoming","prickly","wacky","marvelous","broken","questionable","private","coordinated"};
    public static String [] nouns ={"movie","competition","finding","recipe","suggestion","effort","mode","growth","establishment","republic"};

    private static Random randomStr = new Random();
    public static String getRandomElement(String[] array) {
        return array[randomStr.nextInt(array.length)];
    }
    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);
        String adjectivePlusNoun = String.format("Here is your randomly generated server name:\n%s-%s", adjective, noun );
        System.out.println(adjectivePlusNoun);
    }
}
