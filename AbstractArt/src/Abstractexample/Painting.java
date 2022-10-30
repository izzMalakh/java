package Abstractexample;

public class Painting extends AbstractArt{
private String paintType;
public Painting(String paintType) {
	super();
	this.paintType = paintType;
}
@Override
void viewArt() {
	this.title= "this is art";
	System.out.println("Painting art!");
	
}



public String getPaintType() {
	return paintType;
}

public void setPaintType(String paintType) {
	this.paintType = paintType;
}
}
