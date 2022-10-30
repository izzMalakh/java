package Abstractexample;

public class Sculpture extends AbstractArt {
private String Material;

public Sculpture(String material) {
	super();
	Material = material;
}

@Override
void viewArt() {
	this.title= "this is art";
	System.out.println("Sculpture art");
	
	
}

public String getMaterial() {
	return Material;
}

public void setMaterial(String material) {
	Material = material;
}

}
