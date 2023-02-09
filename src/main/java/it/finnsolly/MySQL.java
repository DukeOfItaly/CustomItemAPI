package it.finnsolly;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL {

    Main plugin = Main.getInstance();
    DataSource dataSource = plugin.getDataSource();


    public void setValues() {
        plugin.getConfig().set("host", "localhost");
        plugin.getConfig().set("port", 80);
        plugin.getConfig().set("username", "root");
        plugin.getConfig().set("password", "root");
        plugin.getConfig().set("database", "test");
        plugin.saveConfig();
    }

    String host = plugin.getConfig().getString("host");
    int port = plugin.getConfig().getInt("port");
    String password = plugin.getConfig().getString("password");
    String username = plugin.getConfig().getString("username");
    String database = plugin.getConfig().getString("database");


    public DataSource initMySQLDataSource() throws SQLException{
        MysqlDataSource dataSource = new MysqlConnectionPoolDataSource();
        dataSource.setServerName(host);
        dataSource.setPortNumber(port);
        dataSource.setDatabaseName(database);
        dataSource.setUser(username);
        dataSource.setPassword(password);
        testConnection(dataSource);
        return dataSource;
    }


    private void testConnection(DataSource dataSource) throws SQLException {
        try(Connection conn = dataSource.getConnection()) {
            if(!conn.isValid(1)) {
                throw new SQLException(" Could not establish database connection.");
            }
        }
    }

    public void createSword(String itemID, String itemName, int itemRank, String itemClass, String lore, int maxLevel, int rarity, int attack, int magicAttack, int defense, int magicDefense, int requiredBaseStrength, int requiredBaseDexterity, int requiredBaseIntelligence, int requiredBaseWisdom, int strength, int dexterity, int intelligence, int wisdom, int accuracy, int criticalRate, int addedHealth, int addedMana, float dropRate, boolean tradable, int attackSpeed, String weaponType) throws SQLException {
        String sql = "INSERT INTO items VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = dataSource.getConnection().prepareStatement(sql);
        preparedStatement.setString(1, itemID);
        preparedStatement.setString(2, itemName);
        preparedStatement.setInt(3, itemRank);
        preparedStatement.setString(4, itemClass);
        preparedStatement.setString(5, lore);
        preparedStatement.setInt(6, maxLevel);
        preparedStatement.setInt(7, rarity);
        preparedStatement.setInt(8, attack);
        preparedStatement.setInt(9, magicAttack);
        preparedStatement.setInt(10, defense);
        preparedStatement.setInt(11, magicDefense);
        preparedStatement.setInt(12, requiredBaseStrength);
        preparedStatement.setInt(13, requiredBaseDexterity);
        preparedStatement.setInt(14, requiredBaseIntelligence);
        preparedStatement.setInt(15, requiredBaseWisdom);
        preparedStatement.setInt(16, strength);
        preparedStatement.setInt(17, dexterity);
        preparedStatement.setInt(18, intelligence);
        preparedStatement.setInt(19, wisdom);
        preparedStatement.setInt(20,accuracy);
        preparedStatement.setInt(21, criticalRate);
        preparedStatement.setInt(22, addedHealth);
        preparedStatement.setInt(23, addedMana);
        preparedStatement.setFloat(24, dropRate);
        preparedStatement.setBoolean(25, tradable);
        preparedStatement.setInt(26, attackSpeed);
        preparedStatement.setString(27, weaponType);
        preparedStatement.executeUpdate();
    }



}
