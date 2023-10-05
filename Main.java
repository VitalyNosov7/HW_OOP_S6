package homework;

import homework.Controller.Controller;
import homework.Model.User;

//  Реструктуризировать проект homework с учетом теоретических основ SOLID.
public class Main{
    public static void main(String[] args){
        User user1 = new User("Фёдор");
        Controller user1Controller = new Controller(user1);
        user1Controller.addReport(user1);
    }
}