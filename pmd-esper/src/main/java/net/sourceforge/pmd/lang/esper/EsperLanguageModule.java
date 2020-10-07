/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.esper;

import net.sourceforge.pmd.lang.BaseLanguageModule;

/**
 * Language Module for Go.
 */
public class EsperLanguageModule extends BaseLanguageModule {

    /** The name. */
    public static final String NAME = "Esper";
    /** The terse name. */
    public static final String TERSE_NAME = "esper";

    /**
     * Create a new instance of Golang Language Module.
     */
    public EsperLanguageModule() {
        super(NAME, null, TERSE_NAME, "go");
        addVersion("1", null, true);
    }
}
