package com.pamokos.db.nuskaitymas;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by Max on 2017.03.13.
 */
public class Atvaizdavimas {
    private Connection connection;

    public Atvaizdavimas() {
        try {
             connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/studentai",
                    "root",
                    "");
        } catch (Exception klaida) {

        }
    }

    public void paklausk() {
        System.out.println("Duombazės lentelės ");
        System.out.println("Studentai = 1 ");
        System.out.println("Studentų adresai = 2 ");
        System.out.println("Studenų pažymiai = 3 ");

    }

    public void nuspresk() {
        Scanner sk = new Scanner(System.in);
        int pasirinkimas = sk.nextInt();
        switch (pasirinkimas) {
            case 1:
                lentele1();
                break;
            case 2:
                lentele2();
                break;
            case 3:
                lentele3();
                break;


        }
    }

    private void lentele1() {

        try {
            System.out.println("Pasirinkote studentai = 1 ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `students`");


            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print("|");
                System.out.print(resultSet.getString("name"));
                System.out.print("|");
                System.out.print(resultSet.getString("surname"));
                System.out.println("");


            }
            // statement.executeUpdate("UPDATE students set name='Naujas' where id=1");
            //  System.out.println(statement);

            //  statement.executeQuery("SELECT * FROM `student`");


        } catch (Exception eror) {
             System.out.println(eror);
        }
    }


    private void lentele2() {
        try {
            System.out.println("Pasirinkote studentų adresai : 2 ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `student_adress`");


            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print("|");
                System.out.print(resultSet.getString("country"));
                System.out.print("|");
                System.out.print(resultSet.getString("city"));
                System.out.println("");
                System.out.print(resultSet.getString("street"));
                System.out.print("|");
                System.out.print(resultSet.getString("post_code"));
                System.out.print("|");
                System.out.print(resultSet.getInt("student_id"));
                System.out.println("");


            }
            //  statement.executeUpdate("UPDATE students set name='Naujas' where id=1");
            //  System.out.println(statement);

            //  statement.executeQuery("SELECT * FROM `student`");


        } catch (Exception e) {
            System.out.println(e);
        }
    }


    private void lentele3() {

        try {

            System.out.print("Pasirinkote Studentų pažymiai : 3 ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `student_marks`");


            while (resultSet.next()) {
                System.out.print(resultSet.getInt("id"));
                System.out.print("|");
                System.out.print(resultSet.getInt("student_id"));
                System.out.print("|");
                System.out.print(resultSet.getString("title"));
                System.out.print("|");
                System.out.print(resultSet.getInt("marks"));
                System.out.print("|");
                System.out.print(resultSet.getDate("time_stamp"));
                System.out.println("");


            }
        }catch (Exception Eror){
                System.out.println(Eror);
        }
    }
}

