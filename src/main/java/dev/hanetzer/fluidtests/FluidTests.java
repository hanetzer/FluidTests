package dev.hanetzer.fluidtests;

import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import slimeknights.mantle.registration.deferred.FluidDeferredRegister;
import slimeknights.mantle.registration.object.FluidObject;

@SuppressWarnings("unused")
@Mod(FluidTests.modID)
public class FluidTests {
    public final static String modID = "fluidtests";
    public static final ResourceLocation LIQUID_STILL = new ResourceLocation(modID, "block/fluid/liquid_still");
    public static final ResourceLocation LIQUID_FLOWING = new ResourceLocation(modID, "block/fluid/liquid_flowing");
    protected static final FluidDeferredRegister FLUIDS = new FluidDeferredRegister(modID);

    public static FluidObject<ForgeFlowingFluid> red = FLUIDS.register("red", fluidBuilder().color(0xffff0000), Material.WATER, 0);
    public static FluidObject<ForgeFlowingFluid> green = FLUIDS.register("green", fluidBuilder().color(0xff00ff00), Material.WATER, 0);
    public static FluidObject<ForgeFlowingFluid> blue = FLUIDS.register("blue", fluidBuilder().color(0xff0000ff), Material.WATER, 0);

    public FluidTests() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        FLUIDS.register(bus);
    }

    private static FluidAttributes.Builder fluidBuilder() {
        return FluidAttributes.builder(LIQUID_STILL, LIQUID_FLOWING).density(2000).viscosity(10000).temperature(1000);
    }
}
