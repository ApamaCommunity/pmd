/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.cpd;

import java.util.Properties;

import org.junit.Test;

import net.sourceforge.pmd.cpd.test.CpdTextComparisonTest;

public class EsperTokenizerTest extends CpdTextComparisonTest {

    public EsperTokenizerTest() {
        super(".esper");
    }

    @Override
    public Tokenizer newTokenizer(Properties properties) {
        return new EsperTokenizer();
    }

    @Override
    protected String getResourcePrefix() {
        return "../lang/esper/cpd/testdata";
    }

    @Test
    public void simpleTest() {
        doTest("hello");
    }

}
