package it.finnsolly;

import org.bukkit.Material;
import org.bukkit.configuration.Configuration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class CreateItem {

    CustomItemAPI plugin = CustomItemAPI.getInstance();

    MySQL mySQL = new MySQL();


    public CustomWeapon createSword(String itemID, String itemName, Material material, int itemRank, String itemClass, String lore, int maxLevel, int rarity, int attack, int magicAttack, int defense, int magicDefense, int requiredBaseStrength, int requiredBaseDexterity, int requiredBaseIntelligence, int requiredBaseWisdom, int strength, int dexterity, int intelligence, int wisdom, int accuracy, int criticalRate, int addedHealth, int addedMana, float dropRate, boolean tradable, int attackSpeed, String weaponType, String pngFileName) throws SQLException, IOException {
        mySQL.createSword(itemID, itemName, itemRank, itemClass, lore, maxLevel, rarity, attack, magicAttack, defense, magicDefense, requiredBaseStrength, requiredBaseDexterity, requiredBaseIntelligence, requiredBaseWisdom, strength, dexterity, intelligence, wisdom, accuracy, criticalRate, addedHealth, addedMana, dropRate, tradable, attackSpeed, weaponType);


        FileWriter fileWriter = new FileWriter(plugin.getSwords());
        File file = plugin.getSwords();
        file.set
        fileWriter.write("items.mysword.displayname." + itemName);
        fileWriter.write("items.mysword.permission." + itemName);
        fileWriter.write("items.mysword.resource.material." + material);
        fileWriter.write("items.mysword.resource.generate.true");

        fileWriter.close();

        return new CustomWeapon(itemID, itemName, itemRank, itemClass, lore, maxLevel, rarity, attack, magicAttack, defense, magicDefense, requiredBaseStrength, requiredBaseDexterity, requiredBaseIntelligence, requiredBaseWisdom, strength, dexterity, intelligence, wisdom, accuracy, criticalRate, addedHealth, addedMana, dropRate, tradable, attackSpeed, weaponType);


    }



}
