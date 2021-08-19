public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer stick1;
	private final ModelRenderer stick1_reverse;
	private final ModelRenderer head2;private final ModelRenderer 2 stick;private final ModelRenderer 3 stick;private final ModelRenderer 4 stick;private final ModelRenderer 5 stick;private final ModelRenderer 6 stick;private final ModelRenderer 7 stick;private final ModelRenderer 8 stick;private final ModelRenderer 9 stick;private final ModelRenderer 10 stick;private final ModelRenderer 11 stick;private final ModelRenderer 12 stick;
	private final ModelRenderer stick2;
	private final ModelRenderer stick3;
	private final ModelRenderer stick4;
	private final ModelRenderer stick5;
	private final ModelRenderer stick6;
	private final ModelRenderer stick7;
	private final ModelRenderer stick8;
	private final ModelRenderer stick9;
	private final ModelRenderer stick10;
	private final ModelRenderer stick11;
	private final ModelRenderer stick12;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick1 = new ModelRenderer(this);
		stick1.setRotationPoint(7.0F, -2.0F, -7.0F);
		stick1.setTextureOffset(0, 16).addBox(-15.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		stick1_reverse = new ModelRenderer(this);
		stick1_reverse.setRotationPoint(-7.0F, 26.0F, 7.0F);
		stick1.addChild(stick1_reverse);
		

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -24.0F, 0.0F);
		stick1_reverse.addChild(head2);
		head2.setTextureOffset(0, 0).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		2stick = new ModelRenderer(this);
		2stick.setRotationPoint(-7.0F, -26.0F, -7.0F);
		stick1_reverse.addChild(2stick);
		2stick.setTextureOffset(0, 16).addBox(13.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		3stick = new ModelRenderer(this);
		3stick.setRotationPoint(-7.0F, -26.0F, 7.0F);
		stick1_reverse.addChild(3stick);
		3stick.setTextureOffset(0, 16).addBox(13.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		4stick = new ModelRenderer(this);
		4stick.setRotationPoint(7.0F, -26.0F, 7.0F);
		stick1_reverse.addChild(4stick);
		4stick.setTextureOffset(0, 16).addBox(-15.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		5stick = new ModelRenderer(this);
		5stick.setRotationPoint(5.0F, -22.0F, -5.0F);
		stick1_reverse.addChild(5stick);
		5stick.setTextureOffset(0, 16).addBox(-11.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		6stick = new ModelRenderer(this);
		6stick.setRotationPoint(-5.0F, -22.0F, -5.0F);
		stick1_reverse.addChild(6stick);
		6stick.setTextureOffset(0, 16).addBox(9.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		7stick = new ModelRenderer(this);
		7stick.setRotationPoint(-5.0F, -22.0F, 5.0F);
		stick1_reverse.addChild(7stick);
		7stick.setTextureOffset(0, 16).addBox(9.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		8stick = new ModelRenderer(this);
		8stick.setRotationPoint(5.0F, -22.0F, 5.0F);
		stick1_reverse.addChild(8stick);
		8stick.setTextureOffset(0, 16).addBox(-11.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		9stick = new ModelRenderer(this);
		9stick.setRotationPoint(3.0F, -14.0F, -3.0F);
		stick1_reverse.addChild(9stick);
		9stick.setTextureOffset(0, 16).addBox(-7.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		10stick = new ModelRenderer(this);
		10stick.setRotationPoint(-3.0F, -14.0F, -3.0F);
		stick1_reverse.addChild(10stick);
		10stick.setTextureOffset(0, 16).addBox(5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		11stick = new ModelRenderer(this);
		11stick.setRotationPoint(-3.0F, -14.0F, 3.0F);
		stick1_reverse.addChild(11stick);
		11stick.setTextureOffset(0, 16).addBox(5.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		12stick = new ModelRenderer(this);
		12stick.setRotationPoint(3.0F, -14.0F, 3.0F);
		stick1_reverse.addChild(12stick);
		12stick.setTextureOffset(0, 16).addBox(-7.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		stick2 = new ModelRenderer(this);
		stick2.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick3 = new ModelRenderer(this);
		stick3.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick4 = new ModelRenderer(this);
		stick4.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick5 = new ModelRenderer(this);
		stick5.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick6 = new ModelRenderer(this);
		stick6.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick7 = new ModelRenderer(this);
		stick7.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick8 = new ModelRenderer(this);
		stick8.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick9 = new ModelRenderer(this);
		stick9.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick10 = new ModelRenderer(this);
		stick10.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick11 = new ModelRenderer(this);
		stick11.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stick12 = new ModelRenderer(this);
		stick12.setRotationPoint(0.0F, 24.0F, 0.0F);
		
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		stick1.render(matrixStack, buffer, packedLight, packedOverlay);
		stick2.render(matrixStack, buffer, packedLight, packedOverlay);
		stick3.render(matrixStack, buffer, packedLight, packedOverlay);
		stick4.render(matrixStack, buffer, packedLight, packedOverlay);
		stick5.render(matrixStack, buffer, packedLight, packedOverlay);
		stick6.render(matrixStack, buffer, packedLight, packedOverlay);
		stick7.render(matrixStack, buffer, packedLight, packedOverlay);
		stick8.render(matrixStack, buffer, packedLight, packedOverlay);
		stick9.render(matrixStack, buffer, packedLight, packedOverlay);
		stick10.render(matrixStack, buffer, packedLight, packedOverlay);
		stick11.render(matrixStack, buffer, packedLight, packedOverlay);
		stick12.render(matrixStack, buffer, packedLight, packedOverlay);
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