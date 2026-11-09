import java.util.Map;

class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.isEmpty()) {
            return identifier;
        }

        char[] charArray = identifier.toCharArray();
        StringBuilder builder = new StringBuilder();
        Map<Character, Character> leet = Map.of('0', 'o', '1', 'l', '3', 'e', '4', 'a', '7', 't');

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i])) {
                charArray[i] = '_';
                builder.append(charArray[i]);
            }
            else if (Character.isLetter(charArray[i])) {
                builder.append(charArray[i]);
            }
                
            else if (charArray[i] == '-' && i < charArray.length - 1) {
                charArray[i + 1] = Character.toUpperCase(charArray[i + 1]);
            }
                
            else if (Character.isDigit(charArray[i])) {
                builder.append(leet.get(charArray[i]));
            } 
        }
        
        return builder.toString();
    }
}
