package it.finnsolly;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.sql.SQLException;

public class TestCommand implements CommandExecutor {

    CustomItemAPI plugin = CustomItemAPI.getInstance();
    CreateItem createItem = plugin.getCreateItem();

    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        try {
            createItem.createSword("test", "Sword", Material.DIAMOND_SWORD, 0, "", "", 0, 0,0,0,0,0,0,0,0,0,0,0,0, 0,0,0,0,0, 0, true,0, "","");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return false;
    }
}
