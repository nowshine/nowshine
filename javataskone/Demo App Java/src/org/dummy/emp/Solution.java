package org.dummy.emp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {
	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// int id = Integer.valueOf(bf.readLine());
		int i = 0;
		while (i < 3) {
			i++;
			String name = bf.readLine();
			String emailId = bf.readLine();
			long phone = Long.valueOf(bf.readLine());
			Emp emp = new Emp(name, emailId, phone);
			// System.out.println("id:" + emp.getId());
			System.out.println("name:" + emp.getName());
			System.out.println("emailId:" + emp.getEmailId());
			System.out.println("Phone:" + emp.getPhone());
			session.save(emp);
		}
		session.getTransaction().commit();
		session.close();
	}
}
