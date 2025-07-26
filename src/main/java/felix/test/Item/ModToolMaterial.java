package felix.test.Item;

import com.google.common.base.Suppliers;
import felix.test.Test;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

import static net.minecraft.registry.tag.BlockTags.INCORRECT_FOR_NETHERITE_TOOL;

public class ModToolMaterial {
    public static final ToolMaterial QUADRATITE = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL, 455,5.0F,1.5F,22, ModArmorMaterial.QUADRATITE_ARMOR_MATERIAL.repairIngredient());
}
