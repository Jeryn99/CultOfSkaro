package mc.craig.software.client.models;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;

public class ModelDalek<T extends Entity> extends EntityModel<T> {

    public final ModelPart dome;
    public final ModelPart bone9;
    public final ModelPart bone7;
    public final ModelPart bone8;
    public final ModelPart bone10;
    public final ModelPart bone2;
    public final ModelPart head;
    public final ModelPart leftfrontpannel;
    public final ModelPart plunger;
    public final ModelPart rightfrontpanel;
    public final ModelPart gunstick;
    public final ModelPart bone16;
    public final ModelPart bone15;
    public final ModelPart bone13;
    public final ModelPart bone12;
    public final ModelPart bone14;
    public final ModelPart bone11;
    public final ModelPart bone3;

    public ModelDalek(ModelPart root) {
        this.dome = root.getChild("dome");
        this.bone9 = root.getChild("bone9");
        this.bone7 = root.getChild("bone7");
        this.bone8 = root.getChild("bone8");
        this.bone10 = root.getChild("bone10");
        this.bone2 = root.getChild("bone2");
        this.head = root.getChild("head");
        this.leftfrontpannel = root.getChild("leftfrontpannel");
        this.plunger = root.getChild("plunger");
        this.rightfrontpanel = root.getChild("rightfrontpanel");
        this.gunstick = root.getChild("gunstick");
        this.bone16 = root.getChild("bone16");
        this.bone15 = root.getChild("bone15");
        this.bone13 = root.getChild("bone13");
        this.bone12 = root.getChild("bone12");
        this.bone14 = root.getChild("bone14");
        this.bone11 = root.getChild("bone11");
        this.bone3 = root.getChild("bone3");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition dome = partdefinition.addOrReplaceChild("dome",
                CubeListBuilder.create().texOffs(90, 17).addBox(-4.0F, 3.9221F, -3.9167F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(95, 17).addBox(1.0F, 1.9221F, -3.9167F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(101, 16)
                        .addBox(-4.0F, 1.9221F, -3.9167F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(92, 4).addBox(-3.5F, 0.9221F, -3.4167F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(98, 19)
                        .addBox(-3.0F, -0.0779F, -2.9167F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(100, 64).addBox(-1.0F, 1.9221F, -2.9167F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -1.9221F, 1.4167F));
        PartDefinition bone9 = dome.addOrReplaceChild("bone9",
                CubeListBuilder.create().texOffs(35, 86).addBox(-0.5F, -0.5F, -5.9917F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(93, 88).addBox(-1.0F, -1.0F, -7.0917F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(2, -1)
                        .addBox(-0.5F, -0.5F, -7.1417F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)).texOffs(23, 74).addBox(-0.5F, -0.5F, -7.2917F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
                        .addBox(-1.0F, -1.0F, -2.9917F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 16).addBox(-1.0F, -1.0F, -3.9917F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 15)
                        .addBox(-1.0F, -1.0F, -6.9917F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 2.9221F, -2.925F));
        PartDefinition bone7 = dome.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-3.0F, 1.9221F, 1.5833F));
        PartDefinition cube_r1 = bone7.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 22).addBox(-1.5F, -2.4F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 74)
                .addBox(-1.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, 20).addBox(-0.5F, -2.4F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
        PartDefinition bone8 = dome.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offset(3.0F, 1.9221F, 1.5833F));
        PartDefinition cube_r2 = bone8.addOrReplaceChild(
                "cube_r2", CubeListBuilder.create().texOffs(1, 22).mirror().addBox(-0.5F, -2.4F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(23, 74).mirror()
                        .addBox(0.0F, -2.0F, -0.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-1, 20).mirror().addBox(0.5F, -2.4F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
        PartDefinition bone10 = partdefinition.addOrReplaceChild("bone10",
                CubeListBuilder.create().texOffs(4, 97).addBox(-6.0F, -2.0F, -6.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(4, 97).addBox(0.0F, -2.0F, -6.0F, 6.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(5, 98)
                        .addBox(-6.0F, -2.0F, 1.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(5, 98).addBox(0.0F, -2.0F, 1.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(84, 9)
                        .addBox(-5.0F, -6.0F, -6.0F, 10.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(96, 18).addBox(-4.0F, -12.0F, 6.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(82, 11)
                        .addBox(-5.0F, -10.0F, -5.0F, 10.0F, 4.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(86, 17).addBox(-5.0F, -12.0F, -4.0F, 10.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(58, 84)
                        .addBox(-2.0F, -13.0F, -0.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(58, 84).addBox(-2.0F, -13.0F, -0.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 1).mirror()
                        .addBox(-4.0F, -6.0F, -7.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(82, 0).addBox(-4.0F, -10.0F, -6.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(99, 1)
                        .addBox(-3.0F, -12.0F, -5.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 94).addBox(-5.0F, -2.0F, 7.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 89)
                        .addBox(-5.0F, -2.0F, -7.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 87).addBox(-4.0F, -2.0F, -8.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, 24.0F, 0.0F));
        PartDefinition bone2 = bone10.addOrReplaceChild("bone2",
                CubeListBuilder.create().texOffs(98, 16).addBox(3.0F, -17.0F, -2.0F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(2.0F, -14.0F, -3.0F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
                        .addBox(2.0F, -14.0F, -10.0F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(9.0F, -14.0F, -10.0F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(99, 16)
                        .addBox(-4.0F, -17.0F, -2.0F, 1.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(93, 16).addBox(-3.0F, -12.5F, -2.0F, 6.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(9, 99)
                        .addBox(-3.0F, -12.8F, -1.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(-0.025F)).texOffs(9, 99).addBox(-3.9F, -16.8F, -1.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(9, 99)
                        .addBox(2.9F, -16.8F, -1.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 104).addBox(-3.0F, -16.8F, 4.6F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(95, 17)
                        .addBox(-4.0F, -17.0F, 5.0F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
                PartPose.offset(0.0F, -1.0F, 0.0F));
        PartDefinition head = bone2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(91, 18).addBox(-3.8064F, -0.9437F, -7.0115F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 82)
                .addBox(-3.3064F, -1.9437F, -6.5115F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(71, 109).addBox(-3.3064F, -1.7687F, -6.5115F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.2F)), PartPose.offset(0.3064F, -17.0563F, 5.0115F));
        PartDefinition leftfrontpannel = bone2.addOrReplaceChild("leftfrontpannel", CubeListBuilder.create().texOffs(101, 47).addBox(0.0F, -2.7F, -1.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 107)
                .addBox(0.0F, -2.7F, -0.7F, 4.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(32, 15).addBox(0.0F, 0.3F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -14.3F, -2.0F));
        PartDefinition plunger = leftfrontpannel.addOrReplaceChild("plunger", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.5F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(4, 4)
                .addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 15).addBox(-1.0F, -1.0F, -7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 1.3F, -1.0F));
        PartDefinition rightfrontpanel = bone2.addOrReplaceChild("rightfrontpanel", CubeListBuilder.create().texOffs(116, 48).addBox(-3.95F, -2.325F, -1.025F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 107)
                .addBox(-3.95F, -2.325F, -0.725F, 4.0F, 5.0F, 1.0F, new CubeDeformation(-0.1F)).texOffs(32, 15).addBox(-1.95F, 0.675F, -2.025F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.95F, -14.675F, -1.975F));
        PartDefinition gunstick = rightfrontpanel
                .addOrReplaceChild(
                        "gunstick", CubeListBuilder.create().texOffs(38, 104).addBox(-0.5F, -0.5F, -4.25F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(5, 86).addBox(-0.5F, -0.5F, -4.425F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F))
                                .texOffs(39, 108).addBox(-1.0F, 0.0F, -3.75F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(43, 102).addBox(0.0F, -1.0F, -3.75F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
                        PartPose.offset(-0.95F, 1.675F, -1.775F));
        PartDefinition bone16 = partdefinition.addOrReplaceChild("bone16",
                CubeListBuilder.create().texOffs(115, 116).addBox(-1.0F, -25.0F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(115, 119).addBox(-0.5F, -25.4F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
                PartPose.offset(-0.5F, 31.0F, 3.0F));
        PartDefinition bone15 = bone16.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7046F, -24.3F, -0.0336F, -0.02F, -0.0127F, 0.5698F));
        PartDefinition cube_r3 = bone15.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(120, 113).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0294F, 0.0F, -0.1092F, 0.0F, 0.6981F, 0.0F));
        PartDefinition cube_r4 = bone15.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(120, 114).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.7194F, 0.0F, -0.1505F, 0.0F, -0.1309F, 0.0F));
        PartDefinition bone13 = bone16.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7046F, -22.9F, 0.9664F, -0.1549F, -0.1981F, -0.0632F));
        PartDefinition cube_r5 = bone13.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(120, 113).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0294F, 0.0F, -0.1092F, 0.0F, 0.6981F, 0.0F));
        PartDefinition cube_r6 = bone13.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(120, 114).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.7194F, 0.0F, -0.1505F, 0.0F, -0.1309F, 0.0F));
        PartDefinition bone12 = bone16.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7046F, -22.2F, -0.0336F, 0.1768F, -0.3048F, -0.0079F));
        PartDefinition cube_r7 = bone12.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(115, 119).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-0.0294F, 0.0F, -0.1092F, 0.0F, 0.6981F, 0.0F));
        PartDefinition cube_r8 = bone12.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(116, 120).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(-1.7194F, 0.0F, -0.1505F, 0.0F, -0.1309F, 0.0F));
        PartDefinition bone14 = bone16.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0046F, -23.7F, 1.0664F, -0.6135F, 0.3488F, -0.012F));
        PartDefinition cube_r9 = bone14.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(114, 114).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0294F, 0.0F, -0.1092F, 0.0F, -0.6981F, 0.0F));
        PartDefinition cube_r10 = bone14.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(114, 114).mirror().addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.7194F, 0.0F, -0.1505F, 0.0F, 0.1309F, 0.0F));
        PartDefinition bone11 = bone16.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5046F, -21.7F, -0.0336F, 0.0436F, 0.0873F, 0.0F));
        PartDefinition cube_r11 = bone11.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(118, 120).mirror().addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(0.0294F, 0.0F, -0.1092F, 0.0F, -0.6981F, 0.0F));
        PartDefinition cube_r12 = bone11.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(119, 120).mirror().addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
                PartPose.offsetAndRotation(1.7194F, 0.0F, -0.1505F, 0.0F, 0.1309F, 0.0F));
        PartDefinition bone3 = bone16.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(109, 86).addBox(-2.5F, -2.5F, -2.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(-1.5F)), PartPose.offset(0.5F, -23.5F, -0.2F));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        dome.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bone10.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        bone16.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.dome.yRot = netHeadYaw / (180F / (float) Math.PI);
    }
}
