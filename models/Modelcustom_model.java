// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelcustom_model() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.5F, 19.3333F, -1.3333F);
		bone.setTextureOffset(158, 0).addBox(-28.86F, 21.7867F, -10.8267F, 12.0F, 12.0F, 32.0F, 0.0F, false);
		bone.setTextureOffset(0, 72).addBox(-28.86F, -16.4533F, 9.6533F, 12.0F, 40.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(150, 138).addBox(12.1F, 21.7867F, -10.8267F, 12.0F, 12.0F, 32.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(12.1F, -16.4533F, 9.6533F, 12.0F, 40.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 72).addBox(-28.9F, -29.4133F, -10.8267F, 53.0F, 14.0F, 52.0F, 0.0F, false);
		bone.setTextureOffset(0, 138).addBox(-29.9F, -67.6533F, -31.3067F, 54.0F, 40.0F, 21.0F, 0.0F, false);
		bone.setTextureOffset(158, 72).addBox(-19.14F, -47.6533F, -41.5467F, 33.0F, 20.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-28.9F, -47.6533F, -10.8267F, 53.0F, 20.0F, 52.0F, 0.0F, false);
		bone.setTextureOffset(150, 182).addBox(-19.14F, -49.8933F, -51.7867F, 33.0F, 12.0F, 12.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
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