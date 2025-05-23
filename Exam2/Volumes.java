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
}
