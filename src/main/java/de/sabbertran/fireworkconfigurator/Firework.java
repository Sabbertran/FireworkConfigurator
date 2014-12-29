package de.sabbertran.fireworkconfigurator;

import java.util.ArrayList;
import java.util.HashMap;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class Firework
{

    private FireworkConfigurator main;

    private HashMap<Player, ArrayList<FireworkEffect>> effects;

    private HashMap<Player, ArrayList<Color>> mainColors;
    private HashMap<Player, ArrayList<Color>> fadeColors;
    private HashMap<Player, Type> type;
    private HashMap<Player, Boolean> trail;
    private HashMap<Player, Boolean> twinkle;

    public Firework(FireworkConfigurator main)
    {
        this.main = main;

        effects = new HashMap<Player, ArrayList<FireworkEffect>>();

        mainColors = new HashMap<Player, ArrayList<Color>>();
        fadeColors = new HashMap<Player, ArrayList<Color>>();
        type = new HashMap<Player, Type>();
        trail = new HashMap<Player, Boolean>();
        twinkle = new HashMap<Player, Boolean>();
    }

    public void openFireworkMenu(Player p)
    {
        Inventory inv = main.getServer().createInventory(p, 54, "Firework Configurator");

        //main: black
        ItemStack color_black = new ItemStack(Material.INK_SACK);
        ItemMeta color_black_meta = color_black.getItemMeta();
        color_black_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Black");
        color_black.setItemMeta(color_black_meta);
        inv.setItem(0, color_black);
        //main: red
        ItemStack color_red = new ItemStack(Material.INK_SACK);
        color_red.setDurability((short) 1);
        ItemMeta color_red_meta = color_red.getItemMeta();
        color_red_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Red");
        color_red.setItemMeta(color_red_meta);
        inv.setItem(1, color_red);
        //main: green
        ItemStack color_green = new ItemStack(Material.INK_SACK);
        color_green.setDurability((short) 2);
        ItemMeta color_green_meta = color_green.getItemMeta();
        color_green_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Green");
        color_green.setItemMeta(color_green_meta);
        inv.setItem(2, color_green);
        //main: brown
        ItemStack color_brown = new ItemStack(Material.INK_SACK);
        color_brown.setDurability((short) 3);
        ItemMeta color_brown_meta = color_brown.getItemMeta();
        color_brown_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Brown");
        color_brown.setItemMeta(color_brown_meta);
        inv.setItem(9, color_brown);
        //main: blue
        ItemStack color_blue = new ItemStack(Material.INK_SACK);
        color_blue.setDurability((short) 4);
        ItemMeta color_blue_meta = color_blue.getItemMeta();
        color_blue_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Blue");
        color_blue.setItemMeta(color_blue_meta);
        inv.setItem(10, color_blue);
        //main: purple
        ItemStack color_purple = new ItemStack(Material.INK_SACK);
        color_purple.setDurability((short) 5);
        ItemMeta color_purple_meta = color_purple.getItemMeta();
        color_purple_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Purple");
        color_purple.setItemMeta(color_purple_meta);
        inv.setItem(11, color_purple);
        //main: cyan
        ItemStack color_cyan = new ItemStack(Material.INK_SACK);
        color_cyan.setDurability((short) 6);
        ItemMeta color_cyan_meta = color_cyan.getItemMeta();
        color_cyan_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Cyan");
        color_cyan.setItemMeta(color_cyan_meta);
        inv.setItem(18, color_cyan);
        //main: lightgray
        ItemStack color_lightgray = new ItemStack(Material.INK_SACK);
        color_lightgray.setDurability((short) 7);
        ItemMeta color_lightgray_meta = color_lightgray.getItemMeta();
        color_lightgray_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Light Gray");
        color_lightgray.setItemMeta(color_lightgray_meta);
        inv.setItem(19, color_lightgray);
        //main: gray
        ItemStack color_gray = new ItemStack(Material.INK_SACK);
        color_gray.setDurability((short) 8);
        ItemMeta color_gray_meta = color_gray.getItemMeta();
        color_gray_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Gray");
        color_gray.setItemMeta(color_gray_meta);
        inv.setItem(20, color_gray);
        //main: pink
        ItemStack color_pink = new ItemStack(Material.INK_SACK);
        color_pink.setDurability((short) 9);
        ItemMeta color_pink_meta = color_pink.getItemMeta();
        color_pink_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Pink");
        color_pink.setItemMeta(color_pink_meta);
        inv.setItem(27, color_pink);
        //main: lime
        ItemStack color_lime = new ItemStack(Material.INK_SACK);
        color_lime.setDurability((short) 10);
        ItemMeta color_lime_meta = color_lime.getItemMeta();
        color_lime_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Lime");
        color_lime.setItemMeta(color_lime_meta);
        inv.setItem(28, color_lime);
        //main: yellow
        ItemStack color_yellow = new ItemStack(Material.INK_SACK);
        color_yellow.setDurability((short) 11);
        ItemMeta color_yellow_meta = color_yellow.getItemMeta();
        color_yellow_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Yellow");
        color_yellow.setItemMeta(color_yellow_meta);
        inv.setItem(29, color_yellow);
        //main: lightblue
        ItemStack color_lightblue = new ItemStack(Material.INK_SACK);
        color_lightblue.setDurability((short) 12);
        ItemMeta color_lightblue_meta = color_lightblue.getItemMeta();
        color_lightblue_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Light Blue");
        color_lightblue.setItemMeta(color_lightblue_meta);
        inv.setItem(36, color_lightblue);
        //main: magenta
        ItemStack color_magenta = new ItemStack(Material.INK_SACK);
        color_magenta.setDurability((short) 13);
        ItemMeta color_magenta_meta = color_magenta.getItemMeta();
        color_magenta_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Magenta");
        color_magenta.setItemMeta(color_magenta_meta);
        inv.setItem(37, color_magenta);
        //main: orange
        ItemStack color_orange = new ItemStack(Material.INK_SACK);
        color_orange.setDurability((short) 14);
        ItemMeta color_orange_meta = color_orange.getItemMeta();
        color_orange_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "Orange");
        color_orange.setItemMeta(color_orange_meta);
        inv.setItem(38, color_orange);
        //main: white
        ItemStack color_white = new ItemStack(Material.INK_SACK);
        color_white.setDurability((short) 15);
        ItemMeta color_white_meta = color_white.getItemMeta();
        color_white_meta.setDisplayName(ChatColor.RESET + "Main Color - Add " + ChatColor.BOLD + "White");
        color_white.setItemMeta(color_white_meta);
        inv.setItem(47, color_white);

        //fade: black
        ItemStack fade_black = new ItemStack(Material.INK_SACK);
        ItemMeta fade_black_meta = fade_black.getItemMeta();
        fade_black_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Black");
        fade_black.setItemMeta(fade_black_meta);
        inv.setItem(6, fade_black);
        //fade: red
        ItemStack fade_red = new ItemStack(Material.INK_SACK);
        fade_red.setDurability((short) 1);
        ItemMeta fade_red_meta = fade_red.getItemMeta();
        fade_red_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Red");
        fade_red.setItemMeta(fade_red_meta);
        inv.setItem(7, fade_red);
        //fade: green
        ItemStack fade_green = new ItemStack(Material.INK_SACK);
        fade_green.setDurability((short) 2);
        ItemMeta fade_green_meta = fade_green.getItemMeta();
        fade_green_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Green");
        fade_green.setItemMeta(fade_green_meta);
        inv.setItem(8, fade_green);
        //fade: brown
        ItemStack fade_brown = new ItemStack(Material.INK_SACK);
        fade_brown.setDurability((short) 3);
        ItemMeta fade_brown_meta = fade_brown.getItemMeta();
        fade_brown_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Brown");
        fade_brown.setItemMeta(fade_brown_meta);
        inv.setItem(15, fade_brown);
        //fade: blue
        ItemStack fade_blue = new ItemStack(Material.INK_SACK);
        fade_blue.setDurability((short) 4);
        ItemMeta fade_blue_meta = fade_blue.getItemMeta();
        fade_blue_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Blue");
        fade_blue.setItemMeta(fade_blue_meta);
        inv.setItem(16, fade_blue);
        //fade: purple
        ItemStack fade_purple = new ItemStack(Material.INK_SACK);
        fade_purple.setDurability((short) 5);
        ItemMeta fade_purple_meta = fade_purple.getItemMeta();
        fade_purple_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Purple");
        fade_purple.setItemMeta(fade_purple_meta);
        inv.setItem(17, fade_purple);
        //fade: cyan
        ItemStack fade_cyan = new ItemStack(Material.INK_SACK);
        fade_cyan.setDurability((short) 6);
        ItemMeta fade_cyan_meta = fade_cyan.getItemMeta();
        fade_cyan_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Cyan");
        fade_cyan.setItemMeta(fade_cyan_meta);
        inv.setItem(24, fade_cyan);
        //fade: lightgray
        ItemStack fade_lightgray = new ItemStack(Material.INK_SACK);
        fade_lightgray.setDurability((short) 7);
        ItemMeta fade_lightgray_meta = fade_lightgray.getItemMeta();
        fade_lightgray_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Light Gray");
        fade_lightgray.setItemMeta(fade_lightgray_meta);
        inv.setItem(25, fade_lightgray);
        //fade: gray
        ItemStack fade_gray = new ItemStack(Material.INK_SACK);
        fade_gray.setDurability((short) 8);
        ItemMeta fade_gray_meta = fade_gray.getItemMeta();
        fade_gray_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Gray");
        fade_gray.setItemMeta(fade_gray_meta);
        inv.setItem(26, fade_gray);
        //fade: pink
        ItemStack fade_pink = new ItemStack(Material.INK_SACK);
        fade_pink.setDurability((short) 9);
        ItemMeta fade_pink_meta = fade_pink.getItemMeta();
        fade_pink_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Pink");
        fade_pink.setItemMeta(fade_pink_meta);
        inv.setItem(33, fade_pink);
        //fade: lime
        ItemStack fade_lime = new ItemStack(Material.INK_SACK);
        fade_lime.setDurability((short) 10);
        ItemMeta fade_lime_meta = fade_lime.getItemMeta();
        fade_lime_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Lime");
        fade_lime.setItemMeta(fade_lime_meta);
        inv.setItem(34, fade_lime);
        //fade: yellow
        ItemStack fade_yellow = new ItemStack(Material.INK_SACK);
        fade_yellow.setDurability((short) 11);
        ItemMeta fade_yellow_meta = fade_yellow.getItemMeta();
        fade_yellow_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Yellow");
        fade_yellow.setItemMeta(fade_yellow_meta);
        inv.setItem(35, fade_yellow);
        //fade: lightblue
        ItemStack fade_lightblue = new ItemStack(Material.INK_SACK);
        fade_lightblue.setDurability((short) 12);
        ItemMeta fade_lightblue_meta = fade_lightblue.getItemMeta();
        fade_lightblue_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Light Blue");
        fade_lightblue.setItemMeta(fade_lightblue_meta);
        inv.setItem(42, fade_lightblue);
        //fade: magenta
        ItemStack fade_magenta = new ItemStack(Material.INK_SACK);
        fade_magenta.setDurability((short) 13);
        ItemMeta fade_magenta_meta = fade_magenta.getItemMeta();
        fade_magenta_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Magenta");
        fade_magenta.setItemMeta(fade_magenta_meta);
        inv.setItem(43, fade_magenta);
        //fade: orange
        ItemStack fade_orange = new ItemStack(Material.INK_SACK);
        fade_orange.setDurability((short) 14);
        ItemMeta fade_orange_meta = fade_orange.getItemMeta();
        fade_orange_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "Orange");
        fade_orange.setItemMeta(fade_orange_meta);
        inv.setItem(44, fade_orange);
        //fade: white
        ItemStack fade_white = new ItemStack(Material.INK_SACK);
        fade_white.setDurability((short) 15);
        ItemMeta fade_white_meta = fade_white.getItemMeta();
        fade_white_meta.setDisplayName(ChatColor.RESET + "Fade Color - Add " + ChatColor.BOLD + "White");
        fade_white.setItemMeta(fade_white_meta);
        inv.setItem(51, fade_white);

        //small ball
        ItemStack smallball = new ItemStack(Material.PAPER);
        ItemMeta smallball_meta = smallball.getItemMeta();
        smallball_meta.setDisplayName(ChatColor.RESET + "Shape: " + ChatColor.BOLD + "Small Ball");
        smallball.setItemMeta(smallball_meta);
        inv.setItem(4, smallball);
        //large ball
        ItemStack largeball = new ItemStack(Material.FIREBALL);
        ItemMeta largeball_meta = largeball.getItemMeta();
        largeball_meta.setDisplayName(ChatColor.RESET + "Shape: " + ChatColor.BOLD + "Large Ball");
        largeball.setItemMeta(largeball_meta);
        inv.setItem(13, largeball);
        //star
        ItemStack star = new ItemStack(Material.GOLD_NUGGET);
        ItemMeta star_meta = star.getItemMeta();
        star_meta.setDisplayName(ChatColor.RESET + "Shape: " + ChatColor.BOLD + "Star");
        star.setItemMeta(star_meta);
        inv.setItem(22, star);
        //burst
        ItemStack burst = new ItemStack(Material.FEATHER);
        ItemMeta burst_meta = burst.getItemMeta();
        burst_meta.setDisplayName(ChatColor.RESET + "Shape: " + ChatColor.BOLD + "Burst");
        burst.setItemMeta(burst_meta);
        inv.setItem(31, burst);
        //creeper
        ItemStack creeper = new ItemStack(Material.SKULL_ITEM);
        creeper.setDurability((short) 4);
        ItemMeta creeper_meta = creeper.getItemMeta();
        creeper_meta.setDisplayName(ChatColor.RESET + "Shape: " + ChatColor.BOLD + "Creeper");
        creeper.setItemMeta(creeper_meta);
        inv.setItem(40, creeper);

        //trail
        ItemStack trail = new ItemStack(Material.DIAMOND);
        ItemMeta trail_meta = trail.getItemMeta();
        trail_meta.setDisplayName(ChatColor.RESET + "Effect: " + ChatColor.BOLD + "Trail");
        trail.setItemMeta(trail_meta);
        inv.setItem(48, trail);
        //large ball
        ItemStack twinkle = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta twinkle_meta = twinkle.getItemMeta();
        twinkle_meta.setDisplayName(ChatColor.RESET + "Effect: " + ChatColor.BOLD + "Twinkle");
        twinkle.setItemMeta(twinkle_meta);
        inv.setItem(50, twinkle);

        ItemStack final_star = new ItemStack(Material.FIREWORK_CHARGE);
        ItemMeta final_star_meta = final_star.getItemMeta();
        final_star_meta.setDisplayName(ChatColor.RESET + "Firework Star - Click to add to rocket");
        final_star.setItemMeta(final_star_meta);
        inv.setItem(49, final_star);

        ItemStack createRocket = new ItemStack(Material.FIREWORK);
        ItemMeta createRocket_meta = createRocket.getItemMeta();
        createRocket_meta.setDisplayName(ChatColor.RESET + "Continue to firework creation");
        createRocket.setItemMeta(createRocket_meta);
        inv.setItem(45, createRocket);
        inv.setItem(53, createRocket);

        p.openInventory(inv);
    }

    public void openFinalFireworkMenu(Player p)
    {
        Inventory inv = main.getServer().createInventory(p, 9, ChatColor.RESET + "Firework Configurator");

        ItemStack rocket = new ItemStack(Material.FIREWORK);
        FireworkMeta rocket_meta = (FireworkMeta) rocket.getItemMeta();
        rocket_meta.setPower(1);
        for (FireworkEffect fe : effects.get(p))
        {
            if (fe != null)
            {
                rocket_meta.addEffect(fe);
            }
        }
        rocket.setItemMeta(rocket_meta);
        inv.setItem(7, rocket);

        ItemStack power_1 = new ItemStack(Material.SULPHUR);
        ItemMeta power_1_meta = power_1.getItemMeta();
        power_1_meta.setDisplayName(ChatColor.RESET + "Rocket Power: 1");
        power_1.setItemMeta(power_1_meta);
        inv.setItem(1, power_1);

        ItemStack power_2 = new ItemStack(Material.SULPHUR);
        power_2.setAmount(2);
        ItemMeta power_2_meta = power_2.getItemMeta();
        power_2_meta.setDisplayName(ChatColor.RESET + "Rocket Power: 2");
        power_2.setItemMeta(power_2_meta);
        inv.setItem(3, power_2);

        ItemStack power_3 = new ItemStack(Material.SULPHUR);
        power_3.setAmount(3);
        ItemMeta power_3_meta = power_3.getItemMeta();
        power_3_meta.setDisplayName(ChatColor.RESET + "Rocket Power: 3");
        power_3.setItemMeta(power_3_meta);
        inv.setItem(5, power_3);

        p.openInventory(inv);
    }

    public HashMap<Player, ArrayList<FireworkEffect>> getEffects()
    {
        return effects;
    }

    public HashMap<Player, ArrayList<Color>> getMainColors()
    {
        return mainColors;
    }

    public HashMap<Player, ArrayList<Color>> getFadeColors()
    {
        return fadeColors;
    }

    public HashMap<Player, Type> getType()
    {
        return type;
    }

    public HashMap<Player, Boolean> getTrail()
    {
        return trail;
    }

    public HashMap<Player, Boolean> getTwinkle()
    {
        return twinkle;
    }

}
