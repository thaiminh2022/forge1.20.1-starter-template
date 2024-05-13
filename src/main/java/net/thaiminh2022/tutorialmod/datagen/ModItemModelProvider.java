package net.thaiminh2022.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.thaiminh2022.tutorialmod.TutorialMod;
//import net.thaiminh2022.tutorialmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        simpleItem(ModItems.SAPPHIRE);
//        simpleItem(ModItems.RAW_SAPPHIRE);
//        simpleItem(ModItems.METAL_DETECTOR);
//
//        simpleItem(ModItems.STRAWBERRY);
//        simpleItem(ModItems.PINE_CONE);

    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0",
                        new ResourceLocation(TutorialMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
