package ex2;

public class MotDico {
private int num;
private String mot;
private String definition;

String getMot()
{
	return this.mot;
}
String getDefinition()
{
	return this.definition;
}
void setDefinition(String s)
{
	this.definition=s;
}
void setMot(String s)
{
	this.mot=s;
}
boolean synonym(MotDico m)
{
	if(m.equals(this.mot)) {
		return true;
	}
	else
	{
		return false;
	}
}

}
