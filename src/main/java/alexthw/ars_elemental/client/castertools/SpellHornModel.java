package alexthw.ars_elemental.client.castertools;

import alexthw.ars_elemental.common.items.SpellHorn;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static alexthw.ars_elemental.ArsElemental.prefix;

public class SpellHornModel extends AnimatedGeoModel<SpellHorn> {

    @Override
    public ResourceLocation getModelLocation(SpellHorn object) {
        return prefix("geo/spellhorn.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(SpellHorn object) {
        return prefix("textures/item/spellhorn.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SpellHorn animatable) {
        return prefix("animations/item/spellhorn.animation.json");
    }

}
