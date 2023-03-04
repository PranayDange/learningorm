package com.lcwd.orm;

import com.lcwd.orm.entities.Category;
import com.lcwd.orm.entities.Product;
import com.lcwd.orm.repositories.CategoryRepo;
import com.lcwd.orm.repositories.ProductRepo;
import com.lcwd.orm.repositories.StudentRepository;
import com.lcwd.orm.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
//public class LearningormApplication {
public class LearningormApplication implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(LearningormApplication.class);
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private UserService userService;

    //main is a static method and UserServic is not satatic
    //therefore we are using/implementing CommandLineRunner
    public static void main(String[] args) {
        SpringApplication.run(LearningormApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

      /*  //save user
        UserEntity user = new UserEntity();
        user.setName("pranay");
        user.setCity("pune");
        user.setAge(24);
        UserEntity savedUser = userService.saveUser(user);
        logger.info("Saved Users : {}", savedUser);
        System.out.println(savedUser);*/

        //get all user
       /* List<UserEntity> allUser = userService.getAllUser();
        logger.info("All User {}", allUser);
        logger.info("All User {}", allUser.size());*/

        /*//get single user
        UserEntity singleUser = userService.getUser(3);
        logger.info("Single User is: {}", singleUser);*/

        //update user
     /*   UserEntity user = new UserEntity();
        user.setName("maya");
        user.setCity("chandrapur");
        user.setAge(25 );
        UserEntity updateEntity = userService.updateUser(user, 2);
        logger.info("user update : {}", updateEntity);*/

        //delete user
        //  userService.deleteUser(1);


        //OneToOne Mapping

      /*  Student student = new Student();
        student.setStudentId(3);
        student.setStudentName("mayur");
        student.setAbout("Engineer");


        Laptop laptop = new Laptop();
        laptop.setLaptopId(11);
        laptop.setModelNumber("m2 chip");
        laptop.setBrand("apple");
        laptop.setStudent(student);
        student.setLaptop(laptop);
        Student save = studentRepository.save(student);
        logger.info("student saved {}", student);*/

      /*  Student student = studentRepository.findById(2).get();
        logger.info("get student {}", student.getStudentName());

        Laptop laptop = student.getLaptop();
        logger.info("laotop {},{}", laptop.getModelNumber(), laptop.getBrand());*/


    /*    //onetomany
        Student student = new Student();
        student.setStudentId(3);
        student.setStudentName("jhon");
        student.setAbout("Engineer");

        Address a1 = new Address();
        a1.setAddressId(21);
        a1.setStreet("street 1");
        a1.setCity("new york");
        a1.setCountry("usa");
        a1.setStudentt(student);


        Address a2 = new Address();
        a2.setAddressId(22);
        a2.setStreet("street 12");
        a2.setCity("nmaha");
        a2.setCountry("usa");
        a2.setStudentt(student);

        List<Address> addressList = new ArrayList<>();
        addressList.add(a1);
        addressList.add(a2);

        student.setAddressList(addressList);
        Student save = studentRepository.save(student);
        logger.info("save student one to many  : {}",save);*/

        Product product1 = new Product();
        product1.setpId("pId1");
        product1.setProductName("Iphone 14 max pro");

        Product product2 = new Product();
        product2.setpId("pId2");
        product2.setProductName("samsung f20");

        Product product3 = new Product();
        product3.setpId("pId3");
        product3.setProductName("moto g4");


        Category category1 = new Category();
        category1.setcId("cId1");
        category1.setTitle("Electronicd");

        Category category2 = new Category();
        category2.setcId("cId2");
        category2.setTitle("mobile phone");

        Category category3 = new Category();
        category3.setcId("cId3");
        category3.setTitle("Electronicd");


        List<Product> category1Products = category1.getProducts();
        category1Products.add(product1);
        category1Products.add(product2);
        category1Products.add(product3);

        List<Product> category2Products = category2.getProducts();
        category2Products.add(product1);
        category2Products.add(product2);

        categoryRepo.save(category1);
        categoryRepo.save(category2);
    }

    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private ProductRepo productRepo;
}
