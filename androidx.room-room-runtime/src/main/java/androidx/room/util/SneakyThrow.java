//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package androidx.room.util;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class SneakyThrow {
    public static void reThrow(@NonNull Exception e) {
        try {
            sneakyThrow(e);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static <E extends Throwable> void sneakyThrow(@NonNull Throwable e) throws E {
        try {
            throw e;
        } catch (Throwable throwable) {
                throwable.printStackTrace();
        }
    }

    private SneakyThrow() {
    }
}
