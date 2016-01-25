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

    public static Item itemSecuredBed;

    public void preInitThings(FMLPreInitializationEvent event)
    {
        itemSecuredBed = new ItemSecuredBed().setMaxStackSize(7).setCreativeTab(CreativeTabs.tabMisc);
        registerItem("securedBed", itemSecuredBed);
    }

    private void registerItem(String id, Item item)
    {
        item.setUnlocalizedName("protem." + id);
        GameRegistry.registerItem(item, id);

    }
}
