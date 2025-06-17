package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao dd = DaoFactory.createDaoDepartment();
		System.out.println("---- TEST 1: department findById -----");
		System.out.println(dd.findById(2));

		System.out.println("\n---- TEST 2: department findAll -----");
		List<Department> list = new ArrayList<>();
		list = dd.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
//
//		System.out.println("\n---- TEST 3: department insert -----");
//		System.out.println("New department: ");
//		String name = sc.nextLine();
//		Department dep = new Department(null, name);
//		dd.insert(dep);
//		list = dd.findAll();
//		for (Department obj : list) {
//			System.out.println(obj);
//		}

		System.out.println("\n---- TEST 3: department update -----");
		Department dep = new Department();
		dep = dd.findById(1);
		dep.setName("Computers");
		dd.update(dep);
		

		System.out.println("\n---- TEST 3: department update -----");
		dd.deleteById(1);

	}

}
