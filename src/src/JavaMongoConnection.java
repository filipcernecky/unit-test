package src;

public class JavaMongoConnection {
	public static void main(String argz[])
	{
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		System.out.println("Done");
		
		List<String> dbs = mongo.getDatabaseNames();
		for(String db : dbs){
			System.out.println(db);
		}
		
		DB db = mongo.getDB("userid");
		DBCollection table = db.getCollection("userpid");
	}
	
}
