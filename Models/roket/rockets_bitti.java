// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class rocket<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "rocket"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone4;
	private final ModelPart bone5;
	private final ModelPart bone6;
	private final ModelPart bone7;
	private final ModelPart bone8;

	public rocket(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bone3 = root.getChild("bone3");
		this.bone4 = root.getChild("bone4");
		this.bone5 = root.getChild("bone5");
		this.bone6 = root.getChild("bone6");
		this.bone7 = root.getChild("bone7");
		this.bone8 = root.getChild("bone8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(-32.0F, -55.15F, 86.875F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-32.0F, -55.15F, 103.175F));

		PartDefinition bone3 = partdefinition.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-42.9F, -55.15F, 96.875F));

		PartDefinition bone4 = partdefinition.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-40.5F, -55.15F, 96.875F));

		PartDefinition bone5 = partdefinition.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offset(-17.0F, -37.7F, -29.2F));

		PartDefinition bone6 = partdefinition.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offset(-17.0F, -37.7F, -29.2F));

		PartDefinition bone7 = partdefinition.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offset(-17.0F, -37.7F, -29.2F));

		PartDefinition bone8 = partdefinition.addOrReplaceChild("bone8", CubeListBuilder.create().texOffs(0, 0).addBox(-45.3604F, -198.45F, -23.4494F, 27.0F, 190.0F, 49.0F, new CubeDeformation(0.0F))
		.texOffs(152, 0).addBox(-107.5604F, -198.45F, -23.3494F, 27.0F, 190.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(364, 388).addBox(-34.8604F, -161.45F, -19.4494F, 24.0F, 112.0F, 40.0F, new CubeDeformation(0.0F))
		.texOffs(0, 239).addBox(-113.8604F, -161.45F, -19.4494F, 9.0F, 112.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offset(32.3604F, -14.75F, 53.6494F));

		PartDefinition cube_r1 = bone8.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(400, 636).addBox(-15.8311F, -3.3627F, 7.9019F, 15.0F, 39.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(338, 636).addBox(-15.8311F, -3.3627F, -24.0981F, 15.0F, 39.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0085F, 0.0153F, -0.5062F));

		PartDefinition cube_r2 = bone8.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(522, 247).addBox(4.3786F, -31.3038F, -24.0981F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(650, 45).addBox(4.3786F, -31.3038F, -8.0981F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(586, 660).addBox(4.3786F, -31.3038F, 7.8019F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0077F, 0.0157F, -0.4538F));

		PartDefinition cube_r3 = bone8.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(648, 660).addBox(3.2086F, 6.95F, 7.9019F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(444, 492).addBox(-24.4914F, -37.45F, -24.0981F, 27.0F, 29.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(404, 305).addBox(-24.7914F, -8.95F, -24.0981F, 43.0F, 16.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(62, 662).addBox(3.2086F, 6.95F, -24.0981F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0175F, 0.0F));

		PartDefinition cube_r4 = bone8.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(462, 644).addBox(-15.7074F, -3.2941F, -24.0F, 15.0F, 39.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(648, 414).addBox(-15.7074F, -3.2941F, 8.0F, 15.0F, 39.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-121.2604F, 0.5F, 0.1006F, -3.1331F, 0.0153F, -2.6354F));

		PartDefinition cube_r5 = bone8.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(124, 662).addBox(4.5057F, -31.2418F, -24.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(680, 523).addBox(4.5057F, -31.2418F, -8.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(186, 688).addBox(4.5057F, -31.2418F, 7.9F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-121.2604F, 0.5F, 0.1006F, -3.1339F, 0.0157F, -2.6877F));

		PartDefinition cube_r6 = bone8.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(288, 688).addBox(3.35F, 6.95F, 8.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(522, 170).addBox(-24.35F, -37.45F, -24.0F, 27.0F, 29.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(468, 29).addBox(-24.65F, -8.95F, -24.0F, 43.0F, 16.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(688, 599).addBox(3.35F, 6.95F, -24.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-121.2604F, 0.5F, 0.1006F, -3.1416F, 0.0175F, 3.1416F));

		PartDefinition cube_r7 = bone8.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 649).addBox(-15.7074F, -3.2941F, -24.0F, 15.0F, 39.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(242, 649).addBox(-15.7074F, -3.2941F, 8.0F, 15.0F, 39.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-65.3604F, -0.1F, 60.3006F, 1.5348F, -1.0644F, -1.5393F));

		PartDefinition cube_r8 = bone8.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(691, 121).addBox(4.5057F, -31.2418F, -24.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(350, 691).addBox(4.5057F, -31.2418F, -8.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(412, 691).addBox(4.5057F, -31.2418F, 7.9F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-65.3604F, -0.1F, 60.3006F, 1.531F, -1.1167F, -1.535F));

		PartDefinition cube_r9 = bone8.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(694, 453).addBox(3.35F, 6.95F, 8.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(538, 247).addBox(-24.35F, -37.45F, -24.0F, 27.0F, 29.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(118, 476).addBox(-24.65F, -8.95F, -24.0F, 43.0F, 16.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(694, 692).addBox(3.35F, 6.95F, -24.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-65.3604F, -0.1F, 60.3006F, 0.0F, -1.5533F, 0.0F));

		PartDefinition cube_r10 = bone8.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(656, 231).addBox(-4.1F, -23.1F, -40.0F, 15.0F, 39.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(524, 660).addBox(-4.1F, -23.1F, -8.0F, 15.0F, 39.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-49.3604F, 22.85F, -61.6494F, -1.5708F, 1.0647F, -1.5708F));

		PartDefinition cube_r11 = bone8.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(702, 198).addBox(-15.0F, -16.0F, -8.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(474, 699).addBox(-15.0F, -16.0F, 8.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(696, 0).addBox(-15.0F, -16.0F, 23.9F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-81.3604F, -22.35F, -73.0494F, -1.5708F, 1.117F, -1.5708F));

		PartDefinition cube_r12 = bone8.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(702, 270).addBox(1.55F, 6.95F, 8.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(118, 540).addBox(-26.15F, -37.45F, -24.0F, 27.0F, 29.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(487, 106).addBox(-26.45F, -8.95F, -24.0F, 43.0F, 16.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(0, 704).addBox(1.55F, 6.95F, -24.0F, 15.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-65.3604F, -0.1F, -63.9994F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r13 = bone8.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(404, 154).addBox(-51.2F, -51.0F, 0.1F, 24.0F, 116.0F, 35.0F, new CubeDeformation(0.0F))
		.texOffs(0, 441).addBox(28.1F, -51.0F, 0.1F, 24.0F, 114.0F, 35.0F, new CubeDeformation(0.0F))
		.texOffs(254, 428).addBox(-8.6F, 88.9F, 0.5F, 23.0F, 29.0F, 26.0F, new CubeDeformation(0.0F))
		.texOffs(364, 569).addBox(-16.6F, 82.1F, -4.5F, 38.0F, 29.0F, 38.0F, new CubeDeformation(0.0F))
		.texOffs(302, 0).addBox(-28.6F, 73.7F, -7.0F, 59.0F, 29.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(103, 0).addBox(-44.8F, -88.1F, -20.9F, 27.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(254, 0).addBox(-44.8F, -87.9F, 40.8F, 27.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 391).addBox(18.2F, -87.9F, -22.1F, 27.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(452, 369).addBox(18.2F, -87.9F, 40.8F, 27.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(593, 369).addBox(-28.8F, -87.8F, 48.9F, 58.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(547, 539).addBox(-53.8F, -87.9F, -5.7F, 27.0F, 29.0F, 47.0F, new CubeDeformation(0.0F))
		.texOffs(546, 462).addBox(27.4F, -87.9F, -6.7F, 27.0F, 29.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(586, 324).addBox(-29.8F, -88.0F, -31.8F, 60.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-3.8F, -167.5F, 13.7F, 9.0F, 38.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(602, 0).addBox(-12.8F, -145.8F, 8.7F, 27.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(0, 590).addBox(-12.8F, -133.9F, 25.4F, 27.0F, 43.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(268, 586).addBox(-12.8F, -134.3F, -7.1F, 27.0F, 47.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(516, 615).addBox(18.4F, -103.0F, 9.0F, 27.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(252, 492).addBox(2.8F, -120.0F, -6.7F, 27.0F, 46.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(621, 93).addBox(-27.9F, -133.7F, 9.0F, 27.0F, 28.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(492, 369).addBox(-28.5F, -120.0F, -6.2F, 27.0F, 46.0F, 47.0F, new CubeDeformation(0.0F))
		.texOffs(602, 615).addBox(-12.8F, -103.0F, 40.1F, 27.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(86, 617).addBox(-12.8F, -103.0F, -22.1F, 27.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(172, 617).addBox(-44.5F, -103.0F, 9.0F, 27.0F, 29.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(624, 170).addBox(2.6F, -133.9F, 9.0F, 27.0F, 28.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(302, 77).addBox(-28.6F, -103.0F, -7.0F, 59.0F, 29.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(104, 238).addBox(-44.4F, -88.0F, -6.9F, 27.0F, 190.0F, 48.0F, new CubeDeformation(0.0F))
		.texOffs(254, 190).addBox(18.4F, -88.0F, -6.9F, 27.0F, 190.0F, 48.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-48.3604F, -110.45F, -0.9494F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone5.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone6.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone7.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone8.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}