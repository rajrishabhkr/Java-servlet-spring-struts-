package mypack;
public class LoginAction
{
  String name,password;
 
  public String getName()
  {
    return name;
  }

  public void setName(String name) 
  {
    this.name = name;
  }

  public String getPassword() 
  {
    return password;
  }

  public void setPassword(String password) 
  {
    this.password = password;
  }
  public String execute()
  {
    if(name.startsWith("a") && password.startsWith("b"))
	return "success";
	else
	return "failure";
  }
}
