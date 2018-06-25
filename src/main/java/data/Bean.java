package data;

import request.Users;

import java.util.ArrayList;
import java.util.List;

public class Bean {
    public static List<Users> ExportUsers(){
        List<Users> list = new ArrayList<Users>();

        Users u1 = new Users("huynh","nguyen");
        Users u2 = new Users("minh","an");

        list.add(u1);
        list.add(u2);

        return list;
    }
}
