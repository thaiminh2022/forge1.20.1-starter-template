package net.thaiminh2022.tutorialmod.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
//import net.thaiminh2022.tutorialmod.item.ModBlocks;
//import net.thaiminh2022.tutorialmod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
//        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
//        dropSelf(ModBlocks.SOUND_BLOCK.get());
//        dropSelf(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
//
//        add(ModBlocks.SAPPHIRE_ORE.get(), block ->
//                createOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
//
//        add(ModBlocks.NETHER_SAPPHIRE_ORE.get(), block ->
//                createOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
//        add(ModBlocks.END_SAPPHIRE_ORE.get(), block ->
//                createOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
//        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), block ->
//                createOreDrops(ModBlocks.SAPPHIRE_ORE.get(), ModItems.RAW_SAPPHIRE.get()));
    }

    protected LootTable.Builder createOreDrops(Block pBlock, Item dropItem) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(dropItem)
                        .apply(SetItemCountFunction
                                .setCount(UniformGenerator.between(2, 5)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    protected Iterable<Block> getKnownBlocks() {
        return  null;
//        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
