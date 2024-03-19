package seedu.address.model.person;


import java.util.List;
import java.util.function.Predicate;

import seedu.address.commons.util.StringUtil;

/**
 * Tests that a {@code Person}'s {@code Email} matches a part of the keywords given.
 */
public class StudentIdPredicate implements Predicate<Person> {
    private final int studentId;

    public StudentIdPredicate(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean test(Person person) {
        return person.getSid() == studentId;
    }

    // TODO: Override toString and equals
}
