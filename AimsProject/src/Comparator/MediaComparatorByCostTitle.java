
package AimsProject.Comparator;

import AimsProject.Media.Media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
    @Override
    public int compare(Media o1, Media o2) {
       int comp = Float.compare(o1.getCost(), o2.getCost());
       
       if(comp == 0){
           return o1.getTitle().compareTo(o2.getTitle());
       }
       
       return comp;
    }
    
}
