package packs;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Coin
{
    public String getValue()
    {
        List<String> face = new ArrayList<>();
        face.add("Heads");
        face.add("Tails");
        Collections.shuffle(face);
        return face.get(0);
    }
}