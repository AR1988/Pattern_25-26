package builder;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class PatternBuilderMain {

    public static void main(String[] args) {
        Coffee coffee = new Coffee.Builder("Капучино")
                .sugar(1)
                .sugar(2)
                .sugar(3)
                .sugar(70)
//                .milk(1)
                .build();

        System.out.println(coffee);
    }
}
