package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("=== TEST 1: seller findById=====");
		SellerDao sellerDao = DaoFactory.createDaoSeller();
		System.out.println(sellerDao.findById(3));

		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(3, null);
		List<Seller> list1 = sellerDao.findByDepartment(department);
		for (Seller obj : list1) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: seller findAll=====");
		List<Seller> list2 = sellerDao.findAll();
		for (Seller obj : list2) {
			System.out.println(obj);
		}

//		System.out.println("\n=== TEST 3: seller insert=====");
		Seller seller = new Seller(null, "Gustavo Kenzo", "sgkenzo212007@gmail.com", LocalDate.parse("21/04/2007", sdf),
				5000.0, department);
//		sellerDao.insert(seller);
//		List<Seller> list3 = sellerDao.findAll();
//		for (Seller obj : list3) {
//			System.out.println(obj);
//		}
		System.out.println("\n=== TEST 5: seller update=====");
		seller = sellerDao.findById(8);
		seller.setName("Gustavo Kenzo");
		sellerDao.update(seller);
		
	}

}
