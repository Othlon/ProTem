package othlon.protem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import othlon.protem.items.ProTemItem;

/**
 * Created by jen on 25/01/2016.
 */
public class ProTemThings {

    public static Item mixRed;
    public static Item ingotRed;

    public static Item mixGlow;
    public static Item ingotGlow;

    //public static Item itemSecuredBed;

    public void preInitThings(FMLPreInitializationEvent event)
    {
        mixRed = new ProTemItem().setMaxStackSize(64);
        registerItem("mixRed", mixRed);

        ingotRed = new ProTemItem().setMaxStackSize(64);
        registerItem("ingotRed", ingotRed);

        mixGlow = new ProTemItem().setMaxStackSize(64);
        registerItem("mixGlow", mixGlow);

        ingotGlow = new ProTemItem().setMaxStackSize(64);
        registerItem("ingotGlow", ingotGlow);
    }

    private void registerItem(String id, Item item)
    {
        item.setUnlocalizedName("protem." + id);
        GameRegistry.registerItem(item, id);

    }
}
