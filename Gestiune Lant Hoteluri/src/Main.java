
import Services.Setup;
import Services.MainMenu;

import java.sql.*;

// TODO: inca un query complex ce incarca niste intrari (poate rezultate dintr-un join intre person si employees de ex)
// intr-un fisier text

public class Main {
    public static void main(String[] args) {
        try {
            Setup.get();
            MainMenu.get().run();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
