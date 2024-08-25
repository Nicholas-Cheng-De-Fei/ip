/**
 * This class defines and prodides functionality for a deadline task.
 * <p>
 * A deadline task has an end date.
 */
public class DeadlineTask extends Task {

    /** When the deadline is due */
    private String dueDate;

    /**
     * Creates an deadline task object based on its description and due date.
     * @param description The description of the deadline
     * @param dueDate When the deadline is due
     */
    DeadlineTask(String description, String dueDate) {

        super(description);
        this.dueDate = dueDate;
    }

    @Override
    public String toCSVFormat(){
        
        return "DEADLINE," + super.toCSVFormat() + "," + this.dueDate;
    }

    @Override
    public String toString() {

        return "[D]" + super.toString() + "(Due by: " + this.dueDate + ")";
    }
}
