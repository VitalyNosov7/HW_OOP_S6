package homework.Model;

import homework.Model.User;
import homework.View.View;

public class Persister{
    private final User user;


    public Persister(User user){
        this.user = user;
    }

    public void save(){
        View.printResult("Save user: " + user.getName());
    }
}
