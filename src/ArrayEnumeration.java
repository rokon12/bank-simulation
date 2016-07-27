import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * Created by rokon on 7/20/16.
 */
public class ArrayEnumeration<ElementType> implements Enumeration<ElementType> {

    private ElementType[] elementTypes;

    private int index = 0;

    public ArrayEnumeration(ElementType[] elementTypes) {
        this.elementTypes = elementTypes;
    }

    @Override
    public boolean hasMoreElements() {
        return (elementTypes.length > index);
    }

    @Override
    public ElementType nextElement() throws NoSuchElementException {
        if (index >= elementTypes.length) throw new NoSuchElementException("Array index: " + index);
        ElementType elementType = elementTypes[index];
        index++;
        return elementType;
    }

    public static void main(String[] args) {
        ArrayEnumeration<Status> enumeration = new ArrayEnumeration<>(Status.values());
        while (enumeration.hasMoreElements()){
            Status status = enumeration.nextElement();
            System.out.println(status.name());
        }
    }
}
