package collection;

import org.springframework.stereotype.Component;

@Component
public class Entity {

	
private String father;
private String mother;
private String children1;
public Entity(String father, String mother, String children1, String children2) {
	super();
	this.father = father;
	this.mother = mother;
	this.children1 = children1;
	this.children2 = children2;
}

@Override
public String toString() {
	return "Entity [father=" + father + ", mother=" + mother + ", children1=" + children1 + ", children2=" + children2
			+ "]";
}
public String getFather() {
	return father;
}
public void setFather(String father) {
	this.father = father;
}
public String getMother() {
	return mother;
}
public void setMother(String mother) {
	this.mother = mother;
}
public String getChildren1() {
	return children1;
}
public void setChildren1(String children1) {
	this.children1 = children1;
}
public String getChildren2() {
	return children2;
}
public void setChildren2(String children2) {
	this.children2 = children2;
}
private String children2;
	
	
	
	
	
	
	
}
