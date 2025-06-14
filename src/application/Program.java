package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] args) {
		SellerDao sd = DaoFactory.createDaoSeller();
		System.out.println(sd.findById(3));
		
	}

}
