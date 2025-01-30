import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- TEST 1: seller findById ----");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n---- TEST 2: seller findByDepartment ----");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n---- TEST 3: seller findAll ----");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("\n---- TEST 4: seller insert ----");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.parse("03/01/2000", fmt), 4000.0, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserido! novo id: " + newSeller.getId());

        System.out.println("\n---- TEST 5: seller update ----");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update complete");

        System.out.println("\n---- TEST 6: seller delete ----");
        System.out.println("insira um o id do vendedor que deseja deletar: ");
        int id = scanner.nextInt();
        sellerDao.deleteById(id);
        System.out.println("vendedor deletado.");

        scanner.close();
    }
}