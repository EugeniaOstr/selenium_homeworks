package HW10;

import java.lang.annotation.*;

/**
 * Created by eugeniafedorova on 3/26/17.
 */

    @Target(value = ElementType.METHOD)
    @Retention(value = RetentionPolicy.RUNTIME)
    public @interface TestCase{
        String testCaseId();
    }


