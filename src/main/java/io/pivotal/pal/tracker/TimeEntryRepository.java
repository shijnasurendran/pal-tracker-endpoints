package io.pivotal.pal.tracker;

public interface TimeEntryRepository {

    TimeEntry create(TimeEntry timeEntry);
    TimeEntry find(long id);
    TimeEntry update(long id, TimeEntry timeEntry);
    TimeEntry delete(long id);
    TimeEntry list();

}
