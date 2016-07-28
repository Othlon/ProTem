package othlon.protem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by jen on 29/01/2016.
 */
public final class ProTemTab extends CreativeTabs {

    public ProTemTab(int iNo , String sName)
    {
        super(iNo, sName);
    }

    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return ProTemThings.mixRed;
    }

}
