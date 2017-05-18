import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

/**
 * Created by Hari Rao on 18/05/17.
 */
public class FirstMongoDBJavaExample {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient(new ServerAddress("localhost",27017));
        MongoDatabase firstMongoDatabase = mongoClient.getDatabase("my_First_mongoDB");
        MongoCollection mongoCollection = firstMongoDatabase.getCollection("firstMongoDB");
        try(MongoCursor cursor = mongoCollection.find().iterator()) {
            while(cursor.hasNext()) {
                System.out.println(cursor.next());
            }
        }
    }
}
