package homework.Model;

import homework.Model.User;
import homework.View.View;

//  Отчет пользователя
public class Report {
    private final User user;

    public Report(User user){
        this.user = user;
    }

    public void report(){
        View.printResult("Report for user: " + user.getName());
    }
}
