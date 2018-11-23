package design.patterns.builderpattern;

import java.util.Objects;

public abstract class AbstractLaptop {
    public enum Color{BLACK, GREY, RED, GREEN}
    public enum Size{SMALL, MEDIUM, LARGE}
    private final Size size;
    private final Color color;

     abstract static class Builder<T extends Builder<T>> {
         private Color color = Color.BLACK;
         private Size size = Size.MEDIUM;

         public T setColor(Color color) {
             this.color = Objects.requireNonNull(color);
             return self();
         }

         public T setSize(Size size) {
             this.size = Objects.requireNonNull(size);
             return self();
         }

         abstract AbstractLaptop build();

         protected abstract T self();
     }

    AbstractLaptop(Builder<?> builder) {
        this.size = builder.size;
        this.color = builder.color;
    }

    public Size getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }
}
