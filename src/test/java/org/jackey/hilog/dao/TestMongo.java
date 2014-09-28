package org.jackey.hilog.dao;

import java.net.UnknownHostException;
import java.util.Set;

import org.junit.Test;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

public class TestMongo {
	@Test
	public void testMongo1(){
		String myUserName = "root";  
		String myPassword = "root";  
		MongoClient mongoClient;
		try {
			mongoClient = new MongoClient("10.88.48.121", 27017);
			DB db = mongoClient.getDB("test");
			System.out.println("Connect to database successfully");
			boolean auth = db.authenticate(myUserName, myPassword.toCharArray());
			System.out.println("Authentication: "+auth);
			Set<String> colls = db.getCollectionNames();
			for (String s : colls) {
				System.out.println(s);
			}
			
			DBCollection coll = db.getCollection("mycol");
//	         System.out.println("Collection mycol selected successfully");
//	         BasicDBObject doc = new BasicDBObject("title", "MongoDB").
//	            append("description", "database").
//	            append("likes", 100).
//	            append("url", "http://www.w3cschool.cc/mongodb/").
//	            append("by", "w3cschool.cc");
//	         coll.insert(doc);
//	         System.out.println("Document inserted successfully");
			
			DBCursor cursor = coll.find();
	         int i=1;
	         while (cursor.hasNext()) { 
	            System.out.println("Inserted Document: "+i); 
	            System.out.println(cursor.next()); 
	            i++;
	         }
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}  


	}
}
