package ru.lymar;

import java.util.ArrayList;
import java.util.List;

public enum Values {

    A('A'),
    C2('2'),
    C3('3'),
    C4('4'),
    C5('5'),
    C6('6'),
    C7('7'),
    C8('8'),
    C9('9'),
    T('T'),
    J('J'),
    Q('Q'),
    K('K');

    char value;

    Values(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public static List<Character> getValues() {
        return new ArrayList<Character>(){{
            for (Values v : values()) {
                add(v.value);
            }
        }};
    }
}
