package it.finnsolly;

import org.bukkit.Material;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class CreateItem {

    MySQL mySQL = new MySQL();
    Main plugin = Main.getInstance();

    public CustomWeapon createSword(String itemID, String itemName, Material material, int itemRank, String itemClass, String lore, int maxLevel, int rarity, int attack, int magicAttack, int defense, int magicDefense, int requiredBaseStrength, int requiredBaseDexterity, int requiredBaseIntelligence, int requiredBaseWisdom, int strength, int dexterity, int intelligence, int wisdom, int accuracy, int criticalRate, int addedHealth, int addedMana, float dropRate, boolean tradable, int attackSpeed, String weaponType, String pngFileName) throws SQLException, IOException {
        mySQL.createSword(itemID, itemName, itemRank, itemClass, lore, maxLevel, rarity, attack, magicAttack, defense, magicDefense, requiredBaseStrength, requiredBaseDexterity, requiredBaseIntelligence, requiredBaseWisdom, strength, dexterity, intelligence, wisdom, accuracy, criticalRate, addedHealth, addedMana, dropRate, tradable, attackSpeed, weaponType);


        FileWriter fileWriter = new FileWriter(plugin.getSwords());
        fileWriter.write("items.mysword.displayname." + itemName);
        fileWriter.write("items.mysword.permission." + itemName);
        fileWriter.write("items.mysword.resource.material." + material);
        fileWriter.write("items.mysword.resource.generate.true");

        return new CustomWeapon(itemID, itemName, itemRank, itemClass, lore, maxLevel, rarity, attack, magicAttack, defense, magicDefense, requiredBaseStrength, requiredBaseDexterity, requiredBaseIntelligence, requiredBaseWisdom, strength, dexterity, intelligence, wisdom, accuracy, criticalRate, addedHealth, addedMana, dropRate, tradable, attackSpeed, weaponType);


    }



}
