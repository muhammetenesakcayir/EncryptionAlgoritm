import java.util.HashMap;
import java.util.Map;

public class KeyMatch {

    private static final char DEFAULT_CHARACTER = 0;
    private static final Map<Character,Character> KEY_MATCH_MAP = new HashMap<Character,Character>(){{
            put(' ','1');
            put('!','g');
            put('"','q');
            put('#','T');
            put('$','h');
            put('%','b');
            put('&','I');
            put('\'','F');
            put('(','M');
            put(')','y');
            put('*','W');
            put('+',']');
            put(',','O');
            put('-',')');
            put('.','%');
            put('/','$');
            put('0','-');
            put('1','c');
            put('2','P');
            put('3','n');
            put('4','H');
            put('5','(');
            put('6','!');
            put('7','j');
            put('8','\\');
            put('9','V');
            put(':','z');
            put(';','t');
            put('<','k');
            put('=',' ');
            put('>','*');
            put('?','S');
            put('@','5');
            put('A','0');
            put('B','Y');
            put('C','r');
            put('D','@');
            put('E','.');
            put('F','\'');
            put('G','x');
            put('H','s');
            put('I','6');
            put('J','a');
            put('K','7');
            put('L','"');
            put('M','i');
            put('N','v');
            put('O','4');
            put('P','^');
            put('Q',',');
            put('R','m');
            put('S','>');
            put('T','N');
            put('U','[');
            put('V','z');
            put('W','L');
            put('X','2');
            put('Y','?');
            put('Z','C');
            put('[',';');
            put('\\','Q');
            put(']','3');
            put('^','E');
            put('_','f');
            put('a','+');
            put('b','d');
            put('c','#');
            put('d','e');
            put('e','D');
            put('f','/');
            put('g','R');
            put('h','&');
            put('i','9');
            put('j','A');
            put('k','P');
            put('l','X');
            put('m','G');
            put('n','U');
            put('o','w');
            put('p','u');
            put('q',':');
            put('r','8');
            put('s','K');
            put('t','_');
            put('u','o');
            put('v','=');
            put('w','l');
            put('x','J');
            put('y','B');
            put('z','<');
        }};

    public char getValue(char key){
        return KEY_MATCH_MAP.get(key);
    }

    public char getKey(char value){
        return KEY_MATCH_MAP.entrySet().stream()
                .filter(character -> character.getValue().equals(value))
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(DEFAULT_CHARACTER);
    }

}

