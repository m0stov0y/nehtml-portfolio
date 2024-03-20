// Pencil.java
public class Pencil extends WritingImplement implements Erasable {
    // Код класу Pencil з попередньої лабораторної роботи

    @Override
    public void erase(StringBuilder stringBuilder) {
        if (stringBuilder.length() > 0) {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}