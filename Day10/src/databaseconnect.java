interface databaseconnect {
	public abstract void connect();
}

class Mysql implements databaseconnect
{
	public void connect()
	{
		System.out.println("MySql Connected");
	}
}

class mongo implements databaseconnect
{
	public void connect()
	{
		System.out.println("mongo Connected");
	}
}

class oracle implements databaseconnect
{
	public void connect()
	{
		System.out.println("oracle Connected");
	}
}