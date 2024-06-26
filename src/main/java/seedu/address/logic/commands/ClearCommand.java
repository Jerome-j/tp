package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;

import seedu.address.model.Model;
import seedu.address.model.PatientList;
import seedu.address.model.appointment.AppointmentList;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "All the data in CogniCare has been cleared!";


    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        assert model != null : "Model should not be null.";

        model.setPatientList(new PatientList());
        model.setAppointmentList(new AppointmentList());

        return new CommandResult(MESSAGE_SUCCESS);
    }
}
