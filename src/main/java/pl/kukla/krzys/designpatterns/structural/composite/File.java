package pl.kukla.krzys.designpatterns.structural.composite;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
/**
 *
 *  goal of this pattern is to simplify the client code which works with tree data structure
 *  we use Composite when we have tree structure of objects and we want to treat all objects in this hierarchy similarly, uniformly ( jednolicie )
 *  leaf and children objects for composite we treat in similar way, so client does not know what type of object dealing with
 *  whether they have own children or the object is the leaf node in the tree
 *  Leaf is going to provide actual functionality, but Composite class is going to delegate that to its children
 *  the component base class for composite pattern
 *  both leaf and composite will extend from this File class
 *
 */
public abstract class File {
    private String name;

    protected File(String name) {
        this.name = name;
    }

    //this method provides actual functionality that is needed by client
    //ls command to display directory structure
    public abstract void ls();

    //those 3 methods allow to manage composite tree
    public abstract void addFile(File file);

    public abstract File[] getFiles();

    public abstract boolean removeFile(File file);

}
