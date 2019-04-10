
package observerpattern;

import java.util.List;

/**
 *
 * @author bystr
 */
public interface Observer {
    
    public void HandleEvent(List<String> vacancy);
    
}
