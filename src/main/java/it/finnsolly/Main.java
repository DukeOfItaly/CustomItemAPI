package it.finnsolly;

import org.bukkit.plugin.java.JavaPlugin;

import javax.sql.DataSource;
import java.io.File;
import java.sql.SQLException;

public class Main extends JavaPlugin {

    private static Main instance;
    private DataSource dataSource;

    private File swords;


    public File getSwords() {
        return swords;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public static Main getInstance() {
        return instance;
    }

    public void onEnable() {

        instance = this;


        MySQL mySQL = new MySQL();
        swords = new File("contents/my_items/configs/swords.yml");
        this.saveDefaultConfig();
        if(!getDataFolder().exists()) {
            mySQL.setValues();
        }

        try {
            dataSource = mySQL.initMySQLDataSource();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }





        System.out.println("[CustomItemAPI] CustomItemAPI was enabled!");

    }

}
