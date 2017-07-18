package ru.Sonicxd2.addonexample;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wither;
import ru.Sonicxd2.SkyBlock.LuckyBlock.LuckyBlockLoot;
import ru.Sonicxd2.SkyBlock.LuckyBlock.Rare;

/**
 *
 * @author Sonicxd2
 */
public class WitherLuckyBlock extends LuckyBlockLoot {

    public WitherLuckyBlock(Rare r) {
        super(r);
    }

    
    @Override
    public void action(Player player, Location lctn) {
        player.getWorld().spawn(lctn, Wither.class);
    }
    
}
