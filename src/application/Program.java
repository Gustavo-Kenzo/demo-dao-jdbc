package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		System.out.println("=== TEST 1: seller findById=====");
		SellerDao sellerDao = DaoFactory.createDaoSeller();
		System.out.println(sellerDao.findById(3));
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(1, null);
		List<Seller> list1 = sellerDao.findByDepartment(department);
		for (Seller obj : list1) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 3: seller findAll=====");
		
		List<Seller> list2 = sellerDao.findAll();
		for (Seller obj : list2) {
			System.out.println(obj);
		}
		
	}

}
