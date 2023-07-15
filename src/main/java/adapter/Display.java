package adapter;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class Display implements DVIPort {

    @Override
    public void connect() {
        System.out.println("Соединен по DVI");
    }
}
