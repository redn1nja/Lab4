package mechanics;
import lombok.SneakyThrows;
import lotr.*;
import lotr.Character;
import org.reflections.Reflections;
//import org.reflections.scanners.Scanners;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;
import static org.reflections.scanners.Scanners.SubTypes;
import java.util.Random;

public class CharacterFactory {
    @SneakyThrows
    Character createCharacter()  {
        Random rand = new Random();
        Reflections reflections = new Reflections("lotr");
        Set<Class<?>> choices = reflections.get(SubTypes.of(Character.class).asClass());
        choices.remove(Noble.class);
        Object[] vars = choices.toArray();
        Class randCls = (Class) vars[rand.nextInt(vars.length)];
        Constructor constr = randCls.getConstructor();
        Character toReturn = (Character) constr.newInstance();
        return toReturn;
    }
}
