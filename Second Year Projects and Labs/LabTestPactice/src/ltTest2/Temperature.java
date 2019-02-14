package ltTest2;

public class Temperature {
public static final String CELCIUS = "C";
public static final String FAHRENHEIT = "F";

private double degC;
private double degF;
private String units;

public Temperature()
{
this(0.0,Temperature.CELCIUS);
}
public Temperature(Temperature other)
{
	this(other.getTemperature(), other.getUnits());
}
public Temperature(double temp, String units) {
	this.setTemperature(temp);
	this.setUnits(units);
}
public double getTemperature()
{
	if (this.units.equals(Temperature.CELCIUS)) {
        return this.degC;
    }
    return this.degF;
	
}
public final void setTemperature(double temp)
{ if(this.units.equals(Temperature.CELCIUS))
{
	this.degC =  temp;
}
else 
	this.degF = temp;
}
public String getUnits()
{
	return this.units;
}
public final void setUnits(String units)
{	
	if(!units.equals(Temperature.CELCIUS) && !units.equals(Temperature.FAHRENHEIT))
		{
		throw new IllegalArgumentException();
		}
	this.units = units;
}
public static double toCelcius(double degF)
{
	 return (degF-32.0) * (5.0/9.0);
}
public static double toFahrenheit(double degC)
{
	 	return degC * (9.0/5.0) +32;
}
public String toString()
{
	if (this.getUnits().equals(Temperature.CELCIUS)) {
		return this.getTemperature() + Temperature.CELCIUS;
	}
	else
	return this.getTemperature()  + Temperature.FAHRENHEIT;
}
@Override
public boolean equals(Object obj)
{  
	if (this == obj)
	{
		return true;
	}
	if (obj == null)
	{
		return false;
				}
	if (getClass() != obj.getClass()) {
		return false;
	}
		Temperature other  = (Temperature) obj;
	if(Double.doubleToLongBits(this.degC) != Double.doubleToLongBits(other.degC)){
		return false;
		
	}
	return true;
}
}
