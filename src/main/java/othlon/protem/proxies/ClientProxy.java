package othlon.protem.proxies;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.LoaderState;
import othlon.protem.ProTem;
import othlon.protem.ProTemThings;

public class ClientProxy extends CommonProxy{

       //@Override
       public void registerRenderers(LoaderState.ModState state) {
              if (state == LoaderState.ModState.PREINITIALIZED) {
                     //registerEntityRenderers();
                     //registerRendererVariants();
              }

              if (state == LoaderState.ModState.INITIALIZED) {
                    // registerTileEntitySpeacialRenderers();
                     registerItemRenderers();
              }

              if (state == LoaderState.ModState.POSTINITIALIZED) {

              }
       }
       public void registerItemRenderers() {

              Item itemToRegister = null;
              ModelResourceLocation modelResourceLocation = null;
              RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

              ItemModelMesher modelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

              //othy's attemp at stuff! WOOO


              modelResourceLocation = new ModelResourceLocation(ProTem.RESOURCE_DOMAIN + "ingotGlow", "inventory");

              modelMesher.register(ProTemThings.ingotGlow, 0, modelResourceLocation);

              modelResourceLocation = new ModelResourceLocation(ProTem.RESOURCE_DOMAIN + "mixGlow", "inventory");

              modelMesher.register(ProTemThings.mixGlow, 0, modelResourceLocation);

              modelResourceLocation = new ModelResourceLocation(ProTem.RESOURCE_DOMAIN + "ingotRed", "inventory");

              modelMesher.register(ProTemThings.ingotRed, 0, modelResourceLocation);

              modelResourceLocation = new ModelResourceLocation(ProTem.RESOURCE_DOMAIN + "mixRed", "inventory");

              modelMesher.register(ProTemThings.mixRed, 0, modelResourceLocation);







              //System.out.println("PIG TILL I DIE" + modelResourceLocation.toString());



              /* new item what what?
              modelResourceLocation = new ModelResourceLocation(ProTem.RESOURCE_DOMAIN + ProTem.newItem.getName(), "inventory");

              renderItem.getItemModelMesher().register(ProTem.newItem, 0, modelResourceLocation);

              modelMesher.register((ProTem.newItem), 0, modelResourceLocation);
              */


              // Do some general render registrations for objects, not considering meta.

             //really like this design
             /*   for (int i = 0; i < ArchimedesObjects.registeredItems.size(); i++) {
                     modelResourceLocation = new ModelResourceLocation(ArchimedesShipMod.RESOURCE_DOMAIN + ArchimedesObjects.registeredItems.keySet().toArray()[i], "inventory");
                     itemToRegister = (Item) ArchimedesObjects.registeredItems.values().toArray()[i];
                     modelMesher.register(itemToRegister, 0, modelResourceLocation);
              }*/

       }
}