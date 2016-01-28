package othlon.protem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import othlon.protem.items.ItemSecuredBed;

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
        mixRed = new ItemSecuredBed().setMaxStackSize(7).setCreativeTab(CreativeTabs.tabMisc);
        registerItem("mixRed", mixRed);

        ingotRed = new ItemSecuredBed().setMaxStackSize(7).setCreativeTab(CreativeTabs.tabMisc);
        registerItem("ingotRed", ingotRed);

        mixGlow = new ItemSecuredBed().setMaxStackSize(7).setCreativeTab(CreativeTabs.tabMisc);
        registerItem("mixGlow", mixGlow);

        ingotGlow = new ItemSecuredBed().setMaxStackSize(7).setCreativeTab(CreativeTabs.tabMisc);
        registerItem("ingotGlow", ingotGlow);
    }

    private void registerItem(String id, Item item)
    {
        item.setUnlocalizedName("protem." + id);
        GameRegistry.registerItem(item, id);

    }
}
