package mc.craig.software.client.renderers;

import mc.craig.software.CultOfSkaro;
import mc.craig.software.client.models.ModelDalek;
import mc.craig.software.entity.dalek.DalekEntity;
import mc.craig.software.entity.dalek.types.DalekType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class RenderDalek extends MobRenderer<DalekEntity, ModelDalek<DalekEntity>> {

    public RenderDalek(EntityRendererProvider.Context context, ModelDalek<DalekEntity> entityModel) {
        super(context, entityModel, 1F);
    }

    @Override
    public ResourceLocation getTextureLocation(DalekEntity entity) {
        DalekType dalekType = entity.getDalekType();
        return new ResourceLocation(CultOfSkaro.MOD_ID, "textures/entities/" + dalekType.name() + ".png");
    }
}
