public class SurfaceAreas 
{
	public static float getSphereSurfaceArea(float p_Radius)
	{
		return 4.f * (float)Math.PI * p_Radius * p_Radius; 
	}
	
	public static float getHemisphereSurfaceArea(float p_Radius)
	{
		return 3.f * (float)Math.PI * p_Radius * p_Radius; 
	}
	
	public static float getTetrahedronSurfaceArea(float p_EdgeLength)
	{
		return (float)Math.sqrt(3.d) * p_EdgeLength * p_EdgeLength; 
	}
	
	public static float getHexahedronSurfaceArea(float p_EdgeLength)
	{
		return 6.f * p_EdgeLength * p_EdgeLength; 
	}
	
	public static float getOctahedronSurfaceArea(float p_EdgeLength)
	{
		return 2.f * (float) Math.sqrt(3.) * p_EdgeLength * p_EdgeLength;
	}
	
	public static float getDodecahedronSurfaceArea(float p_EdgeLength)
	{
		return 3.f * (float) Math.sqrt(25. + 10. * Math.sqrt(5.)) * p_EdgeLength * p_EdgeLength;
	}
	
	public static float getIcosahedronSurfaceArea(float p_EdgeLength)
	{
		return 5.f * (float) Math.sqrt(3.) * p_EdgeLength * p_EdgeLength;
	}
	
	public static float getConeSurfaceArea(float p_Radius, float p_Height)
	{
		return (float) Math.PI * p_Radius * (p_Radius + (float) Math.sqrt(p_Height * p_Height + p_Radius * p_Radius)); 
	}
	
	public static float getTorusSurfaceArea(float p_MajorRad, float p_MinorRad)
	{
		return 4.f * (float) (Math.PI * Math.PI) * p_MinorRad * p_MajorRad;
	}
	
	public static float getCylinderSurfaceArea(float p_Radius, float p_Height)
	{
		return 2.f * (float) Math.PI * p_Radius * (p_Height + p_Radius); 
	}
}
