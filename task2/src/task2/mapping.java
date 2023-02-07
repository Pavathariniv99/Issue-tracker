package task2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class mapping {
public static void main(String[] args) {
List<project> projects = new ArrayList<>();
projects.add(new project("x", 1,"17-2-2022"));
projects.add(new project("y", 2,"17-2-2022"));
projects.add(new project("z", 3,"17-2-2022"));


Map<String, List<employee>> map = new HashMap<String, List<employee>>();

List<employee> xemployees = new ArrayList<employee>();
xemployees.add(new employee("a", 101));
xemployees.add(new employee("b", 102));
xemployees.add(new employee("c", 103));
map.put("x", xemployees);

List<employee> yemployees = new ArrayList<employee>();
yemployees.add(new employee("d", 104));
yemployees.add(new employee("e", 105));
yemployees.add(new employee("f", 106));
map.put("y", yemployees);

List<employee> zemployees = new ArrayList<employee>();
zemployees.add(new employee("g", 107));
zemployees.add(new employee("h", 108));
zemployees.add(new employee("i", 109));
map.put("z", zemployees);

System.out.println(map.get("x"));
System.out.println(map.get("y"));
System.out.println(map.get("z"));



//System.out.println(map.get(projects.get(0).getProjectName()));

}
}

