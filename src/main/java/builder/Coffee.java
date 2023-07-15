package builder;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class Coffee {

    private final String type;
    private Integer milk;
    private Integer sugar;

    private Coffee(Builder builder) {
        this.type = builder.type;
        this.milk = builder.milk;
        this.sugar = builder.sugar;
    }


    public static class Builder {
        private String type;
        private Integer milk;
        private Integer sugar;

        public Builder(String type) {
            this.type = type;
        }

//        public Builder type(String type) {
//            this.type = type;
//            return this;
//        }

        public Builder milk(Integer milk) {
            this.milk = milk;
            return this;
        }

        public Builder sugar(Integer sugar) {
            this.sugar = sugar;
            return this;
        }

        public Coffee build() {
//            if (type == null) {
//                throw new IllegalArgumentException("Тип кофе не установлен");
//            }
            return new Coffee(this);
        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", milk=" + milk +
                ", sugar=" + sugar +
                '}';
    }
}
