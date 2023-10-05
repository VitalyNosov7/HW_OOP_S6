package homework.Controller;

import homework.Model.Persister;
import homework.Model.Report;
import homework.Model.User;

public class Controller {
    private final User user;

    public Controller(User user){
        this.user = user;
    }
    public void addReport(User user){
        Report userReport = new Report(user);
        userReport.report();
        Persister userSaving = new Persister(user);
        userSaving.save();
    }
}
