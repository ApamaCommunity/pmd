/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

/**
 * @author oinume@gmail.com
 */
public class EsperLanguage extends AbstractLanguage {

    public EsperLanguage() {
        super("Esper", "esper", new EsperTokenizer(), ".esper");
    }
}
