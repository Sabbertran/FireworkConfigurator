package de.sabbertran.fireworkconfigurator;

import java.util.ArrayList;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkEffectMeta;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class Events implements Listener
{

    private FireworkConfigurator main;

    public Events(FireworkConfigurator main)
    {
        this.main = main;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent ev)
    {
        Player p = (Player) ev.getWhoClicked();

        if (ev.getCurrentItem() != null && ev.getCurrentItem().getType() != Material.AIR)
        {
            if (ev.getInventory().getName().equals("Firework Configurator"))
            {
                if (ev.getCurrentItem() != null && ev.getCurrentItem().getItemMeta() != null && ev.getCurrentItem().getItemMeta().getDisplayName() != null)
                {
                    if (!main.getFirework().getEffects().containsKey(p))
                    {
                        main.getFirework().getEffects().put(p, new ArrayList<FireworkEffect>());
                    }
                    if (!main.getFirework().getMainColors().containsKey(p))
                    {
                        main.getFirework().getMainColors().put(p, new ArrayList<Color>());
                    }
                    if (!main.getFirework().getFadeColors().containsKey(p))
                    {
                        main.getFirework().getFadeColors().put(p, new ArrayList<Color>());
                    }
                    if (!main.getFirework().getType().containsKey(p))
                    {
                        main.getFirework().getType().put(p, FireworkEffect.Type.BALL);
                    }
                    if (!main.getFirework().getTrail().containsKey(p))
                    {
                        main.getFirework().getTrail().put(p, Boolean.FALSE);
                    }
                    if (!main.getFirework().getTwinkle().containsKey(p))
                    {
                        main.getFirework().getTwinkle().put(p, Boolean.FALSE);
                    }

                    if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Main Color"))
                    {
                        if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Black"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(30, 27, 27));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Red"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(179, 49, 44));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Green"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(59, 81, 26));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Brown"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(81, 48, 26));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Blue"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(37, 49, 146));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Purple"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(123, 47, 190));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Cyan"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(40, 118, 151));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Light Gray"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(171, 171, 171));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Gray"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(67, 67, 67));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Pink"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(216, 129, 152));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Lime"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(65, 205, 52));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Yellow"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(222, 207, 42));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Light Blue"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(102, 137, 211));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Magenta"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(195, 84, 205));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Orange"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(235, 136, 68));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("White"))
                        {
                            main.getFirework().getMainColors().get(p).add(Color.fromRGB(240, 240, 240));
                        }
                    } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Fade Color"))
                    {
                        if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Black"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(30, 27, 27));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Red"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(179, 49, 44));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Green"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(59, 81, 26));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Brown"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(81, 48, 26));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Blue"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(37, 49, 146));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Purple"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(123, 47, 190));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Cyan"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(40, 118, 151));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Light Gray"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(171, 171, 171));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Gray"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(67, 67, 67));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Pink"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(216, 129, 152));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Lime"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(65, 205, 52));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Yellow"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(222, 207, 42));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Light Blue"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(102, 137, 211));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Magenta"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(195, 84, 205));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Orange"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(235, 136, 68));
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("White"))
                        {
                            main.getFirework().getFadeColors().get(p).add(Color.fromRGB(240, 240, 240));
                        }
                    } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Shape"))
                    {
                        if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Small Ball"))
                        {
                            main.getFirework().getType().put(p, FireworkEffect.Type.BALL);
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Large Ball"))
                        {
                            main.getFirework().getType().put(p, FireworkEffect.Type.BALL_LARGE);
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Star"))
                        {
                            main.getFirework().getType().put(p, FireworkEffect.Type.STAR);
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Burst"))
                        {
                            main.getFirework().getType().put(p, FireworkEffect.Type.BURST);
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Creeper"))
                        {
                            main.getFirework().getType().put(p, FireworkEffect.Type.CREEPER);
                        }
                    } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Effect"))
                    {
                        if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Trail"))
                        {
                            main.getFirework().getTrail().put(p, Boolean.TRUE);
                        } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Twinkle"))
                        {
                            main.getFirework().getTwinkle().put(p, Boolean.TRUE);
                        }
                    } else if (ev.getCurrentItem().getItemMeta().getDisplayName().contains("Continue to firework creation"))
                    {
                        main.getFirework().openFinalFireworkMenu(p);
                    }

                    if (main.getFirework().getMainColors().get(p) != null && !main.getFirework().getMainColors().get(p).isEmpty())
                    {
                        ItemStack star = ev.getInventory().getItem(49);
                        FireworkEffectMeta fem = (FireworkEffectMeta) star.getItemMeta();
                        fem.setEffect(FireworkEffect.builder().withColor(main.getFirework().getMainColors().get(p)).withFade(main.getFirework().getFadeColors().get(p)).with(main.getFirework().getType().get(p)).trail(main.getFirework().getTrail().get(p)).flicker(main.getFirework().getTwinkle().get(p)).build());
                        star.setItemMeta(fem);
                    }

                    if (ev.getCurrentItem().getType() == Material.FIREWORK_CHARGE)
                    {
                        FireworkEffectMeta fem = (FireworkEffectMeta) ev.getCurrentItem().getItemMeta();
                        main.getFirework().getEffects().get(p).add(fem.getEffect());

                        Inventory inv = ev.getInventory();
                        ItemStack final_star = new ItemStack(Material.FIREWORK_CHARGE);
                        ItemMeta final_star_meta = final_star.getItemMeta();
                        final_star_meta.setDisplayName(ChatColor.RESET + "Firework Star - Click to add to rocket");
                        final_star.setItemMeta(final_star_meta);
                        inv.setItem(49, final_star);
                    }
                }
                ev.setCancelled(true);
            } else if (ev.getInventory().getName().equals(ChatColor.RESET + "Firework Configurator"))
            {
                if (ev.getCurrentItem() != null)
                {
                    if (ev.getCurrentItem().getType() == Material.SULPHUR)
                    {
                        ItemStack rocket = ev.getInventory().getItem(7);
                        FireworkMeta fm = (FireworkMeta) rocket.getItemMeta();
                        fm.setPower(ev.getCurrentItem().getAmount());
                        rocket.setItemMeta(fm);
                    }
                }
                if (ev.getCurrentItem().getType() == Material.FIREWORK)
                {
                    p.getInventory().addItem(ev.getCurrentItem());
                    p.closeInventory();
                    main.getFirework().getEffects().remove(p);
                    main.getFirework().getMainColors().remove(p);
                    main.getFirework().getFadeColors().remove(p);
                    main.getFirework().getType().remove(p);
                    main.getFirework().getTrail().remove(p);
                    main.getFirework().getTwinkle().remove(p);
                }
                ev.setCancelled(true);
            }
        }
    }
}
