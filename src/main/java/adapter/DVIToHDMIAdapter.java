package adapter;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class DVIToHDMIAdapter implements HDMIPort {

    private DVIPort dviPort;

    public DVIToHDMIAdapter(DVIPort dviPort) {
        this.dviPort = dviPort;
    }

    @Override
    public void connect() {
        System.out.println("Соединено с помощью адаптера DVI -> HDMI");
        dviPort.connect();
    }
}
