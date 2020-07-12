package pl.kukla.krzys.designpatterns.structural.composite;

import java.util.List;

/**
 * Composite class
 */
public class Directory extends File {

    private final List<File> children;

    public Directory(String name, List<File> children) {
        super(name);
        this.children = children;
    }

    @Override
    public void ls() {
        System.out.println(getName());
        children.forEach((file -> file.ls()));
    }

    @Override
    public void addFile(File file) {
        children.add(file);
    }

    @Override
    public File[] getFiles() {
        children.toArray(new File[children.size()]);
        return new File[0];
    }

    @Override
    public boolean removeFile(File file) {
        return children.remove(file);
    }

}
