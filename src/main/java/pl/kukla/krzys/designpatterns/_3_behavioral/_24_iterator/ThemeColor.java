package pl.kukla.krzys.designpatterns._3_behavioral._24_iterator;

public enum ThemeColor {
    BLACK, RED, GREEN, BLUE;

    public static Iterator<ThemeColor> getIterator() {
        return new ThemeColorIterator();
    }

    /**
     * Whenever we want to iterate collection or we want to have sequential access to elements
     * Mainly used for collection, but we can use it for resources, files, network etc.
     * Iterator allows to check if element is available to consume and provides next or previous element to the Client
     * we can provide access to the next or previous element in the collection
     * Typically it is really rare ( rzadko ) when we have to implement Iterator ourselves, because Iterators are provided by JDK and are integral part
     * of collection java.util.Iterator, but we can implement it ourselves ( sami )
     * Iterators are stateful ( z aktualnym stanem ) that means remembers current element and position in collection
     * in minimal version has 'hasNext()' and 'next()' methods
     * but should always hide Iterator class from Client class, so we should implement Iterator as a inner class inside ThemeColor, because we
     * don't want to expose Iterator outside
     */
    private static class ThemeColorIterator implements Iterator<ThemeColor> {
        private int position;

        @Override
        public boolean hasNext() {
            return position < ThemeColor.values().length;
        }

        @Override
        public ThemeColor next() {
            return ThemeColor.values()[position++];
        }

    }
}
