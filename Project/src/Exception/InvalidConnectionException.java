package Exception;

public class InvalidConnectionException extends Exception{
public String toString()
{
return "Invalid ConnectionType";
}
public InvalidConnectionException()
{
super();
}
}
