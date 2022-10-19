// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelzombieboss<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "zombieboss"), "main");
	private final ModelPart FullBody;
	private final ModelPart klsopa;
	private final ModelPart solbacak;
	private final ModelPart sabacak;
	private final ModelPart solkol;
	private final ModelPart sakol;
	private final ModelPart kafa;

	public Modelzombieboss(ModelPart root) {
		this.FullBody = root.getChild("FullBody");
		this.klsopa = root.getChild("klsopa");
		this.solbacak = root.getChild("solbacak");
		this.sabacak = root.getChild("sabacak");
		this.solkol = root.getChild("solkol");
		this.sakol = root.getChild("sakol");
		this.kafa = root.getChild("kafa");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition FullBody = partdefinition.addOrReplaceChild("FullBody", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = FullBody.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 24).addBox(-8.0F,
				-8.2F, -2.0F, 16.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition gvde = FullBody.addOrReplaceChild("gvde",
				CubeListBuilder.create().texOffs(0, 41)
						.addBox(-7.4F, -20.6F, 5.6F, 15.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 12)
						.addBox(-5.4F, -11.8F, 4.5F, 11.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-6.7F, -20.5F, -2.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(5.3F, -20.5F, -2.9F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 29)
						.addBox(-5.4F, -10.8F, -2.1F, 11.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-6.7F, -18.6F, -2.9F, 14.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-6.55F, -12.25F, -1.2F, 13.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 14)
						.addBox(-7.0F, -5.45F, -2.3F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 14)
						.addBox(-7.0F, -5.45F, 4.7F, 14.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -11.2F, 0.0F));

		PartDefinition cube_r1 = gvde.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(50, 47)
						.addBox(-0.5F, -0.5F, 17.75F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 47)
						.addBox(-0.5F, -0.5F, 4.75F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.75F, -4.95F, -1.8F, 0.0F, -1.5708F, 0.0F));

		PartDefinition klsopa = partdefinition.addOrReplaceChild("klsopa", CubeListBuilder.create(),
				PartPose.offset(4.25F, -2.0F, -1.25F));

		PartDefinition cube_r2 = klsopa.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 41)
						.addBox(-1.35F, -5.45F, -1.95F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.65F, -5.45F, -2.95F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 29)
						.addBox(-9.35F, -5.05F, -2.45F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 5.4539F, -5.418F, -0.0399F, 1.2478F, 0.0934F));

		PartDefinition cube_r3 = klsopa.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, 9.5F, -11.0F, 1.0F, 1.0F, 23.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.1572F, 0.3614F, -0.4215F));

		PartDefinition cube_r4 = klsopa.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(32, 41)
						.addBox(-4.75F, 6.8F, -4.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-5.05F, 6.8F, -5.75F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 29)
						.addBox(-12.75F, 7.2F, -5.25F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.6824F, -3.6577F, 19.5466F, -0.7629F, -0.9979F, 0.6768F));

		PartDefinition solbacak = partdefinition.addOrReplaceChild("solbacak",
				CubeListBuilder.create().texOffs(25, 0)
						.addBox(2.05F, 17.747F, -7.3613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(0.3F, 17.747F, -7.3613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-1.2F, 17.747F, -7.3613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-2.95F, 17.747F, -7.3613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.55F, 5.003F, 3.5113F));

		PartDefinition cube_r5 = solbacak
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(0, 57).addBox(-3.0F, 0.0F, -4.6F, 6.0F, 6.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r6 = solbacak.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(61, 59).addBox(-3.0F, -1.8F, -3.8F, 6.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.9637F, -4.4174F, 3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r7 = solbacak.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(25, 16)
						.addBox(-3.0F, -9.15F, -3.5F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 43)
						.addBox(-3.0F, -7.9F, -3.5F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.8813F, -4.2931F, -2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r8 = solbacak.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(72, 24).addBox(-3.0F, -1.4F, -0.5F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.1945F, -4.1691F, 2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r9 = solbacak.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(48, 49).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.7855F, -3.2293F, 3.1241F, 0.0F, 0.0F));

		PartDefinition sabacak = partdefinition.addOrReplaceChild("sabacak",
				CubeListBuilder.create().texOffs(25, 0)
						.addBox(-2.95F, 17.747F, -7.3613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(-1.2F, 17.747F, -7.3613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(2.05F, 17.747F, -7.3613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 0)
						.addBox(0.3F, 17.747F, -7.3613F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(3.45F, 5.003F, 3.5113F));

		PartDefinition cube_r10 = sabacak
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(0, 57).addBox(-3.0F, 0.0F, -4.6F, 6.0F, 6.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r11 = sabacak.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(72, 24).addBox(4.0F, -1.4F, -0.5F, 6.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, 16.1945F, -4.1691F, 2.6529F, 0.0F, 0.0F));

		PartDefinition cube_r12 = sabacak.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(25, 16)
						.addBox(-3.0F, -9.15F, -3.5F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 43)
						.addBox(-3.0F, -7.9F, -3.5F, 6.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.8813F, -4.2931F, -2.7576F, 0.0F, 0.0F));

		PartDefinition cube_r13 = sabacak.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(48, 49).addBox(-3.0F, -2.0F, -5.0F, 6.0F, 2.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.7855F, -3.2293F, 3.1241F, 0.0F, 0.0F));

		PartDefinition cube_r14 = sabacak.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(61, 59).addBox(-3.0F, -1.8F, -3.8F, 6.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.9637F, -4.4174F, 3.1241F, 0.0F, 0.0F));

		PartDefinition solkol = partdefinition.addOrReplaceChild("solkol",
				CubeListBuilder.create().texOffs(63, 0)
						.addBox(-5.5F, -3.0485F, -2.2029F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 59)
						.addBox(-6.1F, -3.3485F, -2.9029F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.9F, -5.4515F, 1.9029F));

		PartDefinition cube_r15 = solkol.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(58, 69).addBox(-25.5F, -1.0F, -1.25F, 5.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.5F, 3.8866F, -0.2482F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r16 = solkol.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(68, 47)
						.addBox(-25.05F, -1.5F, -2.75F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-24.5F, -2.5F, -3.75F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, 9.0F, -2.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r17 = solkol.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(19, 65).addBox(-2.5F, 3.8F, -3.2F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -0.2481F, 2.5884F, -0.3927F, 0.0F, 0.0F));

		PartDefinition solparmaklar = solkol.addOrReplaceChild("solparmaklar", CubeListBuilder.create(),
				PartPose.offset(-1.2438F, 7.131F, -9.1324F));

		PartDefinition cube_r18 = solparmaklar.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.2212F, -0.3186F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -0.9885F, 0.6449F, 0.3648F));

		PartDefinition cube_r19 = solparmaklar.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.2212F, -1.6814F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -1.1154F, -0.039F, -0.0312F));

		PartDefinition cube_r20 = solparmaklar.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.3612F, -0.0983F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.645F, 6.0799F, 1.4261F, -2.0615F, 0.2712F, 2.9994F));

		PartDefinition cube_r21 = solparmaklar.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.3612F, -1.9017F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.645F, 6.0799F, 1.4261F, -2.042F, 0.0F, -3.1416F));

		PartDefinition cube_r22 = solparmaklar.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.3612F, -0.0983F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.645F, 4.5799F, 0.4261F, -2.0615F, 0.2712F, 2.9994F));

		PartDefinition cube_r23 = solparmaklar.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.3612F, -1.9017F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.645F, 4.5799F, 0.4261F, -2.042F, 0.0F, -3.1416F));

		PartDefinition cube_r24 = solparmaklar.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.3612F, -0.0983F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.645F, 2.8299F, -0.5739F, -2.0615F, 0.2712F, 2.9994F));

		PartDefinition cube_r25 = solparmaklar.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.3612F, -1.9017F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.645F, 2.8299F, -0.5739F, -2.042F, 0.0F, -3.1416F));

		PartDefinition bone = solparmaklar.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sakol = partdefinition.addOrReplaceChild("sakol",
				CubeListBuilder.create().texOffs(63, 0)
						.addBox(1.0F, -1.9351F, -1.9547F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 59)
						.addBox(0.4F, -2.2351F, -2.6547F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(7.6F, -6.5649F, 1.6547F));

		PartDefinition cube_r26 = sakol
				.addOrReplaceChild("cube_r26",
						CubeListBuilder.create().texOffs(58, 69).addBox(-2.5F, -1.0F, -1.25F, 5.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.0F, 5.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r27 = sakol.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(68, 47)
						.addBox(-2.0F, -1.5F, -2.75F, 5.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.5F, -2.5F, -3.75F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 10.1134F, -1.7518F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r28 = sakol.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(19, 65).addBox(-2.5F, 3.8F, -3.2F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 0.8653F, 2.8365F, -0.3927F, 0.0F, 0.0F));

		PartDefinition saparmaklar = sakol.addOrReplaceChild("saparmaklar", CubeListBuilder.create(),
				PartPose.offset(5.4169F, 11.1164F, -7.5408F));

		PartDefinition cube_r29 = saparmaklar.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -0.3F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, -1.0322F, 0.4843F, 0.2713F));

		PartDefinition cube_r30 = saparmaklar.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0831F, 2.5485F, 0.8861F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r31 = saparmaklar.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5573F, 0.4848F, 0.5038F, -1.0801F, 0.2712F, 0.1422F));

		PartDefinition cube_r32 = saparmaklar.addOrReplaceChild("cube_r32",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0831F, 0.7485F, -0.0139F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r33 = saparmaklar.addOrReplaceChild("cube_r33",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0831F, -0.4515F, -1.1139F, -1.0996F, 0.0F, 0.0F));

		PartDefinition cube_r34 = saparmaklar.addOrReplaceChild("cube_r34",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, 1.5F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5573F, -0.7152F, -0.5962F, -1.0801F, 0.2712F, 0.1422F));

		PartDefinition cube_r35 = saparmaklar.addOrReplaceChild("cube_r35",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0315F, 0.6201F, -1.6978F, -2.3194F, 0.5714F, 2.6191F));

		PartDefinition cube_r36 = saparmaklar.addOrReplaceChild("cube_r36",
				CubeListBuilder.create().texOffs(0, 2).addBox(-0.3612F, -1.9017F, -0.5F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.7557F, 0.7578F, -1.9173F, -2.1811F, -0.0462F, 3.117F));

		PartDefinition kafa = partdefinition.addOrReplaceChild("kafa",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.3F, -3.5F, -3.9F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.7F, -4.1F, -3.9F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.1F, -3.5F, -3.9F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-1.0F, -1.5F, -3.9F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(0.7F, -1.5F, -3.9F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-3.3F, -1.5F, -3.9F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 20)
						.addBox(-4.0F, -3.4F, -0.9F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(3.9F, -3.6F, -3.7F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(3.9F, -4.3F, -2.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-3.5F, -3.6F, -3.4F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 12)
						.addBox(-3.5F, -4.2F, -2.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-4.0F, -6.2F, 1.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -7.8F, 0.1F));

		PartDefinition cube_r37 = kafa
				.addOrReplaceChild("cube_r37",
						CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -0.6F, 0.0F, 1.0F, 2.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.6F, -1.5F, -3.9F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r38 = kafa.addOrReplaceChild("cube_r38",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.6F, 0.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3F, -2.5F, -3.9F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r39 = kafa.addOrReplaceChild("cube_r39",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, -1.6F, 0.0F, 1.0F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3F, -2.5F, -3.9F, -0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r40 = kafa.addOrReplaceChild("cube_r40",
				CubeListBuilder.create().texOffs(65, 36)
						.addBox(3.5F, -2.0F, -4.65F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(65, 36)
						.addBox(-4.5F, -2.0F, -4.65F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 69)
						.addBox(-3.5F, -2.0F, 2.6F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 70)
						.addBox(-3.5F, -2.0F, -5.4F, 7.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 16)
						.addBox(-4.0F, -2.5F, -4.9F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.0216F, 1.1548F, -0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r41 = kafa
				.addOrReplaceChild("cube_r41",
						CubeListBuilder.create().texOffs(40, 33).addBox(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		PartDefinition dil = kafa.addOrReplaceChild("dil", CubeListBuilder.create(),
				PartPose.offset(-0.224F, -4.3813F, -3.95F));

		PartDefinition cube_r42 = dil.addOrReplaceChild("cube_r42",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-0.6F, -0.2017F, -2.25F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-0.2F, -0.2017F, -1.85F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(-1.1F, -0.3017F, -2.85F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 0)
						.addBox(-0.7F, -0.3017F, -4.65F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(-0.8F, -0.3017F, -2.85F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(11, 0)
						.addBox(-1.3F, -0.2017F, -4.65F, 2.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(-1.0F, -0.2017F, -3.55F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 0)
						.addBox(-1.0F, -0.2017F, -2.55F, 2.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, 0.0F, 3.1416F, 0.0F, 3.1241F));

		PartDefinition balta = kafa.addOrReplaceChild("balta", CubeListBuilder.create().texOffs(18, 3)
				.addBox(-4.7145F, -0.0607F, 1.9892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-5.0145F, -0.0607F, 1.1892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-5.0145F, -0.0607F, 0.2892F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-4.7145F, -0.0607F, -0.4108F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-3.8145F, -0.0607F, -0.1608F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-3.8145F, -0.0607F, 1.8392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-2.9145F, -0.0607F, 1.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-2.9145F, -0.0607F, 0.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-2.2145F, -0.0607F, 0.4392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-2.2145F, -0.0607F, 1.3392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-1.5145F, -0.0607F, 1.1392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 3)
				.addBox(-1.5145F, -0.0607F, 0.7392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 43)
				.addBox(-4.2145F, -0.0607F, 0.2392F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(19, 50)
				.addBox(-1.7145F, -0.0607F, -7.9608F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5571F, -12.45F, -0.2786F, -1.1781F, 0.0F, -1.1781F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		FullBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		klsopa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		solbacak.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		sabacak.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		solkol.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		sakol.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		kafa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.kafa.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.kafa.xRot = headPitch / (180F / (float) Math.PI);
		this.solkol.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.sabacak.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.solbacak.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.sakol.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}