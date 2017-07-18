package ru.Sonicxd2.addonexample;

import org.bukkit.plugin.java.JavaPlugin;
import ru.Sonicxd2.SkyBlock.Addon.Addon;
import ru.Sonicxd2.SkyBlock.LuckyBlock.LuckyBlockManager;
import ru.Sonicxd2.SkyBlock.LuckyBlock.Rare;

/**
 *
 * @author Sonicxd2
 */
public class Addons implements Addon{

    @Override
    public boolean onEnable(JavaPlugin jp) {
        LuckyBlockManager.registerLuckyBlockLoot(new WitherLuckyBlock(Rare.LEGENDARY));
        return true;
    }

    @Override
    public void onDisable(JavaPlugin jp) {
        
    }


    
    
}
