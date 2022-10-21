// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class mustafa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mustafa"), "main");
	private final ModelPart kafaust;
	private final ModelPart govde;

	public mustafa(ModelPart root) {
		this.kafaust = root.getChild("kafaust");
		this.govde = root.getChild("govde");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition kafaust = partdefinition.addOrReplaceChild("kafaust", CubeListBuilder.create(), PartPose.offset(-0.0763F, -41.0196F, -13.4721F));

		PartDefinition cube_r1 = kafaust.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 19).addBox(4.9871F, -2.9609F, -4.6391F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(80, 69).addBox(-10.3129F, -1.9609F, -0.5391F, 2.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(0, 53).addBox(-9.1129F, -2.9609F, -1.5391F, 2.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(102, 28).addBox(-4.4129F, -1.9609F, -7.5391F, 9.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(96, 96).addBox(-5.4129F, -2.9609F, -6.0391F, 11.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(92, 36).addBox(-5.4129F, -4.9609F, -4.7391F, 11.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(46, 3).addBox(-7.1129F, -2.9609F, -4.6391F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-7.4129F, -4.9609F, -1.5391F, 15.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 81).addBox(8.3871F, -1.9609F, -0.5391F, 2.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(58, 59).addBox(6.9871F, -2.9609F, -1.5391F, 2.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(-6.4129F, -5.9609F, -0.5391F, 13.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1047F, 0.0F, 0.0175F));

		PartDefinition cube_r2 = kafaust.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -16.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 3).addBox(-3.2F, -2.9F, -16.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 0).addBox(-5.5F, -4.9F, -16.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 19).addBox(-5.5F, -4.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(-3.2F, -2.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 22).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.7766F, 5.7834F, 5.9474F, 1.5497F, -0.7504F, 1.586F));

		PartDefinition cube_r3 = kafaust.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(10, 3).addBox(1.0F, 1.6F, -3.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(1.0F, 1.6F, 9.3F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 38).addBox(-0.3F, 0.2F, 3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 41).addBox(-0.3F, 0.2F, 1.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 44).addBox(-0.3F, 0.2F, 5.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 38).addBox(-0.3F, 0.2F, 7.1F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 41).addBox(-0.3F, 0.2F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6351F, 4.6852F, -6.3094F, 1.5515F, -0.6457F, 1.5832F));

		PartDefinition kafaalt = kafaust.addOrReplaceChild("kafaalt", CubeListBuilder.create(), PartPose.offset(-3.6882F, 13.4596F, -3.3197F));

		PartDefinition cube_r4 = kafaalt.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(70, 96).addBox(-5.4201F, -4.5649F, -5.438F, 11.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(70, 89).addBox(-5.4201F, -6.5649F, -4.138F, 11.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(-7.1201F, -4.5649F, -4.038F, 2.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(22, 75).addBox(-10.3201F, -3.5649F, 0.062F, 2.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(38, 51).addBox(-9.1201F, -4.5649F, -0.938F, 2.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-7.4201F, -6.5649F, -0.938F, 15.0F, 3.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(74, 37).addBox(8.3799F, -3.5649F, 0.062F, 2.0F, 6.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(46, 3).addBox(6.9799F, -4.5649F, -0.938F, 2.0F, 8.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(4.9799F, -4.5649F, -4.038F, 2.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(92, 43).addBox(-4.4201F, -3.5649F, -6.938F, 9.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8159F, 1.2632F, 5.3848F, -0.4712F, -0.0002F, -3.1329F));

		PartDefinition cube_r5 = kafaalt.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 53).addBox(-7.5F, -3.2F, 0.2F, 15.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8903F, -11.4519F, 16.8176F, 0.0873F, 0.0F, 0.0175F));

		PartDefinition cube_r6 = kafaalt.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 19).addBox(-7.5F, -3.0F, -1.7F, 15.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7715F, -4.6428F, 19.5129F, 0.2007F, 0.0F, 0.0175F));

		PartDefinition cube_r7 = kafaalt.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(46, 44).addBox(7.3F, 8.9F, -4.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(40, 47).addBox(5.6F, 6.9F, 11.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(46, 47).addBox(3.8F, 4.8F, 11.6F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 53).addBox(7.3F, 8.9F, 11.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 53).addBox(5.6F, 6.9F, -4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(55, 3).addBox(0.3F, 0.3F, 9.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 56).addBox(3.8F, 4.8F, -4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 56).addBox(2.3F, 2.8F, -4.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 51).addBox(2.0F, 2.5F, 11.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 54).addBox(0.3F, 0.3F, -2.9F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 57).addBox(-0.6F, -0.9F, 5.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 59).addBox(-0.6F, -0.9F, 7.2F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(6, 59).addBox(-0.6F, -0.9F, 3.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(58, 60).addBox(-0.6F, -0.9F, 1.4F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 62).addBox(-0.6F, -0.9F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5329F, -1.1517F, 1.6062F));

		PartDefinition govde = partdefinition.addOrReplaceChild("govde", CubeListBuilder.create().texOffs(40, 38).addBox(-4.0562F, 2.4447F, -6.5F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(32, 95).addBox(-0.0562F, -13.9518F, -2.2546F, 4.0F, 17.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9438F, 20.49F, 0.1522F));

		PartDefinition cube_r8 = govde.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 3).addBox(-7.5F, -3.2F, 2.1F, 15.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0696F, -59.5019F, -0.1264F, 0.0873F, 0.0F, 0.0175F));

		PartDefinition cube_r9 = govde.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(98, 63).addBox(-2.0F, -27.9F, -6.8F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9438F, -0.3401F, -0.4659F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r10 = govde.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 60).addBox(1.7F, -2.2F, 1.1F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 116).addBox(17.8F, -2.2F, -5.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(46, 27).addBox(-1.7F, -2.2F, -1.7F, 23.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(104, 106).addBox(4.4F, -2.2F, -5.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(110, 54).addBox(6.4F, -2.2F, -5.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(0, 112).addBox(8.2F, -2.2F, -5.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(114, 1).addBox(10.4F, -2.2F, -5.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(114, 65).addBox(12.7F, -2.2F, -5.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(114, 76).addBox(15.2F, -2.2F, -5.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(78, 57).addBox(1.7F, -2.2F, -4.5F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(82, 106).addBox(2.5F, -2.2F, -5.7F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5482F));

		PartDefinition cube_r11 = govde.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(54, 83).addBox(-2.0F, -31.7F, -4.1F, 4.0F, 28.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9438F, -23.5565F, 7.9861F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r12 = govde.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(46, 30).addBox(9.05F, 13.5F, 1.8F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 101).addBox(9.85F, 13.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(102, 0).addBox(11.75F, 13.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(102, 83).addBox(13.75F, 13.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(12, 106).addBox(15.55F, 13.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(106, 17).addBox(17.75F, 13.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(38, 106).addBox(20.05F, 13.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(106, 43).addBox(22.55F, 13.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(62, 33).addBox(9.05F, 13.5F, -3.8F, 18.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(60, 106).addBox(25.15F, 13.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(46, 0).addBox(5.65F, 13.5F, -1.0F, 23.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.7799F, -4.546F, -0.7F, 0.0F, 0.0F, -0.6807F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		kafaust.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		govde.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}