// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfireball_model extends EntityModel<Entity> {
	private final ModelRenderer Fireball;

	public Modelfireball_model() {
		textureWidth = 64;
		textureHeight = 64;

		Fireball = new ModelRenderer(this);
		Fireball.setRotationPoint(0.0F, 18.0F, -5.0F);
		setRotationAngle(Fireball, -1.5708F, 0.0F, 0.0F);
		Fireball.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 12).addBox(-3.0F, -8.0F, -5.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		Fireball.setTextureOffset(30, 0).addBox(1.0F, -10.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(25, 21).addBox(1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(16, 28).addBox(-3.0F, -10.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(25, 16).addBox(-3.0F, -2.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 28).addBox(-5.0F, -8.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(24, 8).addBox(3.0F, -8.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(26, 26).addBox(-5.0F, -4.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(24, 4).addBox(3.0F, -4.0F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Fireball.setTextureOffset(20, 0).addBox(1.0F, -9.0F, 3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		Fireball.setTextureOffset(18, 17).addBox(1.0F, -2.0F, 3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 19).addBox(-3.0F, -9.0F, 3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		Fireball.setTextureOffset(11, 16).addBox(-3.0F, -2.0F, 3.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		Fireball.setTextureOffset(20, 23).addBox(-4.0F, -8.0F, 3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Fireball.setTextureOffset(15, 21).addBox(3.0F, -8.0F, 3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Fireball.setTextureOffset(7, 20).addBox(3.0F, -4.0F, 3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Fireball.setTextureOffset(0, 23).addBox(-4.0F, -4.0F, 3.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Fireball.setTextureOffset(14, 14).addBox(-3.0F, -2.0F, 0.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		Fireball.setTextureOffset(14, 12).addBox(-3.0F, -9.0F, 0.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Fireball.setTextureOffset(12, 25).addBox(-4.0F, -9.0F, 0.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		Fireball.setTextureOffset(8, 25).addBox(3.0F, -9.0F, 0.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Fireball.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}