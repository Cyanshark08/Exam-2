import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Exam2 
{

	public static void main(String[] args) 
	{
		
		ArrayList<Float> thing = new ArrayList<Float>();

	}
	
	
//************************************************************************************************************
//Utility Methods
	
	public static void printShapes(ArrayList<ArrayList<float[]>> p_ShapeLists)
	{
		for(byte i = 0; i < 10; i++)
		{
			for(float[] shape : p_ShapeLists.get(i))
				printShape(shape, i);
		}
	}
	
	public static void printShape(float[] p_ShapeParams, byte p_Index)
	{
		switch(p_Index)
		{
		case 0:
			printSphere(p_ShapeParams);
			break;
		case 1:
			printHemisphere(p_ShapeParams);
			break;
		case 2:
			printTetrahedron(p_ShapeParams);
			break;
		case 3:
			printHexahedron(p_ShapeParams);
			break;
		case 4:
			printOctahedron(p_ShapeParams);
			break;
		case 5:
			printDodecahedron(p_ShapeParams);
			break;
		case 6:
			printIcosahedron(p_ShapeParams);
			break;
		case 7:
			printCone(p_ShapeParams);
			break;
		case 8:
			printTorus(p_ShapeParams);
			break;
		case 9:
			printCylinder(p_ShapeParams);
			break;
		default:
			System.out.println("ERROR: Invalid shape index");
		}
	}

	public static void printSphere(float[] p_Radius)
	{
		System.out.printf("Radius: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_Radius[0]);
	}
	
	public static void printHemisphere(float[] p_Radius)
	{
		System.out.printf("Radius: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_Radius[0]);
	}

	public static void printTetrahedron(float[] p_EdgeLength)
	{
		System.out.printf("\n\tEdge Length: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_EdgeLength[0]);
	}
	
	//cube
	public static void printHexahedron(float[] p_EdgeLength)
	{
		System.out.printf("\n\tEdge Length: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_EdgeLength[0]);
	}
	
	public static void printOctahedron(float[] p_EdgeLength)
	{
		System.out.printf("\n\tEdge Length: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_EdgeLength[0]);
	}
	
	public static void printDodecahedron(float[] p_EdgeLength)
	{
		System.out.printf("\n\tEdge Length: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_EdgeLength[0]);
	}
	
	public static void printIcosahedron(float[] p_EdgeLength)
	{
		System.out.printf("\n\tEdge Length: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_EdgeLength[0]);
	}
	
	public static void printCone(float[] p_Cone)
	{
		System.out.printf("\n\tBase Radius: %.2f \tHeight: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_Cone[0], p_Cone[1]);
	}
	
	public static void printTorus(float[] p_Torus)
	{	
		System.out.printf("\n\tMajor Radius: %.2f \tMinor Radius: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_Torus[0], p_Torus[1]);
	}
	
	public static void printCylinder(float[] p_Cylinders)
	{
		System.out.printf("\n\tBase Radius: %.2f \tHeight: %.2f \tSurface Area: %.2f \tVolume: %.2f", p_Cylinders[0], p_Cylinders[1]);
	}
	
	public static void initializeFromFile( ArrayList<ArrayList<float[]>> p_ShapeLists) throws IOException
	{
		p_ShapeLists.clear();
		p_ShapeLists = new ArrayList<ArrayList<float[]>>(10);
		File file;
		Scanner fileScanner;
		String fileName;
		
		do 
		{
			fileName = Input.getString("\n\tInput file name to read shapes from:");
			file = new File(fileName);
			
			if(!file.exists())
				System.out.println("\n\tERROR: INVALID FILE");
		} while(!file.exists());
		
		fileScanner = new Scanner(file);
		
		while(fileScanner.hasNext())
		{
			String[] tokens = fileScanner.nextLine().split(",");
			
			float[] tempArr = null;
			
			if(shapeNameToIndex(tokens[0]) == -1)
				{
					System.out.println("ERROR: Invalid shape detected");
					continue;
				}
			
			if(tokens.length == 2)
				tempArr = new float[] {Float.parseFloat(tokens[1])};
			else if(tokens.length == 3)
				tempArr = new float[] {Float.parseFloat(tokens[1]), Float.parseFloat(tokens[2])};
			
			p_ShapeLists.get(shapeNameToIndex(tokens[0])).add(tempArr);
			
		}
		p_ShapeLists.add(null);
		
		fileScanner.close();
	}
	
	public static byte shapeNameToIndex(String p_ShapeName)
	{
		switch(p_ShapeName.toLowerCase())
		{
		case "sphere":
			return 0;
		case "hemisphere":
			return 1;
		case "tetrahedron":
			return 2;
		case "hexahedron":
			return 3;
		case "octahedron":
			return 4;
		case "dodecahedron":
			return 5;
		case "icosahedron":
			return 6;
		case "cone":
			return 7;
		case "torus":
			return 8;
		case "cylinder":
			return 9;
		default:
			return -1;
		}
	}
	
	public static String shapeIndexToName(byte p_Index)
	{
		switch(p_Index)
		{
		case 0:
			return "sphere";
		case 1:
			return "hemisphere";
		case 2:
			return "tetrahedron";
		case 3:
			return "hexahedron";
		case 4:
			return "octahedron";
		case 5:
			return "dodecahedron";
		case 6:
			return "icosahedron";
		case 7:
			return "cone";
		case 8:
			return "torus";
		case 9:
			return "cylinder";
		default:
			return null;
		}
	}
	
}
