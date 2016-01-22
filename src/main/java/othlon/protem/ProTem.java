package othlon.protem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ProTem.MODID, name = ProTem.NAME, version = ProTem.VERSION)
public class ProTem
{
    //references
    public static final String MODID   = "protem";
    public static final String NAME    = "Pro Tem";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {

    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code

        // item rendering here, preinit causes crashes later

    }
}
