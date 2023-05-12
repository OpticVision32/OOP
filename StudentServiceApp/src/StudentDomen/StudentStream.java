package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> group;

    public StudentStream(List<StudentGroup> group) {
        this.group = group;
    }

    public List<StudentGroup> getGroup() {
        return group;
    }

    public void setGroup(List<StudentGroup> group) {
        this.group = group;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;
            @Override
            public boolean hasNext(){
                return index < group.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return group.get(index++);        
            }
        };
    }
    
    @Override
    public String toString() {
        return "Group{" 
                
                +"firstName=" +this.getGroup();
    }
    

}
