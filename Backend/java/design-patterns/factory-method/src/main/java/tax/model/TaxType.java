package main.java.tax.model;

import java.util.function.Supplier;

public enum TaxType {

    ICMS {
        @Override
        public Supplier<Tax> getConstructor() {
            return (ICMSTax::new);
        }
    },
    INSS {
        @Override
        public Supplier<Tax> getConstructor() {
            return (INSSTax::new);
        }
    };

    public abstract Supplier<Tax> getConstructor();
}
