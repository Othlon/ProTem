package othlon.protem;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import othlon.protem.items.ProTemItem;






@Mod(modid = ProTem.MODID, name = ProTem.NAME, version = ProTem.VERSION)
public class ProTem
{
    //references
    public static final String MODID   = "protem";
    public static final String NAME    = "Pro Tem";
    public static final String VERSION = "1.0";

    public static ProTemItem newItem;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        //event handler registry

        /*~~~blocks~~~*/
        //tutorialBlock = new BlockTutorial();

        // GameRegistry.registerBlock(tutorialBlock, "tutorialBlock");

        /*~~items~~*/
        ProTemItem newItem = new ProTemItem();

        GameRegistry.registerItem(newItem, "defaultItemName");
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// recipes

        // item rendering here, preinit causes crashes later
        if(event.getSide() == Side.CLIENT)
        {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

            renderItem.getItemModelMesher().register(newItem, 0, new ModelResourceLocation(ProTem.MODID
                    + ":" +
                    newItem.getName(), "inventory"));
        }

    }
}
