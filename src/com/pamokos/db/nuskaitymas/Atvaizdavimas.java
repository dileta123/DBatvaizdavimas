package com.pamokos.db.nuskaitymas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Created by Max on 2017.03.13.
 */
public class Atvaizdavimas {
    public Atvaizdavimas() {

        while (true) {
            Scanner sk = new Scanner(System.in);
            System.out.println("studentai = 1   studentų adresai = 2  studentų pažymiai = 3 ");
            int duombaze = sk.nextInt();
            switch (duombaze) {
                case 1:
                    try {
                        Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/kcs",
                                "root",
                                "");


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


                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;

                case 2:
                    try {
                        Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/kcs",
                                "root",
                                "");


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
                    break;

                case 3:
                    try {
                        Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/kcs",
                                "root",
                                "");


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
                        // statement.executeUpdate("UPDATE students set name='Naujas' where id=1");
                        //  System.out.println(statement);

                        //  statement.executeQuery("SELECT * FROM `student`");


                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
            }


        }


       /* try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kcs",
                    "root",
                    "");


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
            statement.executeUpdate("UPDATE students set name='Naujas' where id=1");
            System.out.println(statement);

            statement.executeQuery("SELECT * FROM `student`");


        } catch (Exception e) {
            System.out.println(e);
        }
*/

    }
}
