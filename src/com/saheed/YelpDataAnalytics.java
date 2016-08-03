package com.saheed;
import org.apache.spark.sql.*;
import org.apache.spark.*;


public class YelpDataAnalytics {
	
	
	public static void main(String[] args){
	
	SparkSession spark = SparkSession.builder().appName("Yelp Data analytics").getOrCreate();
	//SparkContext sc = new SparkContext();
	
	Dataset<Row> df = spark.read().json("/home/saheed/Documents/Yelp/yelp_academic_dataset_review.json");
	
	
	df.printSchema();
	System.out.println("The total number of records are " + df.count());
	
	}
	

}
