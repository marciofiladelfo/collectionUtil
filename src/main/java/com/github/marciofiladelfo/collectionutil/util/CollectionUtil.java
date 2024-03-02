package com.github.marciofiladelfo.collectionutil.util;

import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.function.Predicate;

@NoArgsConstructor
public class CollectionUtil {

    public static boolean removeElement(Collection<String> collection, Predicate<String> filter) {
        return collection.removeIf(filter);
    }
}
