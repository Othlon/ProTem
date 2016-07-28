package othlon.protem.items;

/**
 * Created by jen on 23/01/2016.
 */

import net.minecraft.item.Item;
import othlon.protem.ProTem;


public class ProTemItem extends Item
{

    private final String name = "defaultItemName";

    public ProTemItem()
    {
        //GameRegistry.registerItem(this, name);

        //setUnlocalizedName(ProTem.MODID + "_" + name);
        setCreativeTab(ProTem.proTemTab);
    }

    public String getName()
    {
        return name;
    }
}