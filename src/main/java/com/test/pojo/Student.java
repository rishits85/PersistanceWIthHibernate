package com.test.pojo;

public class Student implements java.io.Serializable {

	    private int Id;
		private String Name;
		private String Order;
		
		public Student() {
			super();
		}
		
		public int getId() {
			return Id;
		}



		public void setId(int id) {
			Id = id;
		}



		public String getName() {
			return Name;
		}



		public void setName(String name) {
			Name = name;
		}



		public String getOrder() {
			return Order;
		}



		public void setOrder(String order) {
			Order = order;
		}



		public Student(int id, String name, String order) {
			super();
			Id = id;
			Name = name;
			Order = order;
		}



	
		
		
		
}