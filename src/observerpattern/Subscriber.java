
package observerpattern;

import java.util.List;

/**
 *
 * @author bystr
 */

// here's our observer
public class Subscriber implements Observer{
    
    String name;
    
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void HandleEvent(List<String> vacancies) {
        System.out.println("Hey, " + name + ".We now have some changes in vacancies!\n" + vacancies + "\n==========================\n");
    }
    
}
