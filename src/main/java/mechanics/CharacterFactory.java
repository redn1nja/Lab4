package mechanics;
import lotr.*;
import lotr.Character;
import org.reflections.Reflections;
import java.util.Set;
import static org.reflections.scanners.Scanners.SubTypes;
import java.util.Random;

public class CharacterFactory {
    Character createCharacter(){
        Random rand = new Random();
        Reflections reflections = new Reflections();
        Set<Class<?>> choices = reflections.get(SubTypes.of(Character.class).asClass());
        choices.remove(Noble.class);
        Character[] variants = (Character[]) choices.toArray();
        return variants[rand.nextInt(variants.length)];

    }
}
