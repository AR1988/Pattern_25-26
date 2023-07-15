package adapter;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        DVIPort displayWithDviPort = new Display();

        DVIToHDMIAdapter adapter = new DVIToHDMIAdapter(displayWithDviPort);

        computer.connectDisplay(adapter);

        System.out.println(computer);
    }
}
