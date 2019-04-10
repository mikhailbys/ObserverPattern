
package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bystr
 */
public class JobSite implements Observed{
    // vacancies
    List<String> vacancies = new ArrayList<>();
    //subscribers
    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }
    
    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }
    
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: subscribers)
        {
            observer.HandleEvent(this.vacancies);
        }
    }
}
