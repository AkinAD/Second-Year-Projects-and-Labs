package ltTest2;

public class Weight {
public static final String KG = "kg";
public static final String LB = "lb";
public static final double KG_Per_LB = 0.45359237;

private double kg;
private double lb;
private String units;

public Weight() {
this(0.0,Weight.KG);
}
public Weight(Weight other) {
	this(other.get(), other.getUnits());
}
public Weight(double wt, String units) {
	this.set(wt);
		this.setUnits(units);
	
}
public double get()
{ if(this.getUnits().equals(KG)) {
	return this.kg;
}
else
	return this.lb;
}
public final void set(double wt) {
	if (wt < 0 )
	{
		throw new IllegalArgumentException(" i know you wish you were'nt as fat but bitch when is weight ever negative?");
	}
	if(this.getUnits().equals(KG)) {
	this.kg = wt;
	this.lb = Weight.toPounds(wt);
	}
	else {
		this.lb = wt;
		this.kg =  Weight.toKilograms(wt);
	}
}
public String getUnits() {
	
	return this.units;
}
public final void setUnits(String units){
	if(!units.equals(KG) || !units.equals(LB)) {
		throw new IllegalArgumentException("nah sorry, we only now punds and kilograms ma dood");
	}
	this.units = units;
}
public static double toPounds(double kg) {
	return kg/Weight.KG_Per_LB;
}
public static double toKilograms(double lb) {
	return lb*Weight.KG_Per_LB;
}
@Override
public String toString() 
{
	if(units.equals(Weight.KG) ) 
	{
		return this.kg + " " +  Weight.KG;
	}
	else {
	return this.lb + " " +  Weight.LB;
 }
}
@Override
public boolean equals(Object obj)
{ if (this == obj)
return true;
if (obj == null)
	return false;
if (this.getClass() != obj.getClass())
	return false;
	Weight s = (Weight)obj;
 if(Double.doubleToLongBits(this.kg) !=  Double.doubleToLongBits(s.kg)) {
 return false;
 }
	return true;
}
}
