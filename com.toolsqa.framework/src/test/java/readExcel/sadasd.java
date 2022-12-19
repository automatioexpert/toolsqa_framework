package readExcel;

import Factory.DataProviderFactory;

public class sadasd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(DataProviderFactory.getExcelConfig().getData("Login", 0, 0));
		System.out.println(DataProviderFactory.getExcelConfig().getData("Login", 0, 1));
		System.out.println(DataProviderFactory.getExcelConfig().getData("Login", 0, 2));

	}

}
