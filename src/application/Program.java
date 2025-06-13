package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
//		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		Department dp = new Department(1, "computers");
//		Seller seller = new Seller(1, "Kenzo", "kenzo@gmail.com", LocalDate.parse("22/04/2007", sdf), 2500.00, dp);
//		System.out.println(seller);
		SellerDao sellerDao = DaoFactory.createDaoSeller();
		

	}

}
