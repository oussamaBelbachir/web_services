import proxy.BanqueService;
import proxy.BanqueWS;

import java.util.Arrays;

public class ClientJWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort(); // middleware
        System.out.println(Arrays.toString(stub.listComptes().toArray()));
    }
}
