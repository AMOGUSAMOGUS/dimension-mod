// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer crown;
	private final ModelRenderer Body;
	private final ModelRenderer BlazeRod1;
	private final ModelRenderer BlazeRod2;
	private final ModelRenderer BlazeRod3;
	private final ModelRenderer BlazeRod4;
	private final ModelRenderer BlazeRod5;
	private final ModelRenderer BlazeRod6;
	private final ModelRenderer BlazeRod7;
	private final ModelRenderer BlazeRod8;
	private final ModelRenderer BlazeRod9;
	private final ModelRenderer BlazeRod10;
	private final ModelRenderer BlazeRod11;
	private final ModelRenderer BlazeRod12;
	private final ModelRenderer BlazeRod13;
	private final ModelRenderer BlazeRod14;
	private final ModelRenderer BlazeRod15;
	private final ModelRenderer BlazeRod16;
	private final ModelRenderer BlazeRod17;
	private final ModelRenderer BlazeRod18;
	private final ModelRenderer BlazeRod19;
	private final ModelRenderer BlazeRod20;
	private final ModelRenderer BlazeRod21;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 24.0F, 0.0F);
		Head.setTextureOffset(14, 12).addBox(-3.0F, -24.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		crown = new ModelRenderer(this);
		crown.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(crown);
		crown.setTextureOffset(20, 9).addBox(-2.0F, -25.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		crown.setTextureOffset(20, 9).addBox(-2.0F, -25.0F, 1.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		crown.setTextureOffset(8, 18).addBox(1.0F, -25.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		crown.setTextureOffset(8, 18).addBox(-2.0F, -25.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		crown.setTextureOffset(16, 0).addBox(-2.0F, -26.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		crown.setTextureOffset(16, 0).addBox(0.0F, -26.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		crown.setTextureOffset(16, 0).addBox(1.0F, -26.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		crown.setTextureOffset(16, 0).addBox(1.0F, -26.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		crown.setTextureOffset(16, 0).addBox(-1.0F, -26.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		crown.setTextureOffset(16, 0).addBox(-2.0F, -26.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.setTextureOffset(0, 0).addBox(-3.0F, -18.0F, -2.0F, 6.0F, 14.0F, 4.0F, 0.0F, false);

		BlazeRod1 = new ModelRenderer(this);
		BlazeRod1.setRotationPoint(0.0F, 24.0F, 0.0F);
		BlazeRod1.setTextureOffset(36, 0).addBox(5.0F, -11.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod2 = new ModelRenderer(this);
		BlazeRod2.setRotationPoint(0.0F, 24.0F, 0.0F);
		BlazeRod2.setTextureOffset(36, 0).addBox(-7.0F, -11.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod3 = new ModelRenderer(this);
		BlazeRod3.setRotationPoint(0.0F, 24.0F, 12.0F);
		BlazeRod3.setTextureOffset(36, 0).addBox(5.0F, -11.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod4 = new ModelRenderer(this);
		BlazeRod4.setRotationPoint(-12.0F, 24.0F, 12.0F);
		BlazeRod4.setTextureOffset(36, 0).addBox(5.0F, -11.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod5 = new ModelRenderer(this);
		BlazeRod5.setRotationPoint(3.0F, 22.0F, -2.0F);
		BlazeRod5.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod6 = new ModelRenderer(this);
		BlazeRod6.setRotationPoint(9.0F, 22.0F, -2.0F);
		BlazeRod6.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod7 = new ModelRenderer(this);
		BlazeRod7.setRotationPoint(14.0F, 22.0F, 3.0F);
		BlazeRod7.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod8 = new ModelRenderer(this);
		BlazeRod8.setRotationPoint(14.0F, 22.0F, 9.0F);
		BlazeRod8.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod9 = new ModelRenderer(this);
		BlazeRod9.setRotationPoint(9.0F, 22.0F, 14.0F);
		BlazeRod9.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod10 = new ModelRenderer(this);
		BlazeRod10.setRotationPoint(3.0F, 22.0F, 14.0F);
		BlazeRod10.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod11 = new ModelRenderer(this);
		BlazeRod11.setRotationPoint(-2.0F, 22.0F, 9.0F);
		BlazeRod11.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod12 = new ModelRenderer(this);
		BlazeRod12.setRotationPoint(-2.0F, 22.0F, 3.0F);
		BlazeRod12.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod13 = new ModelRenderer(this);
		BlazeRod13.setRotationPoint(0.0F, 12.0F, 1.0F);
		BlazeRod13.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod14 = new ModelRenderer(this);
		BlazeRod14.setRotationPoint(12.0F, 12.0F, 0.0F);
		BlazeRod14.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod15 = new ModelRenderer(this);
		BlazeRod15.setRotationPoint(0.0F, 14.0F, 6.0F);
		BlazeRod15.setTextureOffset(36, 0).addBox(-7.0F, -15.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod16 = new ModelRenderer(this);
		BlazeRod16.setRotationPoint(12.0F, 13.0F, 6.0F);
		BlazeRod16.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod17 = new ModelRenderer(this);
		BlazeRod17.setRotationPoint(11.0F, 11.0F, 11.0F);
		BlazeRod17.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod18 = new ModelRenderer(this);
		BlazeRod18.setRotationPoint(1.0F, 11.0F, 11.0F);
		BlazeRod18.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod19 = new ModelRenderer(this);
		BlazeRod19.setRotationPoint(6.0F, 15.0F, 12.0F);
		BlazeRod19.setTextureOffset(36, 0).addBox(-7.0F, -14.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod20 = new ModelRenderer(this);
		BlazeRod20.setRotationPoint(12.0F, 9.0F, 0.0F);
		BlazeRod20.setTextureOffset(36, 0).addBox(-16.0F, -15.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		BlazeRod21 = new ModelRenderer(this);
		BlazeRod21.setRotationPoint(12.0F, 9.0F, 0.0F);
		BlazeRod21.setTextureOffset(36, 0).addBox(-10.0F, -15.0F, -7.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod1.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod2.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod3.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod4.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod5.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod6.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod7.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod8.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod9.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod10.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod11.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod12.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod13.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod14.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod15.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod16.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod17.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod18.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod19.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod20.render(matrixStack, buffer, packedLight, packedOverlay);
		BlazeRod21.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}