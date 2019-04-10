
package observerpattern;

/**
 *
 * @author bystr
 */
public class TestClass {
    public static void main(String[] args) {
        JobSite js = new JobSite();
        js.addVacancy("EPAM Java Developer");
        js.addVacancy("Haulmont (Sherlock)");
        
        Observer firstSub = new Subscriber("Jake a Dog");
        Observer secondSub = new Subscriber("Finn the Human");
        
        js.addObserver(firstSub);
        js.addObserver(secondSub);
        
        //now all subscribers should be notified
        js.addVacancy("SBT Java junior Developer");
        
    }
}
