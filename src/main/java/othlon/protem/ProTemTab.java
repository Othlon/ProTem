package othlon.protem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.SideOnly;
import othlon.protem.ProTem;

/**
 * Created by jen on 29/01/2016.
 */
public final class ProTemTab extends CreativeTabs {

    public ProTemTab(int iNo , String sName)
    {
        super(iNo, sName);
    }

    @SideOnly
    public Item getTabIconItem()
    {
        return ProTem.things
    }

}
