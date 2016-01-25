package othlon.protem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import othlon.protem.items.ProTemItem;
import othlon.protem.proxies.ClientProxy;

@SuppressWarnings("ClassNamePrefixedWithPackageName")

@Mod(modid = ProTem.MODID, name = ProTem.NAME, version = ProTem.VERSION)
public class ProTem
{
    //references
    public static final String MODID   = "protem";
    public static final String NAME    = "Pro Tem";
    public static final String VERSION = "1.0";
    public static final String RESOURCE_DOMAIN= "protem:";

    public static ProTemItem newItem;


    @SidedProxy(clientSide = "othlon.protem.proxies.ClientProxy",
                serverSide = "othlon.protem.proxies.CommonProxy")
    public static ClientProxy proxy;

   public static ProTemThings things;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {

        things = new ProTemThings();


        things.preInitThings(event);
        //event handler registry

        /*~~items~~*/

        newItem = new ProTemItem();
        GameRegistry.registerItem(newItem, newItem.getName());



    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// recipes

        //proxy registeringing
        proxy.registerRenderers(event.getModState());


    }
}
