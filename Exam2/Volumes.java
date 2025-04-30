public class Volumes 
{
	
	public static float getSphereVolume(float p_Radius)
	{
		return 4.f / 3.f * (float)Math.PI * p_Radius * p_Radius * p_Radius; 
	}
	
	public static float getHemisphereVolume(float p_Radius)
	{
		return 2.f / 3.f * (float)Math.PI * p_Radius * p_Radius * p_Radius; 
	}
	
	public static float getTetrahedronVolume(float p_EdgeLength)
	{
		return (float)Math.sqrt(2.d) / 12.f * p_EdgeLength * p_EdgeLength * p_EdgeLength; 
	}
	
	public static float getHexahedronVolume(float p_EdgeLength)
	{
		return p_EdgeLength * p_EdgeLength * p_EdgeLength; 
	}
	
	public static float getOctahedronVolume(float p_EdgeLength)
	{
		return (float) Math.sqrt(2.) / 3.f * p_EdgeLength * p_EdgeLength * p_EdgeLength;
	}
	
	public static float getDodecahedronVolume(float p_EdgeLength)
	{
		return (15.f + 7.f * (float) Math.sqrt(5.)) / 4.f * p_EdgeLength * p_EdgeLength * p_EdgeLength;
	}
	
	public static float getIcosahedronVolume(float p_EdgeLength)
	{
		return 5.f * (3.f + (float) Math.sqrt(5.)) / 12.f * p_EdgeLength * p_EdgeLength * p_EdgeLength;
	}
	
	public static float getConeVolume(float p_Radius, float p_Height)
	{
		return (float) Math.PI * p_Radius * p_Radius * p_Height / 3.f; 
	}
	
	public static float getTorusVolume(float p_MajorRad, float p_MinorRad)
	{
		return 2.f * (float) (Math.PI * Math.PI) * p_MinorRad * p_MinorRad * p_MajorRad;
	}
	
	public static float getCylinderVolume(float p_Radius, float p_Height)
	{
		return (float) Math.PI * p_Radius * p_Radius * p_Height; 
	}
}
