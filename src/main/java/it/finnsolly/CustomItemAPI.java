package it.finnsolly;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import javax.sql.DataSource;
import java.io.File;
import java.sql.SQLException;

public class CustomItemAPI extends JavaPlugin {

    private static CustomItemAPI instance;
    private DataSource dataSource;

    private File swords;


    public File getSwords() {
        return swords;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    CreateItem createItem;

    public CreateItem getCreateItem() {
        return createItem;
    }

    public static CustomItemAPI getInstance() {
        return instance;
    }

    Connector connector;

    public Connector getConnector() {
        return connector;
    }

    public void onEnable() {

        instance = this;

        connector = new Connector();
        Plugin plugin = Bukkit.getPluginManager().getPlugin("ItemsAdder");
        swords = new File(plugin.getDataFolder() + File.separator + "contents" + File.separator + "my_items" + File.separator + "swords.yml");
        this.saveDefaultConfig();
        if(!getDataFolder().exists()) {
            connector.setValues();
        }

        try {
            dataSource = connector.initMySQLDataSource();
            System.out.println("[CustomItemAPI] MySQL connection successfull.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        createItem = new CreateItem();
        this.getCommand("test").setExecutor(new TestCommand());






        System.out.println("[CustomItemAPI] CustomItemAPI was enabled!");

    }

}
