package pl.kukla.krzys.designpatterns._2_structural._15_composite.test;

import org.junit.jupiter.api.Test;
import pl.kukla.krzys.designpatterns._2_structural._15_composite.BinaryFileLeaf;
import pl.kukla.krzys.designpatterns._2_structural._15_composite.Directory;
import pl.kukla.krzys.designpatterns._2_structural._15_composite.File;

import java.util.ArrayList;

/**
 * we use Composite when we have tree structure of objects and we want to treat all objects in this hierarchy similarly, uniformly ( jednolicie )
 * they have own children or the object is the leaf node in the tree
 */
public class CompositeTest {

    @Test
    void treeStructureWithComposite() throws Exception {
        File root = createTreeWithDirectory();
        root.ls();
    }

    @Test
    void onlyLeaf() throws Exception {
        File root = createOnlyLeaf();
        root.ls();

    }

    private File createOnlyLeaf() {
        return new BinaryFileLeaf("Another file", 200);
    }

    private File createTreeWithDirectory() {
        File file1 = new BinaryFileLeaf("file1", 1000);
        File directory1 = new Directory("directory1", new ArrayList<>());
        directory1.addFile(file1);

        File file2 = new BinaryFileLeaf("file2", 2000);
        File file3 = new BinaryFileLeaf("file3", 150);
        File directory2 = new Directory("directory2", new ArrayList<>());
        directory2.addFile(file2);
        directory2.addFile(file3);
        directory2.addFile(directory1);
        return directory2;
    }

}
