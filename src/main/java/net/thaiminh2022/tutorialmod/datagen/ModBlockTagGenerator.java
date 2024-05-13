package net.thaiminh2022.tutorialmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.thaiminh2022.tutorialmod.TutorialMod;
//import net.thaiminh2022.tutorialmod.item.ModBlocks;
//import net.thaiminh2022.tutorialmod.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
//        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
//                .add(ModBlocks.SAPPHIRE_ORE.get()).addTag(Tags.Blocks.ORES);
//
//        this.tag(BlockTags.NEEDS_IRON_TOOL)
//                .add(ModBlocks.SAPPHIRE_BLOCK.get())
//                .add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
//                .add(ModBlocks.SAPPHIRE_ORE.get());
//
//        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
//                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
//
//        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .add(ModBlocks.END_SAPPHIRE_ORE.get());
//
//        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(ModBlocks.SAPPHIRE_BLOCK.get(), ModBlocks.NETHER_SAPPHIRE_ORE.get(),
//                        ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.END_SAPPHIRE_ORE.get(),
//                        ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), ModBlocks.SOUND_BLOCK.get());
    }
}
