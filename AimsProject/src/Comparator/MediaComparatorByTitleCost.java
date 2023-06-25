
package AimsProject.Comparator;

import AimsProject.Media.Media;
import java.util.Comparator;

public class MediaComparatorByTittleCost implements Comparator<Media>{   

    @Override
    public int compare(Media o1, Media o2) {
        int comp  = o1.getTitle().compareTo(o2.getTitle());
        
        if(comp == 0){
            return Float.compare(o1.getCost(), o2.getCost());
        }
        
        return comp;
    }
     
}
