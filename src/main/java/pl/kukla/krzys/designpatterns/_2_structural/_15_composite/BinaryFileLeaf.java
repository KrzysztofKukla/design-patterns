package pl.kukla.krzys.designpatterns._2_structural._15_composite;

/**
 * Leaf in composite design pattern
 */
public class BinaryFileLeaf extends File {

    //it represents size of our File
    private final long size;

    public BinaryFileLeaf(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf does not support addFile() operation");
    }

    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf does not support getFiles() operation");
    }

    @Override
    public boolean removeFile(File file) {
        throw new UnsupportedOperationException("Leaf does not support removeFile() operation");
    }

}
