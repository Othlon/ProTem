package othlon.protem.items;

/**
 * Created by jen on 23/01/2016.
 */

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import othlon.protem.ProTem;


public class ProTemItem extends Item
{

    private final String name = "defaultItemName";

    public ProTemItem()
    {

       // setCreativeTab(CreativeTabs.tabMisc);

        GameRegistry.registerItem(this, name);
        setUnlocalizedName(ProTem.MODID + "_" + name);
        setCreativeTab(CreativeTabs.tabMisc);

    }

    public String getName()
    {
        return name;
    }
}