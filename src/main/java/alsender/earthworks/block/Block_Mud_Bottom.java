package alsender.earthworks.block;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

/**
 * Created by alsender on 12/14/16.
 */
public class Block_Mud_Bottom extends ModBlock {

    public Block_Mud_Bottom(String name) {
        super(name, Material.CLAY, 0.6F, 3.0F);
    }

    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block block) {
        super.neighborChanged(state, world, pos, block);
        if (world.getBlockState(pos.up()).getMaterial().isSolid() == false) {
            world.setBlockState(pos, ModBlocks.block_mud.getDefaultState());
        }
    }

    public Item getItemDropped(IBlockState state, Random random, int fortune) {
        return  Item.getItemFromBlock(ModBlocks.block_mud);
    }
}
