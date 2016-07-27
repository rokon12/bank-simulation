package com.bazlur.unittesting;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * @author Bazlur Rahman Rokon
 * @since 7/26/16.
 */
public class ProfileTest {

    @Test
    public void test() {
        Profile profile = new Profile("Bazlur Rahman");
        Question question = new BooleanQuestion(1, "Are you fine ? ");
        Criteria criteria = new Criteria();
        Answer criteriaAnswer = new Answer(question, Bool.TRUE);
        Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
        criteria.add(criterion);

        boolean matches = profile.matches(criteria);
        assertFalse(matches);
    }

}